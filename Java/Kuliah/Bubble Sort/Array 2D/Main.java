package kelasBubbeSortArray2D;

import java.util.Scanner;
import java.util.Random;

public class Main{
	static void printArray(int[][] a,int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<1; j++){
				System.out.printf("Nilai Ke-%d : %d",a[i][0],a[i][1]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int[][] a;
		int i,j,k;
		int n,temp;
		int range = (90 - 20 +1)+20;

		System.out.print("Banyak nilai : ");
			n = input.nextInt();
		a = new int[n][2];

		// Penginputan
		for(i=0; i<n; i++){
			for(j=0; j<2; j++){
				a[i][0] = i;
				a[i][1] = rand.nextInt(range);
			}
		}
		printArray(a,n);

		// Proses pengurutan
		for(i=0; i<n; i++){
			for(j=0; j<2; j++){
				for(k=(n-1); k>i; k--){
					if(a[k][1] < a[k-1][1]){
						temp = a[k][j];
						a[k][j] = a[k-1][j];
						a[k-1][j] = temp;
					}
				}
			}
		}
		printArray(a,n);
	}
}