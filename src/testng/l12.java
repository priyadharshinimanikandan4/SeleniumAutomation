package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class l12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();

driver.get("https://letcode.in/table");
String title = driver.getTitle();
String Url = driver.getCurrentUrl();
System.out.println(title + Url);
String t1 = "WebTable | LetCode with Koushik";
String u1 = "https://letcode.in/table/";
Assert.assertEquals(title, t1);
Assert.assertTrue(true, t1);
Assert.assertEquals(Url,u1);
driver.quit();
	}

}
