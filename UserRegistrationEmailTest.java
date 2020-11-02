import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationEmailTest {

	private UserRegistration userRegistration;
	private String emailId;

	public UserRegistrationEmailTest(String emailId) {
		this.emailId = emailId;
	}
	
	@Before
	public void initialize() {
		userRegistration = new UserRegistration();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[] {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
				"abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com",
				"abc@gmail.com.com","abc+100@gmail.com"});
	}
	
	@Test
	public void givenEmailSamples_WhenMatchesPattern_ShouldReturnTrue() {
		Assert.assertTrue(userRegistration.validateEmail(emailId));
	}
}
