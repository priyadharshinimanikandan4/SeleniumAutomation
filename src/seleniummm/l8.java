package seleniummm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class l8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    ChromeDriver driver = new ChromeDriver();
                    driver.get("https://letcode.in/dropdowns");
                    driver.manage().window().maximize();
                    WebElement a = driver.findElement(By.xpath("//select[@id='fruits']"));
                    Select s = new Select(a);
                     s.selectByVisibleText("Mango");
                     s.selectByValue("3");
                     boolean b = s.isMultiple();
                WebElement d =   s.getFirstSelectedOption();
                System.out.println(d);
                WebElement  k = driver.findElement(By.xpath("//select[@id='superheros']"));
                Select x = new Select(k);
                x.selectByValue("am");
                x.selectByIndex(4);
                x.selectByVisibleText("Black Panther");
              List  <WebElement> y = x.getAllSelectedOptions();
              x.deselectByValue("am");
             List<WebElement> r =  x.getOptions();
             System.out.println(r);
             WebElement g = driver.findElement(By.id("lang"));
             Select u = new Select(g);
             u.selectByValue("sharp");
             u.selectByVisibleText("C#");
          List<WebElement> p =   u.getOptions();
       WebElement t = driver.findElement(By.id("country"));
       Select o = new Select(t);
       o.selectByValue("Ecuador");
       System.out.println("donre");
       driver.quit();
     
       
         
             
             
                
                
	}

}
