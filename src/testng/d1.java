package testng;

import org.testng.annotations.Test;

public class d1 {

	
	@Test(dataProvider ="sa", dataProviderClass = daata.class)
			public void name (String Email,String pass) {
		System.out.println(Email + pass);
	}
}
