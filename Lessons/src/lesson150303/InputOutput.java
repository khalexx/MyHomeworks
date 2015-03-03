package lesson150303;

public class InputOutput {

	public static void main(String[] args) {
		
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		
		System.out.println();
		
		System.err.print(1);
		System.err.print(2);
		System.err.print(3);
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = scanner.nextLine();
		
		System.out.println("Hello, " + name);
		
	}
	
	
}
