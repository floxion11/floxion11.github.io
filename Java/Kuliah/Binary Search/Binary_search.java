import java.util.Scanner;
import java.util.Random;

public class Binary_search {
	// Method atau Fungsi untuk menampilkan array
	static void printArray(int[] a,int n){
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int[] a;
		int n,i,j;
		int key;
		int l,r,m,x;
		int ix, found;
		int range = (90 - 20 +1)+20;

		System.out.print("Banyak Array : ");
			n = input.nextInt();
		a = new int[n];

		// Proses penginputan
		for(i=0; i<n; i++){
			a[i] = rand.nextInt(range);
		}
		printArray(a,n);

		System.out.print("\nMasukkan angka yang dicari : ");
			x = input.nextInt();

		// Algoritma Insertion sort kecil ke besar 
		for(i=1; i<n; i++) {
			key = a[i];
			j 	= i-1;
			while(j>=0 && a[j]>key){
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = key;
		}

		System.out.println("\nPengurutan array");
		for (i=0; i<n; i++) {
			System.out.println("Indeks ke-"+i+" = "+a[i]);
		}

		System.out.println(" ");
		// Algoritma Binary Search
		l = ix = 0;
		r = n-1;
		found = 0;
		while((l<=r) && (found == 0)) {
			m = (l+r) / 2;
			if(x == a[m]) {
				found = 1;
				ix    += m;
			} else if (x < a[m]) {
				r = m-1;
			} else if (x > a[m]) {
				l = m+1;
			}
		}
		if (found == 1) {
			System.out.println(x+" Ketemu pada indeks "+ix);
		} else if (found == 0) {
			System.out.println(x+" Tidak ada");
		}
	}
}