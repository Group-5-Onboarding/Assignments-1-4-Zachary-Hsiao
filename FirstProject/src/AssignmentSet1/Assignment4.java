package AssignmentSet1;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = input.nextInt();
		System.out.println("enter num2");
		int num2 = input.nextInt();
		if (num1 == num2) {
			System.out.println(num1 + num2);
		} else {
			System.out.println(2*(num1 + num2));
		}

	}

}
