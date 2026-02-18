package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;
public class tcc001 {

    RemoteWebDriver driver;

    @BeforeMethod
    public void setup() {
    	driver = new ChromeDriver();
    	driver.get("https://www.saucedemo.com/");
    }
    
    @Test
    public void login() {
    	LoginPage lp = new LoginPage(driver);
    	HomePage hp = lp.enterUsername("standard_user")
    			.enterPassword("secret_sauce")
    			.login();
    }
    
    @AfterMethod
    public void close() {
    	driver.quit();
    }
}
