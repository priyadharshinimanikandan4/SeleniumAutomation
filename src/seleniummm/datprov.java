package seleniummm;

import org.testng.annotations.DataProvider;

public class datprov {

	
	@DataProvider(name = "login")
	public Object[][]getData(){
		return Excela.readE("lofin");
		
		
	}
}
