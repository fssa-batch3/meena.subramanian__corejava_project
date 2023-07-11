package day02.practice;

public class App {
	public static void main(String[] args) {

		User st1 = new User();
		st1.setId(12);
		st1.setName("soundarya");
		st1.setEmail("Sound@gmail.com");
		st1.setPassword("sound123");

		System.out.println(st1.getName());
		System.out.println(st1.getId());
		System.out.println(st1.getEmail());
		System.out.print(st1.getPassword());
	}
}
