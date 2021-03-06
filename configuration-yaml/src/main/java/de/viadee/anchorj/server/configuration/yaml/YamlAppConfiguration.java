package de.viadee.anchorj.server.configuration.yaml;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import de.viadee.anchorj.server.configuration.AppConfiguration;

/**
 *
 */
@Component
@ConfigurationProperties("app")
public class YamlAppConfiguration implements AppConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(YamlAppConfiguration.class);

    private static final String VERSION_FILE_NAME = "version.txt";

    private Map<String, String> serverNameMapping = new HashMap<>();

    private String sparkLibFolder;

    private String sparkMasterUrl;

    public Map<String, String> getServerNameMapping() {
        return this.serverNameMapping;
    }

    public void setServer(Map<String, String> serverNameMapping) {
        this.serverNameMapping = serverNameMapping;
    }

    @Override
    public String getVersion() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + VERSION_FILE_NAME)))) {
            return in.readLine();
        } catch (IOException ioe) {
            LOG.error("failed to read version.txt: " + ioe.getMessage(), ioe);
            return "N.A.";
        }
    }

    public Set<String> getConnectionNames() {
        return this.serverNameMapping.keySet();
    }

    public String getConnectionName(String connectionName) {
        return this.serverNameMapping.get(connectionName);
    }

    @Override
    public String getSparkLibFolder() {
        try {
            return new File(this.sparkLibFolder).getCanonicalPath();
        } catch (IOException e) {
            LOG.error("failed to locate spark library folder: " + e.getMessage(), e);
            return new File(this.sparkLibFolder).getAbsolutePath();
        }
    }

    @Override
    public String getSparkMasterUrl() {
        return this.sparkMasterUrl;
    }

    public void setSparkLibFolder(String sparkLibFolder) {
        this.sparkLibFolder = sparkLibFolder;
    }

    public void setSparkMasterUrl(String sparkMasterUrl) {
        this.sparkMasterUrl = sparkMasterUrl;
    }
}
