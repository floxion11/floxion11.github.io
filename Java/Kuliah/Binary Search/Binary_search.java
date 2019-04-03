import java.util.Scanner;

public class Binary_search {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int[] a;
		int n,i,j;
		int key;
		int l,r,m,x;
		int ix, found;

		System.out.print("Banyak Array : ");
			n = input.nextInt();

		a = new int[n];
		for(i=0; i<n; i++){
			System.out.print("Indeks ke-"+i+" = ");
				a[i] = input.nextInt();
		}

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