package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
  @Parameters({"URL"})  
  @Test
  public void webLoginPL(String urlName) {
    System.out.println("Personal loan web login.");
    System.out.println(urlName);
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test code.");
  }
  @Test(groups= {"smoke"})
  public void mobileLoginPL() {
	    System.out.println("Personal loan mobile login.");
	  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test code.");
  }
}
