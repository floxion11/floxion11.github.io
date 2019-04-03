import java.util.Scanner;

public class Sequential_search {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] a;
		int n,i,found,x;
		byte pilih;

		System.out.print("Banyak Array : ");
			n = input.nextInt();

		a = new int[n];
		for(i=0; i<n; i++) {
			System.out.print("Indeks ke-"+i+" = ");
				a[i] = input.nextInt();
		}

		System.out.print("\nMasukkan angka yang dicari : ");
			x = input.nextInt();

		System.out.print("Pilih versi 1 atau 2 (1/2) : ");
			pilih = input.nextByte();
		if(pilih == 1) {
			found = i = 0;
			while((i<n) && (found == 0)) {
				if(a[i] == x) {
					found = 1;
				}
				i += 1;
			}
			if (found == 1){
				System.out.println(x+" Ada pada indeks "+(i-1));
			} else {
				System.out.println(x+" Tidak ada");
			}
		} else if (pilih == 2) {
			for(i=0; i<n; i++) {
				if (a[i] == x) {
					System.out.println(x+" Ada pada indeks "+i);
				}
			}
		}
	}
}