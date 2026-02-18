import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://letcode.in/frame");
       driver.manage().window().maximize();
       driver.switchTo().frame("firstFr");
       driver.findElement(By.name("fname")).sendKeys("anu");
       driver.findElement(By.name("lname")).sendKeys("abi");  driver.switchTo().frame(
               driver.findElement(By.xpath("//iframe[@src='innerframe']"))
    	        );
       driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("priya@gmail.com");
       driver.quit();
	}

}
