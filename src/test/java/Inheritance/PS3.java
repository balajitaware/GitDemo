package Inheritance;

public class PS3 extends PS4{
	
	int a;
	public PS3(int a) {
		super(a);
		this.a = a;
	}
	
	public int increament() {
		a = a+1;
		return a;
	}
	public int decreament() {
		a = a-1;
		return a;
	}

}
