package Homeworks;

public class Arraycopy {

	public static void main(String[] args) {
		
		int[][] a = new int[10][10];
		
		int[][] b = new int[a.length][];
		
		
		fillRandoms(a);
		arrayCopy(a,b);
		printMatrix(a);
		a[0][0]=0;
		printMatrix(a);
		printMatrix(b);
		fastArrayCopy(a,b);
		printMatrix(b);		
	}

	private static void fastArrayCopy(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			System.arraycopy(a, 0, b, 0, a[i].length);
		}
	}

	private static void arrayCopy(int[][] a, int[][] b) {
		
//		b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			b[i] = new int[a[i].length];
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = a[i][j];
			}
		}
		
	}
	
	
	
	private static void printMatrix(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void fillRandoms(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random() * 100);				
			}
		}
	}

	
}
