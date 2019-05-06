/* Kelompok :
    - Zukron Alviandy Rahmadhan
    - Muhammad Arif
    - Devara Yulia Alindi
*/

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand   = new Random();
        // Variable pokok
        int i,j,k;
        int menu;
        int juri,peserta;
        int[][] nilai;
        int temp;

        // Variable untuk mengulangan pemograman
        char ulang;

        // Variable untuk perulangan, perulangan untuk menu, perulangan 2 untuk menu yang kedua
        boolean perulangan = true,perulangan2 = true;

        //case 2 dan case 5
        int jumlah;
	    double rata;

        // rata 2 dimensi case 3
        double key,key2;
        double[][] rata2d;

	    // Search Peserta case 5
	    int cari;

        while(perulangan){
                System.out.print("Banyak juri    : ");
                    juri = input.nextInt();
                System.out.print("Banyak peserta : ");
                    peserta = input.nextInt();
                System.out.println("\n||=========================================================||");
                System.out.println("||====================----MENU----=========================||");
                System.out.println("||1. Nilai peserta yang diberikan juri                     ||");
                System.out.println("||2. Nilai peserta sesuai aturan penjurian (Tanpa Max Min) ||");
                System.out.println("||3. Rekapitulasi nilai rata-rata akhir tiap peserta       ||");
                System.out.println("||4. Peringkat 1 kejuaraan senam (Juara)                   ||");
                System.out.println("||5. Data nilai peserta tertentu (Satu peserta)            ||");
                System.out.println("||6. Selesai                                               ||");
                System.out.println("||=========================================================||");

                /* Penginputan Nilai Random Pada perulangan pertama agar tidak kereset jika melakukan pengulangan pada 
                pengulangan kedua*/
                nilai = new int[peserta][juri];
                for(i=0; i<peserta; i++){
                    for(j=0; j<juri; j++){
                        nilai[i][j] = rand.nextInt(90 - 20 + 1) + 20;
                    }
                }
                /* CATATAN : menggunakan min dan max hanya akan memperburuk suasana, karena jika case 1 tidak dipanggil 
                duluan atau dipanggil sesudah case 2-5 hasil min atau max akan konstan dan tidak relevan pada array yang ada
                makanya digunakan sorting terlebih dahulu dan tinggal mengambil indeks=0 (untuk min) dan indeks=(juri-1) 
                (untuk max) */
                /* ^^^^^^^^^^^^^^^^..............PENGALAMAN YANG SAYA ALAMI............^^^^^^^^^^^^^^ */
                /* JIKA MEMAKAI MIN DAN MAX */

                // BUBBLE SORTING untuk nilai peserta
                for(i=0; i<peserta; i++){
                    for(j=0; j<juri; j++){
                        // Sorting array dari kecil ke besar
                        for(k=juri-1; k>j; k--){
                            if(nilai[i][j] > nilai[i][k]){
                            temp = nilai[i][j];
                            nilai[i][j] = nilai[i][k];
                            nilai[i][k] = temp;
                            }
                        }
                    }
                }
                rata2d = new double[peserta][2];/*Fungsi 2 adalah, index pertama untuk nomor peserta yang berindekskan 0
                                                index kedua untuk rata-rata yang berindekskan 1*/
	            perulangan2 = true; /* Kenapa variable perulangan2 dideklarasikan dua kali, karena jika user memilih menu 
                                       nomor 6, while yang ada dibawah akan otomatis keluar karena nilai perulangan berubah
                                       menjadi false. Ini fungsi perulangan2 dideklarasikan 2kali, yaitu dengan mereset nilai 
                                       yang false menjadi true agar si-user bisa mengakses while yang ada dibawah jika 
                                       pilihan Pada : "Ulang program atau tidak" = Y/y. Jika tidak melakukan reset User 
                                       tidak akan bisa mengakses while yang dibawah karena perulangan2 sudah tergantikan 
                                       menjadi false dan user hanya bisa mengakses while yang diatas yang hanya berisikan menu
                                       */

            while(perulangan2){
                System.out.print("\tPilih menu(1/2/3/4/5/6) : ");
                    menu = input.nextInt();
                // Menu
                System.out.println("");
                switch(menu){
                    case 1 : {
                        System.out.println("1. Nilai peserta yang diberikan juri");
                        for(i=0; i<peserta; i++){
                            System.out.print("Peserta Ke-"+(i+1)+" = ");
                            for(j=0; j<juri; j++){
                                System.out.print(nilai[i][j]+"\t");
                            }
                            System.out.println("Max = "+nilai[i][juri-1]+"   Min = "+nilai[i][0]);
                        }
                        break;
                    }
                    case 2 : {
                        System.out.println("2. Nilai peserta sesuai aturan penjurian (Tanpa Max Min)");
                        /* Array yang sudah dihilangkan nilai yang max dan min nya, menjumlahkan nilai
                        dan mencari rata-rata*/
                        for(i=0; i<peserta; i++){
                            jumlah = 0;
                            System.out.print("Peserta ke-"+(i+1)+" -> ");
                            /* Yang nilai minimum tidak ditampilkan yang mempunyai index j=0
                            Nilai maksimum juga tidak ditampilkan yang mempunyai index j=juri*/
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
                        /* Menyalin rata ke array 2 dimensi, yang mana dimensi pertama adalah nomor peserta
                        dan yang kedua adalah rata"*/
                        for(i=0; i<peserta; i++){
                            jumlah = 0;
                            /* Yang nilai minimum tidak ditampilkan yang mempunyai index j=0
                            Nilai maksimum juga tidak ditampilkan yang mempunyai index j=juri*/
                            for(j=1; j<(juri-1); j++){
                                jumlah += nilai[i][j];
                            }
                            rata2d[i][0] = i+1;
                            rata2d[i][1] = (float)jumlah/(juri-2);
                        }
                        // Insertion sort array 2 dimensi
                        for(i=1; i<peserta; i++){
                            for(j=0; j<2; j++){
                                // Key  = untuk pembanding
                                key  = rata2d[i][1];
                                // Key2 = untuk me-replace tempat yang sudah berpindah
                                key2 = rata2d[i][j];
                                k   = i-1;
                                while(k>=0 && rata2d[k][1]<key){ //Membanding kan rata-rata dengan key
                                    rata2d[k+1][j] = rata2d[k][j];
                                    k = k - 1;
                                }
                                //Ditempat yang terganti akan masuk key2 
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
                        /* Menyalin rata ke array 2 dimensi, yang mana dimensi pertama adalah nomor peserta
                        dan yang kedua adalah rata"*/
                        for(i=0; i<peserta; i++){
                            jumlah = 0;
                            for(j=1; j<(juri-1); j++){
                                jumlah += nilai[i][j];
                            }
                            rata2d[i][0] = i+1;
                            rata2d[i][1] = (float)jumlah/(juri-2);
                        }
                        // Insertion sort array 2 dimensi
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
                        // Menampilkan peserta yang juara 1 yang memiliki index 0
                        for (i=0; i<=0; i++) {
                            System.out.printf("Peserta ke-%.0f\t= %.2f\n",rata2d[i][0],rata2d[i][1]);
                        }
                        break;
                    }
                    case 5 : {
                        System.out.println("5. Data nilai peserta tertentu (Satu peserta)");
                        System.out.print("\tNilai peserta ke- : ");
                        	cari = input.nextInt();
                        cari -= 1; /* Peserta yang dicari harus dikurangi dulu agar nilai dengan nomor peserta relevan
                                      misal : nomor peserta yang dicari 6, dan peserta 6 tidak mempunyai nilai pada peserta
                                      nomor 5 atau mempunyai nilai peserta pada peserta 7 */
                        /* Pada pencarian tidak menggunakan Metode Sequential Search maupun Binary Search 
                        Tetapi menggunakan cara pengindeksan untuk menampilkannya */
                       	if(cari < peserta){
                       		// Menu Pertama
	                        for(i=cari; i<=cari; i++){
	                            System.out.print("Peserta Ke-"+(i+1)+" = ");
	                            for(j=0; j<juri; j++){
	                                System.out.print(nilai[i][j]+"\t");
	                            }
	                            System.out.println("Max = "+nilai[i][juri-1]+"   Min = "+nilai[i][0]);
	                        }
	                        System.out.println("\tNilai yang dihilangkan Max dan Min");
	                        /*Array yang sudah dihilangkan nilai yang max dan min nya
	                        dan mencari rata-rata*/
	                        for(i=cari; i<=cari; i++){
	                            jumlah = 0;
	                            System.out.print("Peserta ke-"+(i+1)+" -> ");
	                            for(j=1; j<(juri-1); j++){
	                                System.out.print(nilai[i][j]+"\t");
	                                jumlah += nilai[i][j];
	                            }
	                            rata = (float)jumlah/(juri-2);
	                            System.out.printf(" -> %d = %.2f",jumlah,rata);
	                            System.out.println("");
	                        }
	                    }else{//Jika user memasukan nomor peserta lebih dari yang mengikuti lomba
	                    	System.out.println("Peserta tidak ada");
	                    }
                        break;
                    }
                    case 6 : {
                        System.out.println("Selesai....");
                        perulangan2 = false;
                    }
                }
            }
             System.out.print("\nUlang program (Y/N) : ");
                ulang = input.next().charAt(0);
            if(ulang == 'Y' || ulang == 'y'){
                perulangan = true;
            } else if(ulang == 'N' || ulang == 'n'){
                perulangan = false; // Atau break;
            } else{
                perulangan = false;
            }
        }
        System.out.println("Keluar Program....");
    }
}