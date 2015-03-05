package lesson150305;

public class Arrays {

	public static void main(String[] args) {
	
		// FIXME improve this code
		
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int[][] b = {
				{0,1,2,3},
				{4,5,0,6},
				{7,8,9,0},
		};
		
		int[][] c = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
		};
		
		int[][] d = {
				{1,2,3},
				{4,5},
				{7,},
		};
		
		printMatrix(a);
		printMatrix(b);
		printMatrix(c);
		printMatrix(d);
	}

	private static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
