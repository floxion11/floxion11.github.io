import java.util.Scanner;

public class Insertion_Sort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] a;
		int n,i,j,key;

		System.out.print("Banyak deret : ");
			n = input.nextInt();

		a = new int[n];
		for(i=0; i<n; i++) {
			System.out.print("Indeks ke-"+i+" = ");
				a[i] = input.nextInt();
		}

		// Algoritam Insertion Sort kecil ke besar
		for(i=1; i<n; i++) {
			key = a[i];
			j 	= i-1;
			while(j>=0 && a[j]>key){
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = key;
		}

		System.out.println("\nKecil ke Besar");
		// Pemanggilaan array 
		for(int hasil : a) {
			System.out.print(hasil + " ");
		}

		// Algoritam Insertion Sort besar ke kecil
		for(i=1; i<n; i++) {
			key = a[i];
			j 	= i-1;
			while(j>=0 && a[j]<key){
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = key;
		}

		System.out.println("\nBesar ke Kecil");
		// Pemanggilaan array 
		for(int hasil : a) {
			System.out.print(hasil + " ");
		}
	}
}