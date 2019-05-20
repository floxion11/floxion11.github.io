package kelasTambahDanHapusArray;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i,n,menu;
        int[] a;
        int[] b;
        boolean perulangan = true;
        
        int itambah;
        int xtambah;
        int ihapus;
        
        char ulang;
        
        System.out.print("Banyak Array : ");
            n = input.nextInt();
        
        a = new int[n];
        for(i=0; i<n; i++){
            System.out.print("A["+i+"] : ");
                a[i] = input.nextInt();
        }
        while(perulangan){
            System.out.println("\t====Menu====");
            System.out.println("1. Tambah Array");
            System.out.println("2. Hapus Array");
            System.out.println("3. Hapus Array(berdasarkan nilai)");
            System.out.println("4. Selesai");
            System.out.print("Pilih (1/2/3/4) : ");
                menu = input.nextInt();
            
            switch(menu){
                case 1 : {
                    System.out.println("1. Tambah Array");
                    System.out.print("Pada indeks berapa  : ");
                        itambah = input.nextInt();
                    System.out.print("Angka yang ditambah : ");
                        xtambah = input.nextInt();
                    b = new int[n+1];
                    for(i=0; i<itambah; i++){
                        b[i] = a[i];
                        System.out.println("B["+i+"] : "+b[i]);
                    }
                    for(i=itambah; i<=itambah; i++){
                        b[itambah] = xtambah;
                        System.out.println("B["+i+"] : "+b[i]);
                    }
                    for(i=(itambah+1); i<=n; i++){
                        b[i] = a[i-1];
                        System.out.println("B["+i+"] : "+b[i]);
                    }
                    break;
                }
                case 2 : {
                    System.out.println("2. Hapus Array");
                    System.out.print("Indeks yang dihapus : ");
                        ihapus = input.nextInt();
                    b = new int[n-1];
                    for(i=0; i<ihapus; i++){
                        b[i] = a[i];
                        System.out.println("B["+i+"] : "+b[i]);
                    }
                    for(i=ihapus; i<=ihapus; i++){
                        b[i] = a[i+1];
                        System.out.println("B["+i+"] : "+b[i]);
                    }
                    break;
                }
                case 3 : {
                    System.out.println("3. Hapus Array(berdasarkan nilai)");
                    break;
                }
                case 4 : {
                    System.out.println("4. Selesai");
                    perulangan = false;
                }
                default : {
                    perulangan = true;
                }
            }
            System.out.print("Ulang (y/n) : ");
                ulang = input.next().charAt(0);
            if(ulang == 'Y' || ulang == 'y'){
                perulangan = true;
            }else{
                perulangan = false;
            }
        }
    }
}
