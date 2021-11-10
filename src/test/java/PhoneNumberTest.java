import org.junit.Assert;
import org.junit.Test;

public class PhoneNumberTest {

    PhoneNumber obj = new PhoneNumber();

    @Test
    public void isNumber() {
        Assert.assertTrue(obj.isNumber("91 9341561823"));
    }
}