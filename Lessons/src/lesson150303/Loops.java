package lesson150303;

public class Loops {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		printArray(a);
		
	}

	private static void printArray(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			System.out.println(x);
			a[i] = 0;
		}
		
		for (int x : a) {
			System.out.println(x);
		}
		
		int i = 0;
		while (i < a.length) {
			a[i] = i;
			System.out.println(a[i]);
			i++;
		}
		
		String h = "Hello";
		
		for (char c : h.toCharArray()) {
			System.out.println(c);
		}
		
		do {
			System.out.println("i=" + i--);
		} while (i > 0);
		
		
		while (true) {
		
			if (i++ > 10) {
				break;
			}
			
			System.out.println("now i = " + i);
			
		}
		
		System.out.println("hi there!");
		
	}
	
	
}
