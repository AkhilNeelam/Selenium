package day7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {

	@BeforeSuite
	public void beforeSuiteMthod() {
		System.out.println("before suite method");
	}
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("before test method");
	}
	@BeforeClass
	public void beforeclassmethod() {
		System.out.println("before class method");
	}
	@BeforeMethod
	public void beforeMethodmethod() {
		System.out.println("before method");
	}
	@Test
	public void testCase() {
		System.out.println("this is testcase");
	}
	@AfterMethod
	public void afterMethodMethod() {
		System.out.println("after method method");
	}
	@AfterClass
	public void afterclassmethod() {
		System.out.println("after class method");
	}
	@AfterMethod
	public void afterTestMethod() {
		System.out.println("after test method");
	}
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("after suite method");
	}
	
}
