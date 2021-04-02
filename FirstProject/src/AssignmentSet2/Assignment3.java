package AssignmentSet2;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		int origin = num;
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		if (origin % sum == 0) {
			System.out.println("divisible by sum of digits");
		} else {
			System.out.println("not divisible by sum of digits");
		}
	}

}
