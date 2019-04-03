import java.util.Scanner;
import java.util.Random;
public class test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int i,j;
		int juri,peserta;
		double[] rata;
		int[][] nilai;
		int jumlah;

		System.out.print("Banyak juri    : ");
			juri = input.nextInt();
		System.out.print("Banyak peserta : ");
			peserta = input.nextInt();

		nilai = new int[peserta][juri];

		// Proses penginputan random 
		jumlah = 0;
		System.out.println("\n====Nilai Peserta====");
		for(i=0; i<peserta; i++){
			System.out.print("Peserta ke-"+i+" -> ");
			for(j=0; j<juri; j++){
				nilai[i][j] = rand.nextInt(99 - 20 + 1) + 20;
				System.out.print(nilai[i][j]+"\t");
			}
			System.out.println("");
		}

		// SORTING
		int y,temp;
		System.out.println("\n====SORTING====");
		for(i=0; i<peserta; i++){
			System.out.print("Peserta ke-"+i+" -> ");
			for(j=0; j<juri; j++){
				// Sorting array dari kecil ke besar
				for(y=j+1; y<juri; y++){
					if(nilai[i][j] > nilai[i][y]){
					temp = nilai[i][j];
					nilai[i][j] = nilai[i][y];
					nilai[i][y] = temp;
					}
				}
				System.out.print(nilai[i][j]+"\t");
			}
			System.out.println("");
		}

		// Array yang sudah dihilangkan nilai yang max dan min nya, dan mencari juara
		int ijuara = 0;
		double max;
		rata = new double[peserta];
		max = 0;
		System.out.println("\n====Menghilangkan nilai min dan max====");
		for(i=0; i<peserta; i++){
			jumlah = 0;
			System.out.print("Peserta ke-"+i+" -> ");
			for(j=1; j<(juri-1); j++){
				System.out.print(nilai[i][j]+"\t");
				jumlah += nilai[i][j];
			}
			rata[i] = (float)jumlah/(juri-2);
			if(rata[i] > max){
				// Mengambil nomor peserta
				ijuara = i;
				max = rata[i];
			}
			System.out.printf(" -> %d = %.2f",jumlah,rata[i]);
			System.out.println("");
		}

		// Rekapitulasi
		int x;
		double dummy;
		System.out.println("\n====Rekapitulasi Nilai====");
		// Insertion Sort
		for(i=0; i<peserta; i++){
			for (x=(peserta-1); x>i; x--) {
				if(rata[x] > rata[x-1]) {
					dummy   = rata[x];
					rata[x]   = rata[x-1];
					rata[x-1] = dummy;
				}
			}
			System.out.printf("Nilai ke-%d = %.2f\n",i,rata[i]);
		}

		// Peserta yang rangking pertama
		System.out.println("\nPeserta dengan No-"+ijuara);
		System.out.printf("Dengan nilai = %.2f menjadi juara!!\n",max);
	}
}