package Page;

import Drivers.Driver;
import Helper.*;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class BasePage {

    AlertHelper alertHelper = new AlertHelper();
    BrowserManager browserManager = new BrowserManager(Driver.getDriver());
    DropDownHelper dropDownHelper = new DropDownHelper();
    FrameHelper frameHelper = new FrameHelper(Driver.getDriver());
    WebElementHelper webElementHelper = new WebElementHelper(Driver.getDriver());
    WindowHelper windowHelper = new WindowHelper(Driver.getDriver());

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
