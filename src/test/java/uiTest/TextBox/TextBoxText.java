package uiTest.TextBox;

import org.testng.Assert;
import org.testng.annotations.Test;
import uiTest.BaseTest;


public class TextBoxText extends BaseTest {


    @Test
    public void test(){
        String userName = "Urmat";
        String userEmail = "urmat_chalbaev@mail.ru";
        String userCurrentAddress = "Bishkek, Isanova, 1/17";
        String userPermanentAddress = "Bishkek, Isanova, 1/17";


      demoQaPages.textBoxPage
                .openTheTextBoxPage()
                .inputUserName(userName)
                .inputUserEmail(userEmail)
                .inputUserCurrentAddress(userCurrentAddress)
                .inputUserPermanentAddress(userPermanentAddress)
                .clickBtnSubmit();


        Assert.assertEquals(demoQaPages.textBoxPage.getTextUserName()
                .substring(demoQaPages.textBoxPage.getTextUserName().length()-userName.length()), userName);




    }
}
