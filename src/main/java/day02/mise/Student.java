package day02.mise;

public class Student {
	String name;
	String email;
	int id;
	static int count = 0;
	public static String academy;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public void setId(int newId) {
		id = newId;
	}
    static{
    	academy = "FSSA";
    }

    public Student() {
    	Student.count++;
    }
}
