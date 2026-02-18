package seleniummm;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class l2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://letcode.in/");


WebDriverWait w   = new WebDriverWait(driver, Duration.ofSeconds(10));
try {
	
	w.until(
			ExpectedConditions.elementToBeClickable(
				By.xpath("//span[text()='Close']"))
		).click();
}catch(Exception e){
	System.out.println("errr");
}

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript(
		"arguments[0].click();",
		driver.findElement(By.xpath("//a[contains(text(),'Explore Workspace')]"))
	);js.executeScript(
			"arguments[0].click();",
			driver.findElement(By.xpath("//a[text()= ' Edit ']"))
		);
	
	
	driver.findElement(By.xpath("//input[@id= 'fullName']")).sendKeys(Keys.TAB,"priyadharshini");
	WebElement j = driver.findElement(By.xpath("//input[@id= 'join']"));
	System.out.println(j.getAttribute("value"));
	WebElement i = driver.findElement(By.xpath("//input[@id= 'getMe']"));
	System.out.println(i.getAttribute("value"));

	WebElement s = driver.findElement(By.xpath("//input[@id= 'clearMe']"));
	System.out.println(s.getAttribute("value"));
	s.clear();
	boolean r = driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
	System.out.println(r);
boolean  t = driver.findElement(By.xpath("//input[@id='dontwrite']")).isDisplayed();
System.out.println(t);

	driver.quit();
	
	}

}
