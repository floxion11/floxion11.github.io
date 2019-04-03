import java.util.Scanner;

public class Penilaian_senam {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int juri, nilai;
		int i;
		int jumlah, min, max;
		double rata;

		System.out.print("Banyak juri : ");
			juri = input.nextInt();
		System.out.print("Nilai ke-1 = ");
			nilai = input.nextInt();
		jumlah = max = 0;
		min    = nilai;

		jumlah += nilai;
		for(i=2; i<=juri; i++){
			System.out.print("Nilai ke-"+i+" = ");
				nilai = input.nextInt();
			jumlah += nilai;

			if(nilai > max){
				max = nilai;
			} if (nilai < min){
				min = nilai;
			}
		}
		rata = (float)(jumlah-(min+max))/(juri-2);
		System.out.printf("\nNilai yang didapatkan peserta tersebut = %.2f\n",rata);
	}
}