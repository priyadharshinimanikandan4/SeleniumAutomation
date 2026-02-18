package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage {

		// TODO Auto-generated method stub
         RemoteWebDriver driver;
         
         public LoginPage(RemoteWebDriver driver) {
        	 this.driver = driver;
         }
         
        public LoginPage enterUsername(String username) {
        	driver.findElement(By.id("user-name")).sendKeys(username);
        	 
        	return this;

         
         
	}
        
        public LoginPage enterPassword(String pass) {
        	driver.findElement(By.id("password")).sendKeys(pass);
        	return this;
        }
        public HomePage login() {
        	driver.findElement(By.id("login-button")).click();
        	return new HomePage(driver);
                   }
        
}
        
        
