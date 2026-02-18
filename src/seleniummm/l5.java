package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/frame");

        // Switch to parent frame
        driver.switchTo().frame("firstFr");

        // Parent frame elements
        driver.findElement(By.name("fname")).sendKeys("anu");
        driver.findElement(By.name("lname")).sendKeys("anu");

        // Switch to child frame
        driver.switchTo().frame(1);

        // Child frame element
        driver.findElement(By.name("email")).sendKeys("anu@example.com");

        driver.switchTo().parentFrame();
        // Back to main page
        driver.switchTo().defaultContent();
System.out.println("quit");
        driver.quit();
    }
}
