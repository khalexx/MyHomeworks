package lesson150312;

public class Complex {

	// public            anybody
	// protected         heirs (subclasses)
	// default (package) friends (same package)
	// private           this class only
	
	
	
	private int a, b;
	int c;
	protected int d;
	
	public Complex(int initialValue) {
		a = 0;
		b = initialValue;
	}
	
	public void change(int delta) {
		incA(delta);
		incB(delta);
	}
	
	void someMethod() {
		// do nothing
	}
	
	protected void overrideMe() {
		
	}

	private void incB(int delta) {
		b -= delta;
	}

	private void incA(int delta) {
		a += delta;
	}
	
	public void reportState() {
		System.out.println("a = " + a + ", b= " + b);

	}
	
}
