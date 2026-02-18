package seleniummm;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class l6 {

    public static void main(String[] args) {

        // Launch browser
        ChromeDriver d = new ChromeDriver();
        d.get("https://letcode.in/");
        d.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) d;

        // Scroll down (ads load after this)
        js.executeScript("window.scrollBy(0,500)");

        // -------- Explore Workspace (JS click) --------
        WebElement explore = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//a[text()='Explore Workspace']")
                )
        );
        js.executeScript("arguments[0].click();", explore);
        System.out.println("Explore Workspace clicked");

        // -------- Tabs (JS click due to ads) --------
        WebElement tabs = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//a[text()=' Tabs ']")
                )
        );
        js.executeScript("arguments[0].click();", tabs);
        System.out.println("Tabs clicked");

        // -------- Open Home Page button --------
        WebElement homeBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("home"))
        );
        homeBtn.click();
        System.out.println("Home button clicked");

        // -------- Window Handling --------
        String parent = d.getWindowHandle();
        Set<String> handles = d.getWindowHandles();
        List<String> windows = new ArrayList<>(handles);

        for (String win : windows) {
            if (!win.equals(parent)) {
                d.switchTo().window(win);
                System.out.println("Child Window URL: " + d.getCurrentUrl());
                d.close();
            }
        }

        d.switchTo().window(parent);
        System.out.println("Back to Parent Window");

        d.quit();
    }
}
