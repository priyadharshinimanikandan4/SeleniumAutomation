package seleniummm;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base<keys> implements Sele{

	RemoteWebDriver driver = null;
	long timeouts = 30;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeouts));
	@Override
	public void setup(String Url) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
	}


	@Override
	public void setup(String browsername, String url) {
		// TODO Auto-generated method stub
   switch(browsername) {
	   case "chrome":
		   driver = new ChromeDriver();
		   break;
	   case "firefox":
		   driver = new FirefoxDriver();
		   break;
	   case "Edge":
		   driver = new EdgeDriver();
		   break;
		default:
			System.err.println("No driver");
			break;
	}
   driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
driver.get(url);
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		driver.close();
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}

	@Override
	public void ele(WebElement e, String value, String locto) {
		// TODO Auto-generated method stub
		switch(locto) {
		   case "id":
			   driver.findElement(By.id(locto)) ;
			   break;
		   case "class":
			   driver.findElement(By.className(locto)) ;
			   break;
		   case "xpath":
			   driver.findElement(By.xpath(locto)) ;
			   break;
			default:
				System.err.println("No driver");
				break;
		
	}
		
		
	}

	
	

	@Override
	public void click(WebElement e) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(e));
		e.click();
	}

	@Override
	public void type(WebElement e, String value) {
		// TODO Auto-generated method stub
		e.clear();
		e.sendKeys(value);
		
	}
	public void type(WebElement e, String value,Keys key) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(e));
		e.clear();
		e.sendKeys(value,key);
		
	}

	@Override
	public void veri(String Title) {
		// TODO Auto-generated method stub
		driver.getTitle();
	}

	@Override
	public void windowhandling(int value) {
		// TODO Auto-generated method stub
		Set<String> a = new HashSet<>();
		ArrayList<String> l = new ArrayList<String>(a);
		driver.switchTo().window(l.get(value));
		
	}

	@Override
	public void select(WebElement e,String text) {
		// TODO Auto-generated method stub
		 wait.until(ExpectedConditions.visibilityOf(e));
		Select s = new Select(e);
		s.selectByVisibleText(text);
		
	}

public void print(String title) {
	System.out.println("Title is :" + driver.getTitle()+" " + driver.getCurrentUrl());
}
	@Override
	public void switcwindw() {
		// TODO Auto-generated method stub
		
	}

}
