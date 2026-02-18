package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class excel {

    @Test(dataProvider = "excelData", dataProviderClass = exread1.class)
    public void testLogin(String username, String password) {
        System.out.println("Testing login with: " + username + " / " + password);

        // Example assertion
        Assert.assertNotNull(username);
        Assert.assertNotNull(password);
    }
}
