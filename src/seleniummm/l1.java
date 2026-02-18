package seleniummm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class l1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			wait.until(
				ExpectedConditions.elementToBeClickable(
					By.xpath("//span[text()='Close']"))
			).click();
		} catch (Exception e) {
			System.out.println("No popup");
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(
			"arguments[0].click();",
			driver.findElement(By.xpath("//a[contains(text(),'Explore Workspace')]"))
		);

		js.executeScript(
			"arguments[0].click();",
			driver.findElement(By.xpath("//a[contains(text(),'Click')]"))
		);

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.quit();
	}
}
