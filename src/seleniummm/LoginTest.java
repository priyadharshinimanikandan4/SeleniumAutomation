package seleniummm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginTest {

   @Test(dataProvider = "login", dataProviderClass= datprov.class)
    public void loginTest(String user, String pass) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

       Loginclass lp = new Loginclass(driver);
       lp.enteruser(user);
       lp.enterpass(pass);
       lp.login();

        driver.quit();
    }
}
