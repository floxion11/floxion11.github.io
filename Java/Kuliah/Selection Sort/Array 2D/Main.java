package kelasSelectionSortArray2D;

import java.util.Scanner;
import java.util.Random;

public class Main{
	static void printArray(int[][] a, int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<1; j++){
				System.out.printf("Nilai ke-%d : %d",a[i][0],a[i][1]);
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
		int n,imin,temp;
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

		// Proses sorting
		for(i=0; i<n; i++){
			for(j=0; j<2; j++){
				imin = i;
				for(k=(i+1); k<n; k++){
					if(a[k][1] < a[imin][1]){
						imin = k;
					}
				}
				temp = a[imin][j];
				a[imin][j] = a[i][j];
				a[i][j] = temp;
			}
		}
		printArray(a,n);
	}
}