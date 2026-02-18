package seleniummm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d  = new ChromeDriver();
d.get("https://letcode.in/table");
WebElement a = d.findElement(By.id("shopping"));
List<WebElement> i = a.findElements(By.tagName("th"));
for(WebElement j : i) {
	String Text= j.getText();
	System.out.println(Text);
}
List<WebElement> b = a.findElements(By.tagName("tr"));
int s = b.size();
System.out.println(s);

List<WebElement> c = a.findElements(By.tagName("td"));
int f = c.size();
System.out.println(f);
for(WebElement p : b) {
	String h = p.getText();
	System.out.println(h);
}
for(WebElement l : c) {
	String u = l.getText();
	System.out.println(u);
}
boolean found = false;
for(WebElement y : b) {
	if(y.getText().contains("Apple")) {
		System.out.println("Apple");
		found =  true;
		break;
	
	}
}
d.quit();


	}

}
