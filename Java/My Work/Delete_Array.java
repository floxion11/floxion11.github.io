import java.util.Scanner;
import java.util.Arrays;

public class Delete_Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] a;
		int i,j,banyakArray;
		int pilih,indexDelete,nilaiDelete;
		int urut=0;

		System.out.print("Banyak array : ");
			banyakArray = input.nextInt();

		a = new int[banyakArray];
		for(i=0; i<a.length; i++){
			System.out.print("Angka ke-"+(i+1)+" = ");
				a[i] = input.nextInt();
		}

		System.out.print("\n1. Hapus berdasarkan index\n2. Hapus berdasarkan nilai\nPilih : ");
			pilih = input.nextInt();
		if(pilih == 1){
			System.out.print("\nIndex array yang ingin dihapus : ");
				indexDelete = input.nextInt();

			for(i=0; i<indexDelete-1; i++) {
				System.out.println("Angka ke-"+(urut+=1)+" = "+a[i]);
			}

			for(i=indexDelete; i<a.length; i++) {
				System.out.println("Angka ke-"+(urut+=1)+" = "+a[i]);
			}
		} else if (pilih == 2) {
			System.out.print("\nNilai array yang ingin dihapus : ");
				nilaiDelete = input.nextInt();

			for(i=0; i<banyakArray; i++) {
				if (nilaiDelete == a[i]) {

					indexDelete = i+1;
					System.out.println(indexDelete);
					for(i=0; i<indexDelete-1; i++) {
						System.out.println("Angka ke-"+(urut+=1)+" = "+a[i]);
					}

					for(i=indexDelete; i<a.length; i++) {
						System.out.println("Angka ke-"+(urut+=1)+" = "+a[i]);
					}
				}
			}
		} else {
			System.out.println("Pilihan kagak ada");
		}
	}
}