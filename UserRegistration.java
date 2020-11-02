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
	
	public boolean validatetName(String pattern) throws UserRegistrationException {
		try {
			boolean result = Pattern.matches(NAMEPATTERN, pattern);
			if(!result)
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID, "Please give valid name");
			return result;
		}catch(NullPointerException exception) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Name should not be null");
		}
	}

	public boolean validateEmail(String pattern) throws UserRegistrationException {
		try {
			boolean result = Pattern.matches(EMAILPATTERN, pattern);
			if(!result)
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID, "Please give valid email");
			return result;
		}catch(NullPointerException exception) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Email should not be null");
		}
	}
	
	public boolean validateMobileNumber(String pattern) throws UserRegistrationException {
		try {
			boolean result = Pattern.matches(MOBILENUMBERPATTERN, pattern);
			if(!result)
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID, "Please give valid mobile number");
			return result;
		}catch(NullPointerException exception) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Mobile number should not be null");
		}
	}
	
	public boolean validatePassword(String pattern) throws UserRegistrationException {
		try {
			boolean result = Pattern.matches(PASSWORDPATTERN, pattern);
			if(!result)
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID, "Please give valid passsword");
			return result;
		}catch(NullPointerException exception) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Password should not be null");
		}
	}
}
