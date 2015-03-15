package Homeworks;

import java.util.Scanner;

public class MultArray {

	public static void main(String[] args) {
		
		int ai,aj,bi,bj;
		
		Scanner asker = new Scanner(System.in);
		
		for (;;) {
			System.out.println("Input multiplyed matrix's dimensions(ai aj bi bj): ");
			
			ai=Integer.parseInt(asker.next());
			aj=Integer.parseInt(asker.next());
			bi=Integer.parseInt(asker.next());
			bj=Integer.parseInt(asker.next());
			
			if (!(ai > 0 && aj > 0 && bi > 0 && bj > 0)) {
				System.out.println("Wrong dimension detected.");
				continue;
			}

			if (aj != bi){
				System.out.println("Matrix's not multiplyable.");
				continue;
			}
			
			break;
		}; 
		
		int[][] a = new int[ai][aj];
		int[][] b = new int[bi][bj];
		int[][] c = new int[ai][bj];
	
		fillRandoms(a);
		fillRandoms(b);
		
		System.out.printf("We have 2 matrix: a[%d][%d] b[%d][%d]\n",ai,aj,bi,bj);
		
		printMatrix(a);
		printMatrix(b);
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = elemVal(a,b,i,j);
			}
		}
		
		System.out.println("a x b =");
		printMatrix(c);
	}
	
	private static int elemVal(int[][] a, int[][] b, int ielem, int jelem) {
		
		int val = 0;
		
		for (int m=0;m<a[ielem].length;m++) {
			val += a[ielem][m]*b[m][jelem];
		}
		
		return val;
		
	}
	
	private static void fillRandoms(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random() * -198 + 99 );				
			}
		}
	}

	private static void printMatrix(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%7d",ar[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
