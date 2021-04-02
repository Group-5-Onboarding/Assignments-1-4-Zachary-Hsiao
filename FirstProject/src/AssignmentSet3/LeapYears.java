package AssignmentSet3;

public class LeapYears {
	   public static int[] findLeapYears(int year){
		   int counter = 0;
		   int[] result = new int[15];
		   while (counter < 15) {
			   if (year % 4 == 0) {
				   result[counter] = year;
				   year += 4;
				   counter++;
			   } else {
				   year++;
			   }
		   }
	       return result;
	   }
	    
	   public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }
}
