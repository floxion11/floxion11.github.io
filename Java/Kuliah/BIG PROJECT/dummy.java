import java.util.*;
public class dummy{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[][] nilai;
        int i,j,n;

        System.out.print("Banyak peserta : ");
            n = input.nextInt();

        nilai = new int[n][2];
        for(i=0; i<n; i++){
            System.out.print("Peserta ke-"+i+" = ");
            for(j=0; j<2; j++){
                nilai[i][0] = i;
                nilai[i][1] = rand.nextInt(90 - 20 +1) + 20;
                System.out.print(nilai[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("");
        for (i=0; i<n; i++) {
            System.out.println("Peserta ke-"+nilai[i][0]+" = "+nilai[i][1]);
        }

        System.out.println("");
        // for(i=1; i<n; i++) {
        //     key = a[i];
        //     j   = i-1;
        //     while(j>=0 && a[j]<key){
        //         a[j+1] = a[j];
        //         j = j-1;
        //     }
        //     a[j+1] = key;
        // }
        
        int k,key,key2;
        for(i=1; i<n; i++){
            for(j=0; j<2; j++){
                key  = nilai[i][1];
                key2 = nilai[i][j];
                k   = i-1;
                while(k>=0 && nilai[k][1]<key){
                    nilai[k+1][j] = nilai[k][j];
                    k = k - 1;
                }
                nilai[k+1][j] = key2;
            }
        }
        System.out.println("");
        for (i=0; i<n; i++) {
            System.out.println("Peserta ke-"+nilai[i][0]+" = "+nilai[i][1]);
        }
    }
}