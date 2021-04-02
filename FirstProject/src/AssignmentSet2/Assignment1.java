package AssignmentSet2;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int original = num;
		int reverse = 0;
		while (num != 0) {
			int lastdigit = num % 10;
			reverse = reverse * 10 + lastdigit;
			num = num / 10;
		}
		if (reverse == original) {
			System.out.println("num is a palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

}
