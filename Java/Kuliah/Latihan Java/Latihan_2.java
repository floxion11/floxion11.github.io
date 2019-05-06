import java.util.Scanner;
public class Latihan_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bulan, tahun, hari;

		System.out.print("Masukkan angka yang mewakili bulan : ");
			bulan = input.nextInt();
		// Tahun kabisat
			/*	if year modulo 4 is 0
				then
				if year modulo 100 is 0
				then
				if year modulo 400 is 0
				then
				is_leap_year
				else
				not_leap_year
				else is_leap_year
				else not_leap_year
				Source : wikipedia
			*/
		if (bulan == 2 ) {
			System.out.print("Masukkan Tahun : ");
				tahun = input.nextInt();
			if (tahun % 4 == 0 || tahun % 100 == 0 || tahun % 4 == 0) {
				hari = 29;
			} else {
				hari = 28;
			}
		} else if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12) {
			hari = 31;
		} else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
			hari = 30;
		} else {
			hari = 0;
		}
		System.out.println("Hari pada bulan ke-"+bulan+" ada "+hari+" hari");

	}
}