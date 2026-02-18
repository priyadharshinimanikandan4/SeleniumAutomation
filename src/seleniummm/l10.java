package seleniummm;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
public class l10 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
 ChromeDriver d = new ChromeDriver();
 d.manage().window().maximize();
 d.get("https://letcode.in");
 TakesScreenshot t  = (TakesScreenshot) d;
 File s = t.getScreenshotAs(OutputType.FILE);
 
 File dest = new File("./snaps/img.png");
 FileUtils.copyFile(s, dest);
 System.out.println("fone");
 d.quit();

	}

}
