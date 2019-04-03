import java.util.Scanner;
public class Latihan_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int kubik;
		int pembayaranWajib, pembayaranTambahan;
		int totalPembayaran;

		System.out.print("Masukkan pemakaian air (kubik) : ");
			kubik = input.nextInt();
		if (kubik > 20) {
			pembayaranWajib    = 20 * 3000;
			pembayaranTambahan = (kubik - 20) * 5000;
			totalPembayaran    = pembayaranWajib + pembayaranTambahan;
		} else {
			pembayaranWajib    = kubik * 3000;
			totalPembayaran    = pembayaranWajib;
		}
		System.out.println("Biaya yang harus anda bayar Rp. "+totalPembayaran);
	}
}