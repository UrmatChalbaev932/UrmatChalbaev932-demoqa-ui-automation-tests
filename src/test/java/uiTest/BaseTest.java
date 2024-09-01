import Drivers.Driver;
import Helper.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    WebDriver driver;
    AlertHelper alertHelper;
    BrowserManager browserManager;
    DropDownHelper dropDownHelper;
    FrameHelper frameHelper;
    WebElementHelper webElementHelper;
    WindowHelper windowHelper;
    DemoQaPages demoQaPages;

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
        driver.close();
    }
}
