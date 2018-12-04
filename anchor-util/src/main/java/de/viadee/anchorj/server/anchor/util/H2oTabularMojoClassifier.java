package de.viadee.anchorj.server.anchor.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.viadee.anchorj.ClassificationFunction;
import de.viadee.anchorj.server.anchor.PredictException;
import de.viadee.anchorj.server.api.exceptions.DataAccessException;
import de.viadee.anchorj.server.h2o.util.H2oDownload;
import de.viadee.anchorj.server.h2o.util.H2oMojoDownload;
import de.viadee.anchorj.tabular.AnchorTabular;
import de.viadee.anchorj.tabular.TabularFeature;
import de.viadee.anchorj.tabular.TabularInstance;
import hex.genmodel.ModelMojoReader;
import hex.genmodel.MojoModel;
import hex.genmodel.MojoReaderBackend;
import hex.genmodel.MojoReaderBackendFactory;
import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.prediction.AbstractPrediction;
import water.bindings.H2oApi;

public class H2oTabularMojoClassifier implements ClassificationFunction<TabularInstance> {
    private static final long serialVersionUID = -5889212341625113792L;

    private static final Logger LOG = LoggerFactory.getLogger(H2oTabularMojoClassifier.class);

    private final EasyPredictModelWrapper modelWrapper;
    private final List<String> columnNames;
    private final SerializableFunction predictionDiscretizer;

    public H2oTabularMojoClassifier(
            InputStream mojoInputStream,
            SerializableFunction predictionDiscretizer,
            List<String> columnNames) throws IOException {

        this.predictionDiscretizer = predictionDiscretizer;

        final MojoReaderBackend reader = MojoReaderBackendFactory.createReaderBackend(mojoInputStream,
                MojoReaderBackendFactory.CachingStrategy.MEMORY);
        final MojoModel model = ModelMojoReader.readFrom(reader);

        this.modelWrapper = new EasyPredictModelWrapper(model);
        this.columnNames = Collections.unmodifiableList(columnNames);
    }

    @Override
    public int predict(final TabularInstance instance) {
        Object[] instanceValues;
        if (instance.getOriginalInstance() != null) {
            instanceValues = instance.getOriginalInstance();
        } else {
            LOG.warn("Trying to predict with h2o model and the discretized " +
                    "instance values since the original instance is null");
            instanceValues = instance.getInstance();
        }

        RowData row = new RowData();
        int i = 0;
        for (String columnName : columnNames) {
            Object value = instanceValues[i];
            row.put(columnName, value);
            i++;
        }

        try {
            AbstractPrediction prediction = this.getModelWrapper().predict(row);
            return predictionDiscretizer.apply(prediction);
        } catch (hex.genmodel.easy.exception.PredictException e) {
            throw new PredictException(e);
        }
    }

    public EasyPredictModelWrapper getModelWrapper() {
        return modelWrapper;
    }

    public interface SerializableFunction extends Function<AbstractPrediction, Integer>, Serializable {
    }

    public static H2oTabularMojoClassifier create(final H2oApi api, String modelId, AnchorTabular anchor)
            throws DataAccessException {

        H2oTabularMojoClassifier classificationFunction;
        try (H2oDownload mojoDownload = new H2oMojoDownload()) {
            File mojoFile = mojoDownload.getFile(api, modelId);

            classificationFunction = new H2oTabularMojoClassifier(
                    new FileInputStream(mojoFile),
                    AnchorUtil.generateH2oPredictor(),
                    anchor.getFeatures().stream().map(TabularFeature::getName).collect(Collectors.toList()));
        } catch (IOException e) {
            throw new DataAccessException("Failed to load Model MOJO with id: " + modelId + " and connection: " + api.getUrl());
        }
        return classificationFunction;
    }

}