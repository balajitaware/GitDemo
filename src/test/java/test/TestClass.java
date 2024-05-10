package test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
	public String tempString = null;
	
	public static void main(String args[])
	{
		TestClass obj = new TestClass("Balajjji");
		
		obj.printDuplicateChars("hellloo");
		//obj.printRepeatativeChar();
	}
	
	public TestClass(String s)
	{
		tempString =s;
	}
	
	public void printDuplicateChars(String str) {
		ArrayList<Character> dupChars = new ArrayList<Character>();
		for(int i=0;i<str.length();i++){
			int count=1;
			dupChars.add(str.charAt(i));
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					dupChars.add(str.charAt(j));
					i=j;
				}
				else {
					break;
				}
			}
			if(count>1)
				System.out.println(dupChars);
			dupChars.clear();
		}
	}
	public void printRepeatativeChar() {
		String tmp = this.tempString;
		for(int i=0;i<tmp.length();i++)
		{
			char chk = tmp.charAt(i);
			int chrCount = 0;
			for(int j=0;j<tmp.length();j++) {
				if(tmp.charAt(j)==chk) {
					chrCount++;
				}
				
			}
			System.out.println(chk+" is found "+ chrCount);
			
		}
	}

}
