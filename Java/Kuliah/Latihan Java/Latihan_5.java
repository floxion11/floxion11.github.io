package kelasLatihan5;

import java.util.Scanner;

public class Latihan_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int banyakDeret,i;
		long a,b,c;

		System.out.print("Banyak deret : ");
			banyakDeret = input.nextInt();
		System.out.print("Input ke-1 : ");
			a = input.nextInt();
		System.out.print("Input ke-2 : ");
			b = input.nextInt();
		System.out.print(a+" "+b); 

		for(i=3;i<=banyakDeret;i++) {
			c = a*b;
			System.out.print(" "+c); 
			a = b;
			b = c;
		}
		System.out.println("");
	}
}