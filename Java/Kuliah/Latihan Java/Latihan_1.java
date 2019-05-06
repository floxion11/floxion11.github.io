import java.util.Scanner;
public class Latihan_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jam,menit,detik;
		int konversiJam, konversiMenit, konversiDetik;
		int totalKonversi;
		int sesudah, sebelum;

		System.out.print("Masukkan Jam   : ");
			jam = input.nextInt();
		System.out.print("Masukkan Menit : ");
			menit = input.nextInt();
		System.out.print("Masukkan Detik : ");
			detik = input.nextInt();

		konversiJam   = jam * 3600;
		konversiMenit = menit * 60;
		konversiDetik = detik;

		totalKonversi = konversiJam + konversiMenit + konversiDetik;
		if(totalKonversi == 0 ) {
			sesudah = totalKonversi + 1;
			totalKonversi = 86400;
			sebelum = totalKonversi - 1;
		} else {
			sesudah = totalKonversi + 1;
			sebelum = totalKonversi - 1;
		}
		konversiJam   = sesudah / 3600;
		konversiMenit = sesudah % 3600 / 60;
		konversiDetik = sesudah % 3600 % 60;
		System.out.println("Waktu sesudah 1 detik ->");
		System.out.println("Jam   : "+konversiJam);
		System.out.println("Menit : "+konversiMenit);
		System.out.println("Detik : "+konversiDetik);
		System.out.println("");
		konversiJam   = sebelum / 3600;
		konversiMenit = sebelum % 3600 / 60;
		konversiDetik = sebelum % 3600 % 60;
		System.out.println("Waktu sebelum 1 detik ->");
		System.out.println("Jam   : "+konversiJam);
		System.out.println("Menit : "+konversiMenit);
		System.out.println("Detik : "+konversiDetik);

	}
}