import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	
	public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";
	public static final String EMAILPATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*"
											+ "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";
	public static final String MOBILENUMBERPATTERN = "\\d{2}[-\\.\\s]\\d{10}";
	public static final String PASSWORDPATTERN = "^(?=.{8,})(?=.*[a-z])(?=.*[0-9])"
											+ "(?=.*[A-Z])(?=.*\\W){1}.*$";
	
	public boolean validatetName(String pattern) {
		return (Pattern.matches(NAMEPATTERN, pattern));
	}

	public boolean validateEmail(String pattern) {
		return (Pattern.matches(EMAILPATTERN, pattern));
	}
	
	public boolean validateMobileNumber(String pattern) {
		return (Pattern.matches(MOBILENUMBERPATTERN, pattern));
	}
	
	public boolean validatePassword(String pattern) {
		return (Pattern.matches(PASSWORDPATTERN, pattern));
	}
}
