package Helper;

import Drivers.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    public Alert getAlert(){
        return Driver.getDriver().switchTo().alert(); //переход на алерт
    }
    public boolean isAlertPresent(){
        try {
            getAlert();
            return false;
        } catch (NoAlertPresentException e){
            e.printStackTrace();
            return true;
        }
    }


    public void acceptAlert(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7)).until(ExpectedConditions.alertIsPresent());
        if(isAlertPresent()){
            return; //stop
        }
        getAlert().accept();
    }

    public void dismissAlert(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if(!isAlertPresent()){
            System.out.println("Not found alert");
        }
        getAlert().dismiss();
    }

    public void sendKeysAlert(String txt){
        if(!isAlertPresent()){
            return;
        }
        getAlert().sendKeys(txt);
    }

    public String getTextAlert(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        return getAlert().getText();
    }






}
