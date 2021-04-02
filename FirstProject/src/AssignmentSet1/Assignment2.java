package AssignmentSet1;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter radius integer");
		double radius = input.nextInt();
		final double pi = 3.14;
		System.out.println(radius * radius * pi);
	}

}
