package day03.practice;

public class App {

	public static void main(String[] args) {
		User user1 = new User(); 
	user1.setName("Meenu");
	user1.setPassword("Meenu@2343");
	user1.setEmailId("meenu@gmail.com");

	User user2 = new User("Meena", "saranya123", "saransubu@gmail.com"); 

	System.out.println(user1.toString()); 
	System.out.println(user2.toString());
	}
	 

}