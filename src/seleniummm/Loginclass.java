package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Loginclass {

	
	 WebDriver driver;
	 
	 public Loginclass(WebDriver driver) {
		  this.driver = driver;
	 }
	 
	 public void enteruser(String user) {
	 driver.findElement(By.id("user-name")).sendKeys(user);
	 }
	 public void enterpass(String pass) {
	 driver.findElement(By.id("password")).sendKeys(pass);
	 }
	 public void login() {
	 driver.findElement(By.id("login-button")).click();
	 }
}
