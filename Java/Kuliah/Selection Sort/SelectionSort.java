import java.util.Scanner;
import java.util.Arrays; // Package array

public class SelectionSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] a,b;
		int n,i,j;
		int temp, imin, imax;

		System.out.print("Banyak deret : ");
			n = input.nextInt();

		// Memberi batasan array
		a = new int[n];
		b = new int[n];

		// Penginputan
		// Length property dri Arrays untuk mengetahui batasan array
		for(i=0; i<a.length; i++) {
			System.out.print("Angka ke-"+(i+1)+" : ");
				a[i] = input.nextInt();
				b[i] = a[i];
		}

		// Proses pengurutan min ke max
		for (i=0; i<a.length; i++) {
			imin = i;
			for (j=(i+1); j<a.length; j++) {
				if (a[j] < a[imin]) {
					imin = j;
				}
				temp    = a[imin];
				a[imin] = a[i];
				a[i]    = temp;
			}
		}

		for(int hasilSorting : a) {
			System.out.print(hasilSorting+" ");
		}
	}
}