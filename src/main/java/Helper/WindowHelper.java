package Helper;

import Drivers.ChromeWebDriver;
import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class WindowHelper {
    private WebDriver driver;

    public WindowHelper(WebDriver driver) {
        this.driver = driver;
    }
    public Set<String> getWindowHandles(){
        return driver.getWindowHandles();
    }
    public void switchToWindows(int index){
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        if(index < 0 || index > windowsId.size()){
            throw new IllegalArgumentException("You provide wrong index "+ index);
        } driver.switchTo().window(windowsId.get(index));
    }

    public void switchToParent(){
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        driver.switchTo().window(windowsId.get(0));
    }

    public void switchToParentWithChildClose(){
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        for (int i = 1; i < windowsId.size(); i ++) {
            driver.switchTo().window(windowsId.get(i)).close();
        }
        switchToParent();
    }

}
