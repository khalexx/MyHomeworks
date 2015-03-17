package lesson150316;

public class SI {

	public void changeState() {
		
	}
	
	static {
		System.out.println("init 1");
	}
	
	static int x;
	
	static {
		System.out.println("init 2");
	}
	
	public SI() {
	}
	
	static void test() {
		System.out.println("this is test");
	}

	static {
		System.out.println("init 3");
		x = 10;
		
		System.out.println("static init: " + x);
		
	}
	
}
