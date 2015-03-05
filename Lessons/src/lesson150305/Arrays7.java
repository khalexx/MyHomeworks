package lesson150305;

public class Arrays7 {

	public static void main(String[] args) {
		
		int[] a = new int[20];
		
		fillRandoms(a);
		
		java.util.Arrays.sort(a);
		
		// Sort: primitive types: TimSort (Quick Sort variant)
		// Sort: object types: MergeSort (n log n)
		
		System.out.println(java.util.Arrays.toString(a));
		
	}

	private static void fillRandoms(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 1000);
		}
	}
	
}
