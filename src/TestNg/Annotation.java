package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@BeforeSuite
	public void BeforesuiteExecuting() {
		Reporter.log("Before suite is getting executed",true);
	}
	
	@BeforeTest
	public void BeforeTestExecuting() {
		Reporter.log("Before Test is getting executed",true);
	}
	
	@BeforeClass
	public void BeforeClassExecuting() {
		Reporter.log("Before Class is getting executed",true);
	}
	
	@BeforeMethod
	public void BeforeMethodExecuting() {
		Reporter.log("Before Method is getting executed",true);
	}
	
	@Test
	public void Mainmethod() {
		Reporter.log("Main Method is getting executed",true);
	}
	
	@AfterSuite
	public void AftersuiteExecuting() {
		Reporter.log("After suite is getting executed",true);
	}
	
	@AfterTest
	public void AfterTestExecuting() {
		Reporter.log("After Test is getting executed",true);
	}
	
	@AfterClass
	public void AfterClassExecuting() {
		Reporter.log("Before Class is getting executed",true);
	}
	
	@AfterMethod
	public void AfterMethodExecuting() {
		Reporter.log("After Method is getting executed",true);
	}
	

}
