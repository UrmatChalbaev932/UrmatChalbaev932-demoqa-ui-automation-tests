package ConfigReader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    private ConfigReader() {
    }

    static {
        try {
            String path = "/Users/user/IdeaProjects/Selenium_2/src/main/resources/application.properties";
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e){
            throw new RuntimeException("File not found");
        }
    }

    public static String getValue(String key){
        return properties.getProperty(key).trim();
    }

}
