package uiTest;

import Drivers.Driver;
import Helper.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseTest {

    public WebDriver driver;
    public AlertHelper alertHelper;
    public BrowserManager browserManager;
    public DropDownHelper dropDownHelper;
    public FrameHelper frameHelper;
    public WebElementHelper webElementHelper;
    public WindowHelper windowHelper;
    public DemoQaPages demoQaPages;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = Driver.getDriver();
        alertHelper = new AlertHelper();
        browserManager = new BrowserManager(driver);
        dropDownHelper = new DropDownHelper();
        frameHelper = new FrameHelper(driver);
        webElementHelper = new WebElementHelper(driver);
        windowHelper = new WindowHelper(driver);
        demoQaPages = new DemoQaPages();
        demoQaPages.intiPage();

    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }
}
