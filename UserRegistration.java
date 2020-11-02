import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner scanner = new Scanner(System.in);	

	public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";
	public static final String EMAILPATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*"
											+ "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";
	public static final String MOBILENUMBERPATTERN = "\\d{2}[-\\.\\s]\\d{10}";
	public static final String PASSWORDPATTERN = "^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W){1}.*$";
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration !");

		UserRegistration userRegistration = new UserRegistration();
		userRegistration.readUserInput();
	}

	private void readUserInput() {
		System.out.println("Enter first name ");
		String firstName = scanner.next();
		validateUserInput(NAMEPATTERN, firstName);

		System.out.println("Enter last name ");
		String lastName = scanner.next();
		validateUserInput(NAMEPATTERN, lastName);	
	
		System.out.println("Enter email id ");
		String emailId = scanner.next();
		validateUserInput(EMAILPATTERN, emailId);

		System.out.println("Enter mobile number ");
		scanner.nextLine();
		String mobileNumber = scanner.nextLine();
		validateUserInput(MOBILENUMBERPATTERN, mobileNumber);

		System.out.println("Enter password ");
		String password = scanner.next();
		validateUserInput(PASSWORDPATTERN, password);
	}

	private void validateUserInput(String patttern, String input) {
		if(Pattern.matches(patttern, input)) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
