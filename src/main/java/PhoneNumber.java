import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

    /**
     * This method checks if the entered number is valid or not
     *
     * @param Number takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
    public boolean isNumber(String Number) {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][1-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(Number);
        return matcher.matches();
    }

    //driver code
    public static void main(String[] args) {
        PhoneNumber number = new PhoneNumber();
        System.out.println(number.isNumber("91 1346729072"));
    }
}