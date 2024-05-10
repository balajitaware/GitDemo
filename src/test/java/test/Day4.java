package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void webLoginHomeLoan() {
		System.out.println("Home loan web login.");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after class.");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("This will execute after groups");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after methods.");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This will execute after suite.");
	}

	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("Home loan mobile login.=>Git Push Test");
	}
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void apiLoginHomeLoan(@Optional("URL")String urlName) {
		System.out.println("Home loan API login.");
		System.out.println(urlName);
	}
}
