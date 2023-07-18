package day05.practice;

public class StudentApp {
	public static void main(String[] args) {
		Department myDep = new Department("Computer Engineering", 25);
		Student student = new Student("Sesslyn", 125, myDep);
		System.out.println(student.toString());

	}
}
