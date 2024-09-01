package Drivers;

import ConfigReader.ConfigReader;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {

    public static WebDriver loadChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/user/IdeaProjects/Selenium_2/src/main/resources/Drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size-1920,1080");
        options.addArguments("--no-sandbox");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        if(Boolean.parseBoolean(ConfigReader.getValue("headless"))){
            options.addArguments("--headless");
        }
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        return driver;
    }
}
