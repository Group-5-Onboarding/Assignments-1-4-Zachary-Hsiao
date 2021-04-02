package AssignmentSet3;

public class Tester {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Alex", "Java Fundamentals", 1200L);
		Teacher teacher2 = new Teacher("John", "RDBMS", 800L);
		Teacher teacher3 = new Teacher("Sam", "Networking", 900L);
		Teacher teacher4 = new Teacher("Maria", "Python", 900L);
		Teacher[] teacher = {teacher1, teacher2, teacher3, teacher4};
		
		for (int i = 0; i < teacher.length; i++) {
			System.out.println(teacher[i].getTeacherName() + ", Subject: " + teacher[i].getSubject() + ", Salary: " + teacher[i].getSalary());
		}
	}

}
