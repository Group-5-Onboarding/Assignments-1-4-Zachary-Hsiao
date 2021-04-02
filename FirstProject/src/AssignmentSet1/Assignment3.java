package AssignmentSet1;
import java.util.Scanner;
public class Assignment3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter fahrenheit");
		int fahr = input.nextInt();
		double celsius = ((fahr - 32) / 9) * 5;
		System.out.println(celsius);
	}
}
