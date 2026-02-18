package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class l7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d = new ChromeDriver();
d.get("https://letcode.in/draggable");
Actions b = new Actions(d);
WebElement a = d.findElement(By.xpath("//div[@id='sample-box']"));
b.dragAndDropBy(a, 34, 65).perform();
System.out.println("dien");


d.get("https://letcode.in/droppable");

System.out.println("conde");
WebElement s = d.findElement(By.xpath("//div[@id='draggable']"));
WebElement t = d.findElement(By.xpath("//div[@id='droppable']"));
b.dragAndDrop(s, t).perform();
d.navigate().refresh();


 s = d.findElement(By.xpath("//div[@id='draggable']"));
t = d.findElement(By.xpath("//div[@id='droppable']"));

b.clickAndHold(s).moveToElement(t).release().perform();
System.out.println("gvhj");
d.quit();


	}

}
