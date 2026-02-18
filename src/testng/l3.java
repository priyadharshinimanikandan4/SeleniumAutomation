package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class l3 {

    // 1️⃣ DataProvider method
    @DataProvider(name = "login")
    public Object[][] getData() {
        return new Object[][] {
            { "priya", "priya@123" },
            { "admin", "admin@123" },
            { "user", "user@123" }
        };
    }

    // 2️⃣ Test method using DataProvider
    @Test(dataProvider = "login")
    public void login(String name, String pass) {
        System.out.println("Username: " + name + ", Password: " + pass);
    }
}
