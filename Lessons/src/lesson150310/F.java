package lesson150310;

public class F {

	int i = 10;
	private int j;
	private int k;
	
	public F() {
		this(20, 0);
		k = 10;
	}
	
	public F(int i) {
		this.i = i;
	}
	
	public F(float j) {
		
	}
	
	public F(float k, int g) {
		
	}
	
	public F(int k, int g) {
		this(10, k, g);
		
	}
	
	public F(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
}
