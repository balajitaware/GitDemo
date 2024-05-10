package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(dataProvider = "dataProvider")
	public void webLoginCarLoan(String user, String pass) {
		System.out.println("Car loan web login.");
		System.out.println(user);
		System.out.println(pass);
	}
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("This will execute before suite.");
	}
	@Parameters({"URL","APIKey"})
	@Test(enabled = true)
	public void mobileLoginCarLoan(String urlName, String key) {
		System.out.println("Car loan mobile login.");
		System.out.println(urlName);
		System.out.println(key);
	}
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("This will execute before group.");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before class.");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before methods.");
	}
	@Test(groups= {"smoke"})//, dependsOnMethods = {"webLoginCarLoan"})
	public void apiLoginCarLoan() {
		System.out.println("Car loan API login.");
	}
	
	@DataProvider
	public Object[][] dataProvider() {
		Object[][] data =  new Object[3][2];
		//fist set
		data[0][0] = "fisrtuser";
		data[0][1] = "firstpass";
		
		//second set
		data[1][0] = "seconduser";
		data[1][1] = "secondpass";
		
		//third pass
		data[2][0] = "thirduser";
		data[2][1] = "thirdpass";
		
		return data;
	}
}
