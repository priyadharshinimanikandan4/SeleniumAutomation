package seleniummm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver = new  ChromeDriver();
   driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
   driver.manage().window().maximize();
   
   WebElement t = driver.findElement(By.xpath("//table[contains(@class,'table') and contains(@class,'table-striped') and contains(@class,'mt-3')]"));
   List<WebElement> r = t.findElements(By.tagName("tr"));
   System.out.println(r.size());
   List<WebElement> u = driver.findElements(By.tagName("th"));
   System.out.println(u.size());

   List<WebElement> e = driver.findElements(By.tagName("td"));
   System.out.println(e.size());
   System.out.println(u.get(0));
   for(WebElement y : r ) {
	   System.out.println(y.getText());
	   
   }
   for(WebElement b : u) {
	   System.out.println(b.getText());
	   
   }
   
   System.out.println();
   System.out.println();
   System.out.println(u.get(2));

WebElement a = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody/tr[2]/td[1]"));
System.out.println(a.getText());
  
WebElement ai = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody/tr[3]/td[3]"));
System.out.println(ai.getText());
    
   driver.quit();
   
	}

}
