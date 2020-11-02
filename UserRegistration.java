import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner scanner = new Scanner(System.in);	

	public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration !");

		UserRegistration userRegistration = new UserRegistration();
		userRegistration.readUserInput();
	}

	private void readUserInput() {
		System.out.println("Enter first name ");
		String firstName = scanner.next();
		validateUserInput(NAMEPATTERN, firstName);
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
