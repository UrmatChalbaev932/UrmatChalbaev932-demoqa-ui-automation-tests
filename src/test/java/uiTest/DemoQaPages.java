import Page.TextBoxPage;
import org.testng.annotations.BeforeClass;

public class DemoQaPages {
   TextBoxPage textBoxPage;

   @BeforeClass (alwaysRun = true)
    public void intiPage(){
       textBoxPage = new TextBoxPage();
   }
}
