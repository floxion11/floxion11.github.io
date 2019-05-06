import java.util.Scanner;
import java.util.Random;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand   = new Random();

        int i,j,k;
        int menu;
        int juri,peserta;
        int[][] nilai;
        int temp;

        char ulang;

        boolean perulangan = true,perulangan2 = true;

        int max,min;
        int jumlah;
	    double rata;

        double key,key2;
        double[][] rata2d;

	    int ifound;

                System.out.print("Banyak juri    : ");
                    juri = input.nextInt();
                System.out.print("Banyak peserta : ");
                    peserta = input.nextInt();
                System.out.println("\n\t====MENU====");
                System.out.println("1. Nilai peserta yang diberikan juri");
                System.out.println("2. Nilai peserta sesuai aturan penjurian (Tanpa Max Min)");
                System.out.println("3. Rekapitulasi nilai rata-rata akhir tiap peserta");
                System.out.println("4. Peringkat 1 kejuaraan senam (Juara)");
                System.out.println("5. Data nilai peserta tertentu (Satu peserta)");
                System.out.println("6. Selesai");

                nilai = new int[peserta][juri];
                for(i=0; i<peserta; i++){
                    for(j=0; j<juri; j++){
                        nilai[i][j] = rand.nextInt(90 - 20 + 1) + 20;
                    }
                }
                rata2d = new double[peserta][2];
	            perulangan2 = true; 
	            min = max = nilai[0][0];          

            while(perulangan2){
                System.out.print("\tPilih menu(1/2/3/4/5/6) : ");
                    menu = input.nextInt();

                
                System.out.println("");
                switch(menu){
                    case 1 : {
                        System.out.println("1. Nilai peserta yang diberikan juri");
                        for(i=0; i<peserta; i++){
                            System.out.print("Peserta Ke-"+i+" = ");
                            min = max = nilai[0][0];
                            for(j=0; j<juri; j++){
                                System.out.print(nilai[i][j]+"\t");
                                if(nilai[i][j] > max){
                                    max = nilai[i][j];
                                }if(nilai[i][j] < min){
                                    min = nilai[i][j];
                                }
                            }
                            System.out.println("Max = "+max+"   Min = "+min);
                        }
                        break;
                    }
                    case 2 : {
                        System.out.println("2. Nilai peserta sesuai aturan penjurian (Tanpa Max Min)");
                        for(i=0; i<peserta; i++){
                            for(j=0; j<juri; j++){
                                for(k=juri-1; k>j; k--){
                                    if(nilai[i][j] > nilai[i][k]){
                                    temp = nilai[i][j];
                                    nilai[i][j] = nilai[i][k];
                                    nilai[i][k] = temp;
                                    }
                                }
                            }
                        }

                        for(i=0; i<peserta; i++){
                            jumlah = 0;
                            System.out.print("Peserta ke-"+i+" -> ");
                            for(j=1; j<(juri-1); j++){
                                System.out.print(nilai[i][j]+"\t");
                                jumlah += nilai[i][j];
                            }
                            rata = (float)jumlah/(juri-2);
                            System.out.printf(" -> %d = %.2f",jumlah,rata);
                            System.out.println("");
                        }
                        break;
                    }
                    case 3 : {
                        System.out.println("3. Rekapitulasi nilai rata-rata akhir tiap peserta");
                        for(i=0; i<peserta; i++){
                            for(j=0; j<juri; j++){
                                for(k=juri-1; k>j; k--){
                                    if(nilai[i][j] > nilai[i][k]){
                                    temp = nilai[i][j];
                                    nilai[i][j] = nilai[i][k];
                                    nilai[i][k] = temp;
                                    }
                                }
                            }
                        }
                        for(i=0; i<peserta; i++){
                            jumlah = 0;
                            for(j=1; j<(juri-1); j++){
                                jumlah += nilai[i][j];
                            }
                            rata2d[i][0] = i;
                            rata2d[i][1] = (float)jumlah/(juri-2);
                        }
                        for(i=1; i<peserta; i++){
                            for(j=0; j<2; j++){
                                key  = rata2d[i][1];
                                key2 = rata2d[i][j];
                                k   = i-1;
                                while(k>=0 && rata2d[k][1]<key){
                                    rata2d[k+1][j] = rata2d[k][j];
                                    k = k - 1;
                                }
                                rata2d[k+1][j] = key2;
                            }
                        }
                        for (i=0; i<peserta; i++) {
                            System.out.printf("Peserta ke-%.0f\t= %.2f\n",rata2d[i][0],rata2d[i][1]);
                        }
                        break;
                    }
                    case 4 : {
                        System.out.println("4. Peringkat 1 kejuaraan senam (Juara)");
                        for(i=0; i<peserta; i++){
                            for(j=0; j<juri; j++){
                                for(k=juri-1; k>j; k--){
                                    if(nilai[i][j] > nilai[i][k]){
                                    temp = nilai[i][j];
                                    nilai[i][j] = nilai[i][k];
                                    nilai[i][k] = temp;
                                    }
                                }
                            }
                        }
                        for(i=0; i<peserta; i++){
                            jumlah = 0;
                            for(j=1; j<(juri-1); j++){
                                jumlah += nilai[i][j];
                            }
                            rata2d[i][0] = i;
                            rata2d[i][1] = (float)jumlah/(juri-2);
                        }
                        for(i=1; i<peserta; i++){
                            for(j=0; j<2; j++){
                                key  = rata2d[i][1];
                                key2 = rata2d[i][j];
                                k   = i-1;
                                while(k>=0 && rata2d[k][1]<key){
                                    rata2d[k+1][j] = rata2d[k][j];
                                    k = k - 1;
                                }
                                rata2d[k+1][j] = key2;
                            }
                        }
                        for (i=0; i<=0; i++) {
                            System.out.printf("Peserta ke-%.0f\t= %.2f\n",rata2d[i][0],rata2d[i][1]);
                        }
                        break;
                    }
                    case 5 : {
                        System.out.println("5. Data nilai peserta tertentu (Satu peserta)");
                        System.out.print("\tNilai peserta ke- : ");
                        	ifound = input.nextInt();
                       	if(ifound < peserta){
	                        for(i=ifound; i<=ifound; i++){
	                            System.out.print("Peserta Ke-"+i+" = ");
	                            min = max = nilai[0][0];
	                            for(j=0; j<juri; j++){
	                                System.out.print(nilai[i][j]+"\t");
	                                if(nilai[i][j] > max){
	                                    max = nilai[i][j];
	                                }if(nilai[i][j] < min){
	                                    min = nilai[i][j];
	                                }
	                            }
	                            System.out.println("Max = "+max+"   Min = "+min);
	                        }
	                        for(i=ifound; i<=ifound; i++){
	                            for(j=0; j<juri; j++){
	                                for(k=juri-1; k>j; k--){
	                                    if(nilai[i][j] > nilai[i][k]){
	                                    temp = nilai[i][j];
	                                    nilai[i][j] = nilai[i][k];
	                                    nilai[i][k] = temp;
	                                    }
	                                }
	                            }
	                        }
	                        System.out.println("\tNilai yang dihilangkan Max dan Min");
	                        for(i=ifound; i<=ifound; i++){
	                            jumlah = 0;
	                            System.out.print("Peserta ke-"+i+" -> ");
	                            for(j=1; j<(juri-1); j++){
	                                System.out.print(nilai[i][j]+"\t");
	                                jumlah += nilai[i][j];
	                            }
	                            rata = (float)jumlah/(juri-2);
	                            System.out.printf(" -> %d = %.2f",jumlah,rata);
	                            System.out.println("");
	                        }
	                    }else{
	                    	System.out.println("Peserta tidak ada");
	                    }
                        break;
                    }
                    case 6 : {
                        System.out.println("Selesai....");
                        perulangan2 = false;
                    }
                }
                System.out.print("\nUlang program (Y/N) : ");
	                ulang = input.next().charAt(0);
	            if(ulang == 'Y' || ulang == 'y'){
	                perulangan = true;
	            } else if(ulang == 'N' || ulang == 'n'){
	                perulangan = false;
	            }
            }
        
    }
}