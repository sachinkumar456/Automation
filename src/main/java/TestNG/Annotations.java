package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void suiteStart() {
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void beforeTestExample() {
		System.out.println("@BeforeTest");
	}
	/*
	before class and after method blocks
	*/
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("@AfterMethod");
	}
	
	
	@Test
	public void openCherCherTech() {
		System.out.println("@Test");
	}
	
	/*
	after method and after class blocks
	*/
	@AfterTest
	public void completeTestExecution() {
		System.out.println("@AfterTest");
	}
	@AfterSuite
	public void suiteCompletion() {
		System.out.println("@AfterSuite");
	}
}