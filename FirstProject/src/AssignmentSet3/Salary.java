package AssignmentSet3;

public class Salary {
	
	public static double[] findDetails(double[] salary) {
		double average = 0;
		for (int i = 0; i < salary.length; i++) {
			average += salary[i];
		}
		average = average / salary.length;
		int greater = 0;
		int lesser = 0;
		for (int i = 0; i < salary.length; i++) {
			if (salary[i] > average)
				greater++;
			else if (salary[i] < average)
				lesser++;
		}
		return new double[] {average, greater, lesser};
	}

	public static void main(String[] args) {
		double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
	}

}
