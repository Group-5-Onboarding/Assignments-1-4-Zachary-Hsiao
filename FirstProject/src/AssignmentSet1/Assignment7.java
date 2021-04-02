package AssignmentSet1;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter V or N");
		String typ = input.nextLine();
		System.out.println("enter num");
		int num = input.nextInt();
		System.out.println("enter distance in kms");
		int km = input.nextInt();
		
		if ( num < 1 || km < 0 || (!typ.equals("N") && !typ.equals("V"))) {
			System.out.println(-1);
		} else {
			int sum = num;
			if (typ.contentEquals("N"))
				sum *= 15;
			else
				sum *= 12;
			if (km > 6) {
				sum += 3 + ((km - 6) * 2);
			} else if (km <= 6 && km > 3) {
				sum += km - 3;
			} else {
			}
			System.out.println(sum);
		}
	}

}
