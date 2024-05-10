package Inheritance;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChildClass extends ParentClass{
	
	@Test
	public void childMethod() {
		parentMethod();
		System.out.println("This is child method calling parent one.");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This executes before each test.");
	}

}
