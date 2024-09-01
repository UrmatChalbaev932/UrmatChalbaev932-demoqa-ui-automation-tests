package Drivers;

import ConfigReader.ConfigReader;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.WebDriver;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Driver {

    static WebDriver driver;

    Driver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getValue("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
            }
        }
        return driver;
    }


    public static void closeDriver() {
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
        } catch (Exception e) {
            System.out.println("Error while closing driver");
        }
    }
}
