import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {


    public boolean isEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-z.+_-]+[.a-z0-9]*@[a-z0-9]+[.a-z]+[.a-z]*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Email email = new Email();
        System.out.println(email.isEmail("abc@yahoo.com"));
        System.out.println(email.isEmail("abc-100@yahoo.com"));
        System.out.println(email.isEmail("abc.100@yahoo.com"));
        System.out.println(email.isEmail("abc111@abc.com"));
        System.out.println(email.isEmail("abc-100@abc.net"));
        System.out.println(email.isEmail("abc.100@abc.com.au"));
        System.out.println(email.isEmail("abc@1.com"));
        System.out.println(email.isEmail("abc@yahoo.com.com"));
        System.out.println(email.isEmail("abc+100@yahoo.com"));
    }
}