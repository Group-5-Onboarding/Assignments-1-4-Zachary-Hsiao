package AssignmentSet2;
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an armstrong number");
		int num = scan.nextInt();
		int origin = num;
		int sum = 0;
		int n = 0;
		while (num != 0) {
			num = num / 10;
			n++;
		}
		num = origin;
		while (num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, n);
			num = num / 10;
		}
		if (sum == origin) {
			System.out.println("is an armstrong");
		} else {
			System.out.println("not an armstrong");
		}
	}

}
