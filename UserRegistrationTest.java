import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	
	@Test
	public void givenFirstName_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistartion = new UserRegistration();
		Assert.assertTrue(userRegistartion.validatetName("Shilpa"));
	}
	
	@Test
	public void givenLastName_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validatetName("Kundapur"));
	}
	
	@Test
	public void givenEmail_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validateEmail("shilpaudupi@gmail.com"));
	}
	
	@Test
	public void givenMobileNumber_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validateMobileNumber("91 7767978765"));
	}
	
	@Test
	public void givenPassword_WhenMatchesPattern_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validatePassword("As#w23dzd"));
	}
}
