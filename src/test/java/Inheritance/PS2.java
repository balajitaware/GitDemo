package Inheritance;

import org.testng.annotations.Test;

public class PS2 extends PS1{
	
	@Test
	public void testRun() {
		parentMethod();
		int a=3;
		System.out.println("This is test run with a="+a);
		PS3 ps3 = new PS3(a);
		System.out.println(ps3.increament());
		System.out.println(ps3.decreament());
		System.out.println(ps3.multiplyBy2());
	}

}
