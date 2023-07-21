package day10.practice;

import java.util.ArrayList;

public class UserRegister {
	private ArrayList<User> userList;

	public UserRegister() {
		this.userList = new ArrayList<>();
	}

	public void register(User user) throws UserAlreadyExistsException {
		for (User existingUser : userList) {
			if (existingUser.emailId.equals(user.emailId)) {
				throw new UserAlreadyExistsException("User with emailId '" + user.emailId + "' already exists.");
			}
		}

		userList.add(user);
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

}
