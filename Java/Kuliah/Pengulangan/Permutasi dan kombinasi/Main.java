package kelasPermutasiDanKombinasi;

import java.util.Scanner;

public class Main {
	static int faktorial (int x){
		int i;
		int faktor = 1;

		for(i=1; i<=x; i++){
			faktor *= i;
		}
		return faktor;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int n,r;
		int faktorialN, faktorialR, faktorialNR;
		double permutasi,kombinasi;

		System.out.print("Masukkan nilai N : ");
			n = input.nextInt();
		System.out.print("Masukkan nilai R : ");
			r = input.nextInt();

		faktorialN  = faktorial(n);
		faktorialR  = faktorial(r);
		faktorialNR = faktorial(n-r);

		permutasi   = (float)faktorialN/faktorialNR; 
		kombinasi   = (float)faktorialN/(faktorialR*faktorialNR);
		System.out.println("\tPermutasi") ;
		System.out.printf("%d permutasi %d = %.2f\n",n,r,permutasi);

		System.out.println("\tKombinasi") ;
		System.out.printf("%d kombinasi %d = %.2f\n",n,r,kombinasi);
	}
}