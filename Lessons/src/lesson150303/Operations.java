package lesson150303;

public class Operations {

	public static strictfp void main(String[] args) {
		
		int a = 1 + 2;
		
		int b,c;
		
		a += 2;  // a = a + 2;
		
		b = a++;  // b == a
		
		b = a--;  // b == a
		
		b = ++a;  // b == a + 1 
		b = --a; ///  b == a - 1
		
		float f = 0.0f;
		
		double d = 1.03;
		
		boolean bool = a > 10;
		
		bool = a == 10; 
		bool = b != 10;
		
		bool = (a > 10) && (b < 20); // AND
		bool = a > 10 || b < 20; // AND
		
		bool = !(a > 10);
		
		c = a > b ? 20 : 30;
		
		System.out.println(Math.PI);
		
		c = (int)d;
		
		c = (int)Math.ceil(d);
		
		
		
		
	}
	
}
