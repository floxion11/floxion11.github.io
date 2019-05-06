import java.util.Scanner;

public class Tabel_perkalian {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int angka, banyakPerkalian, hasil;
		int i;

		System.out.print("Angka yang dikali : ");
			angka = input.nextInt();
		System.out.print("Banyak Perkalian  : ");
			banyakPerkalian = input.nextInt();

		for(i=1; i<=banyakPerkalian; i++) {
			hasil = angka * i;
			System.out.println(i+" x "+angka+" = "+hasil);
		}
	}
}