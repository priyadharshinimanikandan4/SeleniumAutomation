package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class l11 {

	@Test(priority = 1, enabled = false)
	public void hello() {
		System.out.println("hell1p");
	}
	@Test(priority=-1, dependsOnMethods = "hello2")
	public void hello1() {
		System.out.println("hell2p");
	}
	@Test(invocationCount = 2, timeOut = 20)
	public void hello2() {
		System.out.println("hell4p");
	}
	@AfterClass
	public void hello4() {
		System.out.println("hel77lp4");
	}
	@Test
	public void hello3() {
		System.out.println("hell45p");
	}
}
