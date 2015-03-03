package lesson150303;

public class Strings {

	public static void main(String[] args) {
		
		String s = "";
		String t = "Hello";
		//__________01234
		System.out.println(t);
		System.out.println(t.substring(2, 4));
		
		String r = t + "123";
		
		System.out.println(r);
		
		System.out.println(t + 456);
		
		int sum = 100;
		
		System.out.println("Sum = " + sum);
		
		String x = new String("Hello");
		
		System.out.println(x == t);
		System.out.println(x.equals(t));
		
	}
	
}
