package lesson150305;

public class Arrays4 {

	public static void main(String[] args) {
		
		int a[][] = {
				{1,2,0,3, 10, 30, 0, 90},	
				{4,5,6},	
				{7,8,0,9, 0},	
		};
		
		int zeroes = countZeroes(a);
		
		System.out.println(zeroes);
	}

	private static int countZeroes(int[][] a) {
		
		int n = 0;
		
		OUTER:
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 0) {
					n++;
					continue OUTER;
				}
				// do something
			}
		}
		
		return n;
	}
	
}
