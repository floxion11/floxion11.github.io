import java.util.Scanner;
import java.util.Random;

public class Sequential_search {
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
		int n,i,found,x;
		int pilih;
		int range = (90 - 20 +1)+20;

		System.out.print("Banyak Array : ");
			n = input.nextInt();
		a = new int[n];

		// Proses penginputan
		for(i=0; i<n; i++) {
			a[i] = rand.nextInt(range);
		}
		printArray(a,n);

		System.out.print("\nMasukkan angka yang dicari : ");
			x = input.nextInt();

		System.out.print("Pilih versi 1 atau 2 (1/2) : ");
			pilih = input.nextInt();
		if(pilih == 1){
			found = i = 0;
			while((i<n) && (found == 0)){
				if(a[i] == x) {
					found = 1;
				}
				i += 1;
			}
			if (found == 1){
				System.out.println(x+" Ada pada indeks "+(i-1));
			}else{
				System.out.println(x+" Tidak ada");
			}
		}else if(pilih == 2) {
			for(i=0; i<n; i++){
				if(a[i] == x) {
					System.out.println(x+" Ada pada indeks "+i);
				}
			}
		}
	}
}