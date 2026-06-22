package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final ConfigReader instance = new ConfigReader();

    private final Properties properties;

    private ConfigReader() {
        this. properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config/config.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Unable to locate the prperty file", e);
        }

    }

    public static ConfigReader getInstance() {

        return instance;

    }

    public String getBrowser()
    {
        return properties.getProperty("browser");
    }

    public String getEnvironment()
    {
        return properties.getProperty("environment");
    }
    public String getBaseUrl()
    {
        return properties.getProperty("base.url");
    }

    public boolean getHeadless()
    {
        return Boolean.parseBoolean( properties.getProperty("headless"));

    }
}
