import java.util.Scanner;
import java.util.Arrays;
/*






										MASIH BELUM SELESAI






*/

public class NoDuplicate_Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] a;
		int i,j,banyakArray;
		int temp;
		int indexB=0;

		System.out.print("Banyak array : ");
			banyakArray = input.nextInt();

		a = new int[banyakArray];
		for(i=0; i<a.length; i++) {
			System.out.print("Nilai Ke-"+(i+1)+" = ");
				a[i] = input.nextInt();
		}

		// Sorting dari kecil ke besar
		for(i=0; i<a.length; i++) {
			for(j=(a.length-1); j>i; j-- ) {
				if(a[j] < a[j-1]) {
					temp   = a[j];
					a[j]   = a[j-1];
					a[j-1] = temp;
				}
			}
		}

		// Penyeleksian jika ada yang duplikat
		for(i=0; i<a.length; i++) {
			for(j=(i+1); j<a.length; j++){
				if(a[i] != a[j]) {
					indexB += 1;
					System.out.println(" = ");
					System.out.println("Nilai Ke-"+(i+1)+" = "+a[i]);
				}
			}
		}
		System.out.print("index B : "+indexB+"   ");
		for(int array : a){
			System.out.print(array+" ");
		}
	}
}