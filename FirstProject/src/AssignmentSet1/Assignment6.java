package AssignmentSet1;
import java.util.Scanner;
public class Assignment6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter number");
		int num1 = input.nextInt();
		System.out.println("enter number");
		int num2 = input.nextInt();
		System.out.println("enter number");
		int num3 = input.nextInt();
		
		if (num1 == 7) {
			System.out.println(num2 * num3);
		} else if (num2 == 7) {
			System.out.println(num3);
		} else if (num3 == 7) {
			System.out.println(-1);
		} else {
			System.out.println(num1 * num2 * num3);
		}
		
	}

}
