package day10.practice;

import java.util.regex.Pattern;

public class EmailValidator {

	private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		if (EMAIL_PATTERN.matcher(emailId).matches()) {
			return true;
		} else {
			throw new InvalidEmailException("Invalid email address = " + emailId);
		}
	}
}
