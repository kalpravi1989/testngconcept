package testngConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Class0 {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After Mehtod");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
	@Test
	public void class0Test1() {
		System.out.println("class0 Test1   " + Thread.currentThread().getId());
	}
}
