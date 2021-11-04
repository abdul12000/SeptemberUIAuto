package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {


    File file = new File("src/main/resources/Config.properties");
    FileInputStream fileInputStream = new FileInputStream(file);
    public Properties prop = null;


    public ConfigReader() throws Exception {
        prop = new Properties();
        prop.load(fileInputStream);
    }

    public String getUkbaUrl() {
        return prop.getProperty("UKBA_URL");
    }

    public String getNextUrl() {
        return prop.getProperty("NEXT_URL");
    }

    public String getBlazeDemoUrl() {
        return prop.getProperty("BLAZEDEMO_URL");
    }

    public String getNewtoursUrl(){
        return prop.getProperty("NEWTOURS_URL");
    }


}
