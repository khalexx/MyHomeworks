package lesson150316;

public class B {

	public static void main(String[] args) {
		
		int x = 20;
		
//		something(x);  // something(20)  
		
		{
			int xx = x;
			
			xx = 30;
			
			System.out.println(xx);
			
		}
		
		System.out.println(x);
		
	}

	private static void something(final int paramX) {   /// int x = 20
		
//		paramX = 30;  ERROR!
		
		System.out.println(paramX);
		
	}
	
}
