package Page;

import io.qameta.allure.Step;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Page.DemoQaEnum.LOGIN_PAGE;
import static Page.DemoQaEnum.TEXT_BOX;

public class TextBoxPage extends BasePage {

    @FindBy(id = "userName")
    WebElement userNameInput;
    @FindBy(id = "userEmail")
    WebElement userEmailInput;
    @FindBy(id = "currentAddress")
    WebElement userCurrentAddress;
    @FindBy(id = "permanentAddress")
    WebElement userPermanentAddress;
    @FindBy(id = "submit")
    WebElement userSubmit;
    @FindBy(id = "name")
    WebElement rltName;
    @FindBy(id = "email")
    WebElement rltEmail;
    @FindBy(id ="currentAddress")
    WebElement rltCurrentAddress;
    @FindBy(id ="permanentAddress")
    WebElement rltPermanentAddress;

    @Step("open the page ")
    public TextBoxPage openTheTextBoxPage(){
        browserManager.openByGet(LOGIN_PAGE.getURL()+TEXT_BOX.getURL());
        return this;
    }

    @Step("enter the user name in the field")
    public TextBoxPage inputUserName(String txt){
        webElementHelper.sendKey(userNameInput, txt);
        return this;
    }
    @Step("enter the user email in the field")
    public TextBoxPage inputUserEmail(String txt){
        webElementHelper.sendKey(userEmailInput, txt);
        return this;
    }
    @Step("enter the user current address in the field")
    public TextBoxPage inputUserCurrentAddress (String txt){
        webElementHelper.sendKey(userCurrentAddress, txt);
        return this;
    }
    @Step("enter the user permanent address in the field")
    public TextBoxPage inputUserPermanentAddress (String txt){
        webElementHelper.sendKey(userPermanentAddress, txt);
        return this;
    }

    @Step("click Btn Submit")
    public TextBoxPage clickBtnSubmit(){
        webElementHelper.click(userSubmit);
        return this;
    }

    public String getTextUserName(){
        return rltName.getText();
    }

    public String getTextUserEmail(){
        return rltEmail.getText();
    }

    public String getTextUserCurrentAddress(){
        return rltCurrentAddress.getText();
    }

    public String getTextUserPermanentAddress(){
        return rltPermanentAddress.getText();
    }




}
