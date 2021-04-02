package AssignmentSet1;
import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter loan type");
		String loantype = input.nextLine();
		System.out.println("enter acc num");
		int accnum = input.nextInt();
		System.out.println("enter acc balance");
		int accbal = input.nextInt();
		System.out.println("enter salary");
		int salary = input.nextInt();
		System.out.println("enter expected loan amount");
		int loanamount = input.nextInt();
		System.out.println("expected # of EMIs");
		int emi = input.nextInt();

		
		if (accnum < 1000 || accnum > 1999) {
			System.out.println("need 4 digits starting with 1");
		} else if (accbal < 1000) {
			System.out.println("minimum balance of 1k");
		} else {
			if (loantype.contentEquals("Car")) {
				if (salary > 25000 && loanamount <= 500000 && emi <= 36) {
					System.out.println("account num: " + accnum);
					System.out.println("eligible loan amount: " + 500000);
					System.out.println("eligible emi: " + 36);
				} else {
					System.out.println("not eligible");
				}
			}
			if (loantype.contentEquals("House")) {
				if (salary > 50000 && loanamount <= 600000 && emi <= 60) {
					System.out.println("account num: " + accnum);
					System.out.println("eligible loan amount: " + 600000);
					System.out.println("eligible emi: " + 60);
				} else {
					System.out.println("not eligible");
				}
			}
			if (loantype.contentEquals("Business")) {
				if (salary > 75000 && loanamount <= 750000 && emi <= 84) {
					System.out.println("account num: " + accnum);
					System.out.println("eligible loan amount: " + 750000);
					System.out.println("eligible emi: " + 84);
				} else {
					System.out.println("not eligible");
				}
			}
		}
	}

}
