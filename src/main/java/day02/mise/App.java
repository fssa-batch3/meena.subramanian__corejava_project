package day02.mise;

public class App {
 public static void main(String[] args) {
	 Academy academy = new Academy();
	 academy.setId(20);
	 academy.setCode("FSSA");
	 academy.setName("Freshworks Software Academy");
	 
	 Student student = new Student();
	 student.setName("Meena");
	 student.setEmail("vasumeenu@gmail.com");
	 student.setId(10);
	 System.out.println(Student.count);
	 
	 Student student1 = new Student();
	 student1.setName("Sess");
	 student1.setEmail("sess@gmail.com");
	 student1.setId(15);
	 System.out.println(Student.count);
 }
}
