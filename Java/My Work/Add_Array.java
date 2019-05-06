import java.util.Scanner;
import java.util.Arrays;

public class Add_Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] a,b;
		int i,j,banyakArray;
		int addIndex,addValue;

		System.out.print("Banyak array : ");
			banyakArray = input.nextInt();

		a = new int[banyakArray];
		b = new int[banyakArray];

		for(i=0; i<a.length; i++) {
			System.out.print("Angka ke-"+(i)+" = ");
				a[i] = input.nextInt();
		}

		System.out.print("\nNilai yang mau ditambahkan : ");
			addValue = input.nextInt();
		System.out.print("Setelah index -> ");
			addIndex = input.nextInt();
			addIndex +=1;
			// banyakArray +=1;

		for(i=0; i<addIndex; i++) {
			a[i] = a[i];
		}

		a = new int[banyakArray+1];
		for (i=addIndex+1; i<banyakArray; i++) {
			a[i] = a[i-1];
		}

		for(int arrayA : a) {
			System.out.print(arrayA+" ");
		}

		for(i=addIndex; i<=addIndex; i++) {
			b[i] = addValue;
		}
		System.out.println("\n");


	}
}