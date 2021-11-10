import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {

    Password obj = new Password();

    @Test
    public void password() {
        Assert.assertTrue(obj.password("^&^%$#$jdnhkj"));
    }
}