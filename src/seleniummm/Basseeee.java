package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Basseeee {
  
    Base b = new Base();

    @Test
    public void login() {

        b.setup("chrome", "https://www.saucedemo.com/");

        WebElement username = b.driver.findElement(By.id("user-name"));
        b.type(username, "standard_user");

        WebElement password = b.driver.findElement(By.id("password"));
        b.type(password, "secret_sauce");

        WebElement btn = b.driver.findElement(By.id("login-button"));
        b.click(btn);

        String actualTitle = b.driver.getTitle();
        Assert.assertEquals(actualTitle, "Swag Labs");
        
        b.print(actualTitle);

        
        b.quit();
    }
}
