package day03.practice;

public class User {

	@Override
	public String toString() {
		return "User Details : Name = " + name + ", Password = " + password + ", Email Id = " + emailId;
	}

	private String name;
	private String password;
	private String emailId;

	public User() {

	}

	public User(String name, String password, String emailId) {
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}