package lesson150302;

public class SumArray {

	public static void main(String[] args) {

		System.out.println(sum(new int[] { 1, 2, 3 }));

	}

	private static int sum(int[] a) {
		
//		int sum = 0;
		
		int sum;
		
		sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];  // sum = sum + a[i];
		}
		
		return sum;
	}

}
