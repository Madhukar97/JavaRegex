import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void happyFirstName() {
        try {
            Assert.assertTrue(UserRegistration.checkFirstName("Madhukar"));
            System.out.println("FirstName is valid \n");
        }
        catch (InvalidNameException e){
            System.out.println("A problem occurred: " + e);
        }
    }

    @Test
    public void happyLastName() {
        try {
            Assert.assertTrue(UserRegistration.checkLastName("Tatiraju"));
            System.out.println("LastName is valid \n");
        }
        catch (InvalidNameException e){
            System.out.println("A problem occurred: " + e);
        }
    }

    @Test
    public void happyNumber() {
        try {
            Assert.assertTrue(UserRegistration.checkNumber("91 9341561823"));
            System.out.println("PhoneNo is valid \n");
        }
        catch (InvalidPhoneNumberException e){
            System.out.println("A problem occurred: " + e);
        }
    }


    @Test
    public void happyPassword() {
        try {
            Assert.assertTrue(UserRegistration.checkPassword("^&^%$#$jdnHkj8"));
            System.out.println("Password is valid \n");
        }
        catch (InvalidPasswordException e){
            System.out.println("A problem occurred: " + e);
        }
    }

    @Test
    public void happyEmail() {
        try {
            Assert.assertTrue(UserRegistration.checkEmail("madhukar..9895@gmail.com"));
            System.out.println("Email is valid \n");
        }
        catch (InvalidEmailException e){
            System.out.println("A problem occurred: " + e);
        }
    }

    @Test
    public void happyEmail2() throws InvalidEmailException {
        Assert.assertTrue(UserRegistration.checkEmail("madhukar..9895@gmail.com"));
        System.out.println("Email is valid \n");
    }
}