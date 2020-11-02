import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationTest {
	
	@Test
	public void givenFirstName_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistartion = new UserRegistration();
		try {
			Assert.assertTrue(userRegistartion.validatetName("Si"));
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenLastName_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			Assert.assertTrue(userRegistration.validatetName("Kundapur"));
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenEmail_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			Assert.assertTrue(userRegistration.validateEmail("shilpaudupi@gmail.com"));
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenMobileNumber_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			Assert.assertTrue(userRegistration.validateMobileNumber("91 7767978765"));
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenPassword_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			Assert.assertTrue(userRegistration.validatePassword("As#w23dzd"));
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
	}
}
