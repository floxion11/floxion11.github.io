import java.util.Scanner;
public class mainStack{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StackFunction stack = new StackFunction();
		stack.push("Alvin");
		System.out.println("Data teratas adalah : "+stack.peek());
	}
}