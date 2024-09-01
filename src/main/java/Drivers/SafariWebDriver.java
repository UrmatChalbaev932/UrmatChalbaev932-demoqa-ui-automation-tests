package Drivers;

import ConfigReader.ConfigReader;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class SafariWebDriver {
public static WebDriver loadSafariWebDriver(){
    System.setProperty("webdriver.safari.driver", "/Users/user/IdeaProjects/Selenium_2/src/main/resources/Drivers/safaridriver");
    WebDriver driver = new SafariDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    driver.manage().window().maximize();
    return driver;
}
}
