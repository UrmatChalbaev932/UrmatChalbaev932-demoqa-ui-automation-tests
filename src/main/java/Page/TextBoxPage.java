package Page;

import ConfigReader.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
    String driver = ConfigReader.getValue("browser");
    public WebElement fullName = driver.findElement(By.xpath("//input[@id='userName'"));


    
}
