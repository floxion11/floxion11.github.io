import java.util.*;
public class dummy2{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int[][] nilai;
		int i,j,n;

		System.out.print("Banyak Peserta : ");
			n = input.nextInt();

		int x = -1;
		nilai = new int[n][2];
		for(i=0; i<n; i++){
			System.out.print("Peserta ke-"+i+" = ");
			for(j=0; j<2; j++){
				nilai[i][0] = i;
				nilai[i][1] = rand.nextInt(90 - 20 +1)+20;
				System.out.print(nilai[i][j]+" ");
			}
			System.out.println("");
		}

		System.out.println("");
		int k,temp;
		for(i=0; i<n; i++){
			for(j=0; j<2; j++){
				for(k=(n-1); k>i ; k--){
					if(nilai[k][1] > nilai[k-1][1]){
						temp         = nilai[k][j];
						nilai[k][j]  = nilai[k-1][j];
						nilai[k-1][j]= temp;
					}
				}
				
			}
			System.out.println("Peserta ke-"+nilai[i][0]+" = "+nilai[i][1]);
		}

		System.out.println("");
		for(i=0; i<n; i++){
			System.out.print("Peserta ke-"+nilai[i][0]+" = ");
			for (j=1; j<2; j++){
				System.out.print(nilai[i][1]+"");
			}
			System.out.println("");
		}
	}
}