package AssignmentSet1;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter integer for a");
		int a = input.nextInt();
		System.out.println("enter integer for b");
		int b = input.nextInt();
		System.out.println("enter integer for c");
		int c = input.nextInt();
		int discr = (b*b) - (4*a*c);
		if (discr == 0) {
			System.out.println((-1 * b  + discr) / (2*a));
		} else if (discr >= 0) {
			System.out.println((-1 * b  + discr) / (2*a));
			System.out.println((-1 * b  - discr) / (2*a));
		} else {
			System.out.println("The equation has no real root");
		}
	}
}
