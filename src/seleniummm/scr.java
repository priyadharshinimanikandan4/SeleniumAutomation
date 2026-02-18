package seleniummm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  ChromeDriver driver = new ChromeDriver();
  driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
  WebElement o =  driver.findElement(By.xpath("//input[@id='fullname']"));
  o.sendKeys("priya");
  System.out.println(o.getText());
  WebElement p =  driver.findElement(By.xpath("//input[@id='email']"));
  p.sendKeys("priya@");
  System.out.println(p.getText());
  WebElement x = driver.findElement(By.xpath("//textarea[@id='address']"));
  x.sendKeys("Chennai, Tamil Nadu");

  System.out.println(x.getText());
  WebElement w = driver.findElement(By.id("password"));
  w.sendKeys("priya@bjnmk,k"); // ✅ This works
  System.out.println(w.getAttribute("value")); // Prints the entered password

 TakesScreenshot t = (TakesScreenshot) driver;
 File f = t.getScreenshotAs(OutputType.FILE);
 File des = new File("./snaps/img.png");
FileHandler.copy(f, des); 
System.out.println("done");
driver.quit();
	}

}
