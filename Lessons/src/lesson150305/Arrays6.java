package lesson150305;

import java.util.Arrays;

public class Arrays6 {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,2,3},	
				{4,5,6},	
				{7,8,9},	
		};
		
		int[][] b = new int[a.length][];
		
		// shallow copy
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		
		a[0][0] = 0;
		a[1][0] = 0;
		a[2][0] = 0;
		
		printMatrix(b);
		
		System.out.println(Arrays.deepToString(a));
		
	}

	private static void printMatrix(int[][] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
