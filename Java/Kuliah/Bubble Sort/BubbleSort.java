import java.util.Scanner;
import java.util.Arrays; //package array

public class BubbleSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] a,b;
		int n,temp;
		int i,j;

		System.out.print("Banyak deret : ");
			n = input.nextInt();

		// Untuk memberikan batas pada array
		a = new int[n];
		b = new int[n];

		// length = property array untuk mengetahui panjang array
		for(i=0;i<a.length;i++) {
			System.out.print("Angka ke-"+(i+1)+" = ");
				a[i] = input.nextInt();
				b[i] = a[i];
		}

		// Sorting Ascending bubble sort
		for (i=0; i<a.length; i++) {
			for (j=(a.length-1); j>i; j--) {
				if(a[j] < a[j-1]) {
					temp   = a[j];
					a[j]   = a[j-1];
					a[j-1] = temp;
				}
			}
		}

		// Sorting Descending bubble sort
		for (i=0; i<a.length; i++) {
			for (j=(a.length-1); j>i; j--) {
				if(b[j] > b[j-1]) {
					temp   = b[j];
					b[j]   = b[j-1];
					b[j-1] = temp;
				}
			}
		}

		System.out.println("\nSorting ascending (kecil ke besar)");
		for(int hasilSorting : a) {
			System.out.print(hasilSorting+" ");
		}
		System.out.println("");

		System.out.println("Sorting descending (besar ke kecil)");
		for(int hasilSorting : b) {
			System.out.print(hasilSorting+" ");
		}
		System.out.println("");
	}
}