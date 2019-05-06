import java.util.*;
public class dummy3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x=0;
		try{
		System.out.print("Input : ");
			x = input.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("Pilihan tidak ada !!");
		}
		switch(x){
			case 1 : {System.out.println("Case 1");
			break;
			}
		}
	}
}