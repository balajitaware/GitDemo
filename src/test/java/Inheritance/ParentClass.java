package Inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParentClass {
	
	@Test
	public void parentMethod() {
		System.out.println("This is test case from parent menthod.");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This executes after each test.");
	}

}
