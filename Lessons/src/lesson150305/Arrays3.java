package lesson150305;

public class Arrays3 {

	public static void main(String[] args) {
		
		int a[][] = {
				{1,2,3},	
				{4,5,6},	
				{7,8,9},	
		};
		
		int x = indexOfSum(a, 10);
		
		System.out.println(x);
		
	}

	private static int indexOfSum(int[][] a, int max) {
		int sum = 0;
		int n = -1;

		OUTER: 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				n++;
				sum += a[i][j];
				if (sum > max) {
					break OUTER;
				}
			}
		}
		
		return n;
	}
	
}
