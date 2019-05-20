package kelasSalinArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i;
        int[] a;
        int[] b;
        int n;
        boolean perulangan = true;
        
        int menu;
        char ulang;
        
        System.out.print("Banyak Array : ");
            n = input.nextInt();
            
        a = new int[n];
        for(i=0; i<n; i++){
            System.out.print("A["+i+"] : ");
                a[i] = input.nextInt();
        }
        while(perulangan){
            System.out.println("\t===Menu Salin Array===");
            System.out.println("1. Salin Biasa");
            System.out.println("2. Salin Terbalik");
            System.out.println("3. Salin Genap");
            System.out.println("4. Selesai");
            System.out.print("Pilih menu(1/2/3/4) : ");
                menu = input.nextInt();
            switch(menu){
                case 1 : {
                    System.out.println("1. Salin Biasa");
                    b = new int[n];
                    for(i=0; i<n; i++){
                        b[i] = a[i];
                        System.out.println("B["+i+"] : "+b[i]);
                    }
                    break;
                }
                case 2 : {
                    System.out.println("2. Salin Terbalik");
                    b = new int[n];
                    int nbaru;
                    nbaru = n-1;
                    for(i=0; i<n; i++){
                        b[i] = a[(nbaru-i)];
                        System.out.println("B["+i+"] : "+b[i]);
                    }
                    break;
                }
                case 3 : {
                    System.out.println("3. Salin Genap");
                    b = new int[n];
                    for(i=0; i<n; i++){
                        if(a[i]%2 ==0){
                            b[i] = a[i];
                            System.out.println("B["+i+"] : "+b[i]);
                        }
                    }
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
