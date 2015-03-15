package lesson150310;

public class A {
	
// class members	
	
	// state (fields)
	
	public A() {
	}
	
	public A(int initialState) {
		i = initialState;
	}
	
	
	private int i;
	
	// behavior (methods)
	
	public void inc() {
		i++;
	}
	
	public int get() {
		return i;
	}

}
