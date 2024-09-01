package Helper;

import Drivers.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebElementHelper {
    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;


    public WebElementHelper(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    public WebElementHelper waitButtonToBeClickAble (WebElement element) {
       wait.until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementHelper waitElementsToBeDisplayed(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public WebElementHelper jsClick(WebElement element){
        waitElementsToBeDisplayed(element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
        //позволяет кликнуть по кнопке даже если он не видим или перекрыт другим не видимым элементом
        return this;
    }

    public WebElementHelper scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public WebElementHelper click (WebElement element){
        waitButtonToBeClickAble(element);
        actions.click(element).perform();
        return this;
    }

    public WebElementHelper doubleClick(WebElement element){
        waitButtonToBeClickAble(element);
        actions.doubleClick(element).perform();
        return this;
    }

    public WebElementHelper rightClick(WebElement element){
        waitButtonToBeClickAble(element);
        actions.contextClick(element).perform();
        return this;
    }

    public WebElementHelper sendKey(WebElement element, String txt){
        waitElementsToBeDisplayed(element);
        scrollToElement(element);
        element.sendKeys(txt);
        return this;
    }

    public WebElementHelper sendKeyEnter(WebElement element, String txt){
        waitElementsToBeDisplayed(element);
        element.sendKeys(txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }

    public WebElementHelper pause (int milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

}
