import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     * This method takes First Name which starts with Capital letter and has minimum of 3 characters
     *
     * @param Firstname is used for comparing with regex
     */
    public boolean isFirstName(String Firstname) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(Firstname);
        Predicate<Pattern> matcherPredicate = match -> match.matcher(Firstname).matches();
        return matcherPredicate.test(pattern);
    }

    /**
     * This method takes Last Name which starts with Capital letter and has minimum of 3 characters
     *
     * @param Lastname is used for comparing with regex
     */
    public boolean isLastName(String Lastname) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(Lastname);
        Predicate<Pattern> matcherPredicate = match -> match.matcher(Lastname).matches();
        return matcherPredicate.test(pattern);
    }

    /**
     * This method checks if the entered number is valid or not
     *
     * @param Number takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
    public boolean isNumber(String Number) {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][1-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(Number);
        Predicate<Pattern> matcherPredicate = match -> match.matcher(Number).matches();
        return matcherPredicate.test(pattern);
    }

    /**
     * Method to check if the password is valid or not
     *
     * @param passcode takes in the passcode string as a parameter
     * @return returns boolean true if the password matches the requirement
     */
    public boolean isPassword(String passcode) {

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(){}'.,+_-])[a-zA-Z0-9 !@#$%^&*(){}'.,+_-]{8,}");  //
        Matcher matcher = pattern.matcher(passcode);
        Predicate<Pattern> matcherPredicate = match -> match.matcher(passcode).matches();
        return matcherPredicate.test(pattern);
    }

    public boolean isEmail(String email) {
        String regex = "^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Predicate<Pattern> matcherPredicate = match -> match.matcher(email).matches();
        return matcherPredicate.test(pattern);
    }

    public static void main(String[] args) {

        UserRegistration obj = new UserRegistration();
        System.out.println(obj.isFirstName("Madhukar"));
        System.out.println(obj.isLastName("Tatiraju"));
        System.out.println(obj.isNumber("91 9346546112"));
        System.out.println(obj.isPassword("Madhukar@yg9j"));
        System.out.println(obj.isEmail("madhukar..5864@gmail.com"));
    }
}
