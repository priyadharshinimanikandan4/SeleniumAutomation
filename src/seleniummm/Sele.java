package seleniummm;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface Sele {

	
	public void setup(String Url);
	public void setup(String browsername,String url);
	public void close();
	public void quit();
	public void ele(WebElement e,String value,String locto);
	public void switcwindw();
	public void click(WebElement e);
	public void type(WebElement e, String value);
	public void type(WebElement e, String value,Keys keys);
	public void veri(String Title);
	public void windowhandling(int value);
	public void select(WebElement e,String text);
	public void print(String title);
	
	
	
}
