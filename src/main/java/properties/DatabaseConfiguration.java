package properties;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class DatabaseConfiguration {

    private Properties properties;

    public DatabaseConfiguration() {
        this.properties = new Properties();
        try (InputStream is = DatabaseConfiguration.class.getResourceAsStream("/db.properties")) {
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");
            this.properties.load(reader);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    public DatabaseConfiguration(File file) {
        this.properties = new Properties();
        try(FileReader reader = new FileReader(file)){
            this.properties.load(reader);
        }
        catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Cannot read file", e);
        }
        catch (IOException ioe) {
           throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    public String getHost() {
        return this.properties.getProperty("db.host");
    }

    public int getPort() {
        return Integer.parseInt(this.properties.getProperty("db.port"));
    }

    public String getSchema() {
        return this.properties.getProperty("db.schema");
    }
}