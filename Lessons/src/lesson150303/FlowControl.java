package lesson150303;

public class FlowControl {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		{
			System.out.println(i);
			
			int x = 20;
			
			System.out.println(x);
		}
		
//		System.out.println(x);
		
		if (i <= 10) {
			System.out.println("More");
		}
		
		if (i > 10) {
			System.out.println("Less");
		} else {
			System.out.println("More");
		}
		
		System.out.println(i > 10 ? "Less" : "More");
		
		if (i % 2 == 0) {
			System.out.println("Even");
			i--;
		}
		
		System.out.println(i);
		
		if (i % 2 == 1) { 
			System.out.println("Odd");
		}
		i++;
		
		if (i == 10) {
			System.out.println("10");
		}
		
		if (i < 2) {
			System.out.println("<2");
		} else if (i < 10) {
			System.out.println("<10");
		} else if (i < 100) {
			System.out.println("<100");
		} else if (i < 1000) {
			System.out.println("<1000");
		}
		
		
	}

}
