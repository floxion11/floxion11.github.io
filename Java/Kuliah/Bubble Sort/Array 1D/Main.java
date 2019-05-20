package kelasBubbleSortArray1D;

import java.util.Scanner;
import java.util.Random;

public class Main {
	// Method atau fungsi untuk menampilkan array
	static void printArray(int[] a,int n){
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int[] a;
		int n,temp;
		int i,j;
		int range = (90 - 20 + 1)+20;

		System.out.print("Banyak deret : ");
			n = input.nextInt();
		a = new int[n];

		// Proses penginputan
		for(i=0;i<a.length;i++) {
			a[i] = rand.nextInt(range);
		}
		printArray(a,n);

		System.out.println("\nSorting ascending (kecil ke besar)");
		// Sorting Ascending bubble sort
		for (i=0; i<n; i++) {
			for (j=(n-1); j>i; j--) {
				if(a[j] < a[j-1]) {
					temp   = a[j];
					a[j]   = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		printArray(a,n);

		System.out.println("Sorting descending (besar ke kecil)");
		// Sorting Descending bubble sort
		for (i=0; i<n; i++) {
			for (j=(n-1); j>i; j--) {
				if(a[j] > a[j-1]) {
					temp   = a[j];
					a[j]   = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		printArray(a,n);
	}
}