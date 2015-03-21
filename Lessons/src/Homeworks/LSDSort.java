package Homeworks;

import java.util.Arrays;
import java.util.Random;

public class LSDSort {

	private static final int MAX = 1000000;

	public static void main(String[] args) {
		
		int[] data = generate();
	
		long start = System.currentTimeMillis();
		lSDSort(data);
		long stop = System.currentTimeMillis();
		
		System.out.println("Elapsed = " + (stop - start));
		printMatrix(data);
		
//		long start = System.currentTimeMillis();
//		data=wikiSort(data);
//		long stop = System.currentTimeMillis();
//		
//		System.out.println("Elapsed = " + (stop - start));
		
//		long start = System.currentTimeMillis();
//		Arrays.sort(data);
//		long stop = System.currentTimeMillis();		
//		System.out.println("Elapsed = " + (stop - start));
	}

	private static int[] generate() {
		int[] data = new int[MAX];
		
		Random random = new Random();
		
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(MAX); // 0 - 999999
		}
		
		return data;
	}
	
	private static void lSDSort(int[] a) { 
		
		int digit=0;		// разряд		
		int lastsorted=0;	// место последнего элемента который отсортирован в текущем разряде
		int[] masks = new int[8];
		
		for (int i = 0; i < masks.length; i++) {
			masks[i]=0xf<<i*4;
		}
		
		int [] temp = new int[a.length];
		
		while (digit<5) {
			System.arraycopy(a, 0, temp, 0, a.length);
			for (int i = 0; i < 0x10; i++) {
					for (int items = 0; items < MAX; items++) {
						if ((i << 4 * digit) == (temp[items] & masks[digit])) {		
							
							a[lastsorted] = temp[items];
							lastsorted++;
							
						}
					}
				}
			lastsorted = 0;
			digit++;
		}
		
		
		
	}
	
	
	public static int[] wikiSort(int[] old) {  //Radix сортировка из википедии
	    // Loop for every bit in the integers
	    for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
	        // The array to put the partially sorted array into
	        int[] tmp = new int[old.length];
	        // The number of 0s
	        int j = 0;
	 
	        // Move the 0s to the new array, and the 1s to the old one
	        for (int i = 0; i < old.length; i++) {
	            // If there is a 1 in the bit we are testing, the number will be negative
	            boolean move = old[i] << shift >= 0;
	 
	            // If this is the last bit, negative numbers are actually lower
	            if (shift == 0 ? !move : move) {
	                tmp[j] = old[i];
	                j++;
	            } else {
	                // It's a 1, so stick it in the old array for now
	                old[i - j] = old[i];
	            }
	        }
	 
	        // Copy over the 1s from the old array
	        for (int i = j; i < tmp.length; i++) {
	            tmp[i] = old[i - j];
	        }
	 
	        // And now the tmp array gets switched for another round of sorting
	        old = tmp;
	    }
	 
	    return old;
	}
	
	private static void printMatrix(int[] ar) {
		for (int i = 0; i < 100; i++) {
			System.out.printf("%d ",ar[i]);
		}
	}
}

