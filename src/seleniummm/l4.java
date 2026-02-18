package seleniummm;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait; 
import org.openqa.selenium.support.ui.ExpectedConditions;

public class l4 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

     
        try {
            WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Close']")));
            closeBtn.click();
        } catch (Exception e) {
            System.out.println("No popup found");
        }

        WebElement explore = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Explore Workspace')]")));
        js.executeScript("arguments[0].click();", explore);
        System.out.println("Clicked Explore Workspace");

        // Dialog link (correct XPath)
        WebElement dialogLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Dialog')]")));
        js.executeScript("arguments[0].scrollIntoView(true);", dialogLink);
        js.executeScript("arguments[0].click();", dialogLink);
        System.out.println("Clicked Dialog link");

         try {
            WebElement p = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Close']")));
           p.click();
           WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm")));
           
           System.out.println("cvg");
           confirmBtn.click();
           Alert l = wait.until(ExpectedConditions.alertIsPresent());
           System.out.println(l.getText());
           l.accept();
          }
       
        catch (Exception u) {
        	 WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm")));
             confirmBtn.click();
        	 Alert l = wait.until(ExpectedConditions.alertIsPresent());
        	 System.out.println(l.getText());
        l.accept();
        }
       
        driver.quit();
    }
}
