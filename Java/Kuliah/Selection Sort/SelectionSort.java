import java.util.Scanner;
import java.util.Random;

public class SelectionSort {
	// Method atau Fungsi untuk menampilkan array
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
		int i,j;
		int temp,n;
		int imin, imax;
		int range = (90 - 20 +1)+20;

		System.out.print("Banyak deret : ");
			n = input.nextInt();

		// Memberi batasan array
		a = new int[n];

		// Penginputan
		for(i=0; i<n; i++) {
			a[i] = rand.nextInt(range);
		}
		printArray(a,n);

		// Proses pengurutan min ke max
		System.out.println("\nPengurutan min ke max");
		for (i=0; i<n; i++) {
			imin = i;
			for (j=(i+1); j<n; j++) {
				if (a[j] < a[imin]) {
					imin = j;
				}
			}
			temp    = a[imin];
			a[imin] = a[i];
			a[i]    = temp;
		}
		printArray(a,n);

		// Proses pengurutan max ke min
		System.out.println("pengurutan max ke min");
		for (i=0; i<n; i++) {
			imax = i;
			for (j=(i+1); j<n; j++) {
				if (a[j] > a[imax]) {
					imax = j;
				}
			}
			temp    = a[imax];
			a[imax] = a[i];
			a[i]    = temp;
		}
		printArray(a,n);
	}
}