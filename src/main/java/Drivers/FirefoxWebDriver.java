package Drivers;

import ConfigReader.ConfigReader;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class FirefoxWebDriver {
    public static WebDriver loadSafariWebDriver(){

        System.setProperty("webdriver.firefox.driver", "/Users/user/IdeaProjects/Selenium_2/src/main/resources/Drivers/geckodriver");

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size-1920,1080");
        options.addArguments("--no-sandbox");

        if(Boolean.parseBoolean(ConfigReader.getValue("headless"))){
            options.addArguments("--headless");
        }

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        return driver;
    }

}
