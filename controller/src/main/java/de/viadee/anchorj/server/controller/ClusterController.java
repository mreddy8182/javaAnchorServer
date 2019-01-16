package de.viadee.anchorj.server.controller;

import de.viadee.anchorj.server.api.ClusterApi;
import de.viadee.anchorj.server.api.exceptions.DataAccessException;
import de.viadee.anchorj.server.business.ClusterBO;
import de.viadee.anchorj.server.model.ConnectionNameListResponse;
import de.viadee.anchorj.server.model.TryConnectResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

/**
 */
@RestController
public class ClusterController implements ClusterApi {

    private static final Logger LOG = LoggerFactory.getLogger(ClusterController.class);

    private ClusterBO clusterBO;

    public ClusterController(@Autowired ClusterBO clusterBO) {
        this.clusterBO = clusterBO;
    }

    @Override
    @RequestMapping(
            path = "/{connectionName}/try_connect",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON)
    public TryConnectResponse tryConnect(@PathVariable String connectionName) {
        try {
            boolean canConnect = this.clusterBO.tryConnect(connectionName);
            return new TryConnectResponse(canConnect);
        } catch (DataAccessException dae) {
            LOG.error(dae.getMessage(), dae);
            // TODO add exception handling
            return null;
        }
    }

    @Override
    @RequestMapping(
            path = "/",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON)
    public ConnectionNameListResponse getConnectionNames() {
        return this.clusterBO.getConnectionNames();
    }

}
