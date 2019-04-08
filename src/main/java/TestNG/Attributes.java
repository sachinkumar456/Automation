package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Attributes {
	@Test(enabled=false)
	public void suiteStart() {
		System.out.println("");
	}
	@Test(timeOut=500)
	public void beforeTestExample() {
		System.out.println("");
	}
	
}