import java.util.Scanner;
import java.util.Random;

public class Insertion_Sort {
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
		int n,i,j,key;
		int range = (90 - 20 + 1)+20;

		System.out.print("Banyak deret : ");
			n = input.nextInt();
		a = new int[n];

		// Proses penginputan
		for(i=0; i<n; i++) {
			a[i] = rand.nextInt(range);
		}
		printArray(a,n);

		System.out.println("\nMin to max");
		// Algoritam Insertion Sort Min to max
		for(i=1; i<n; i++) {
			key = a[i];
			j 	= i-1;
			while(j>=0 && a[j]>key){
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = key;
		}
		printArray(a,n);

		System.out.println("Max to min");
		// Algoritma Insertion Sort Max to min
		for(i=1; i<n; i++) {
			key = a[i];
			j 	= i-1;
			while(j>=0 && a[j]<key){
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = key;
		}
		printArray(a,n);
	}
}