package AssignmentSet2;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of heads");
		int heads = scan.nextInt();
		System.out.println("enter number of legs");
		int legs = scan.nextInt();
		
		int rabbitnum = (legs - 2 * heads) / 2;
		if ((heads - rabbitnum) * 2 != legs - rabbitnum * 4) {
			System.out.println("number cannot be found");
		} else {
			System.out.println("rabbits: " + rabbitnum);
			System.out.println("chickens:" + (heads - rabbitnum));
		}
	}

}
