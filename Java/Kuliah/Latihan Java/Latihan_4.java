import java.util.Scanner;
public class Latihan_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nilai,juri;
		int i;
		int max,min;
		int jumlah;
		double rata;

		max = jumlah = 0;
		System.out.print("Banyak Juri    : ");
			juri = input.nextInt();

		System.out.println("");
		System.out.print("Nilai ke-1 : ");
			nilai = input.nextInt();
		jumlah += nilai;
		min     = nilai;
		for(i=2;i<=juri;i++){
			System.out.print("Nilai ke-"+i+" : ");
			nilai = input.nextInt();
			jumlah += nilai;
			if (nilai > max) {
				max = nilai;
			} if (nilai < min) {
				min = nilai;
			}
		}
		jumlah -= max;
		jumlah -= min;
		rata    = (float)jumlah / (juri-2);
		System.out.println("");
		System.out.println("Nilai yang didapat peserta adalah "+rata);
	}
}