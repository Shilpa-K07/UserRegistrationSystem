package com.userregistration;

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
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration !");
		
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.readUserInput();
		userRegistration.emailSamplesTest();
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

	private void emailSamplesTest() {
		String sampleEmail1 = "abc@yahoo.com";
		String sampleEmail2 = "abc-100@yahoo.com";
		String sampleEmail3 = "abc.100@yahoo.com";
		String sampleEmail4 = "abc111@abc.com";
		String sampleEmail5 = "abc-100@abc.net";
		String sampleEmail6 = "abc.100@abc.com.au";
		String sampleEmail7 = "abc@1.com";
		String sampleEmail8 = "abc@gmail.com.com";
		String sampleEmail9 = "abc+100@gmail.com";
		
		ArrayList<String> emailIdList = new ArrayList<String>();
		emailIdList.add(sampleEmail1);
		emailIdList.add(sampleEmail2);
		emailIdList.add(sampleEmail3);
		emailIdList.add(sampleEmail4);
		emailIdList.add(sampleEmail5);
		emailIdList.add(sampleEmail6);
		emailIdList.add(sampleEmail7);
		emailIdList.add(sampleEmail8);
		emailIdList.add(sampleEmail9);
		
		for(String emailId:emailIdList) {
			if(Pattern.matches(EMAILPATTERN, emailId)) {
				System.out.println(emailId+" is valid emailId");
			}
			else {
				System.out.println(emailId+" is Invalid emailId");
			}
		}
	}

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
