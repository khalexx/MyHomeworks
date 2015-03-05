package lesson150305;

public class Arrays8 {

	public static void main(String[] args) {
		
		int[] a = new int[100000];
		
		fillRandoms(a);
		
		java.util.Arrays.sort(a);

		int index = java.util.Arrays.binarySearch(a, 20);
		
		System.out.println(index);
		
		System.out.println(java.util.Arrays.toString(a));
		
	}

	private static void fillRandoms(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100000);
		}
	}
	
}
