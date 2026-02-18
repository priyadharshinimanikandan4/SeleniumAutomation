package testng;

import org.testng.annotations.DataProvider;

public class daata {

	@DataProvider(name = "sa" , indices = {1,2,0} , parallel = true)
	public String[][] sa(){
		
	String[][] a = new String[4][2];
	
	a[0][0] = "1";
	a[0][1] = "2";
	a[1][0] = "3";
	a[1][1] = "4";
	a[2][0] = "5";
	a[2][1] = "6";
	a[3][0] = "7";
	a[3][1] = "8";
		return a;
		
	}
	
}
