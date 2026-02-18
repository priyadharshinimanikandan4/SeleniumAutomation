package seleniummm;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class l3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d = new ChromeDriver();

d.get("https://letcode.in/alert");
WebDriverWait e = new WebDriverWait(d, Duration.ofSeconds(30));

WebElement a = d.findElement(By.xpath("//button[@id='accept']"));
a.click();
Alert s = e.until(ExpectedConditions.alertIsPresent());
System.out.println(s.getText());
s.accept();

System.out.println("back to home");

try {
WebElement t = e.until(ExpectedConditions.elementToBeClickable(By.id("accept")));
t.click();

Alert s1 = e.until(ExpectedConditions.alertIsPresent());
System.out.println(s1.getText());
s1.accept();
}
catch(Exception h){
	System.out.println("err");
	
}
d.quit();

	}

}
