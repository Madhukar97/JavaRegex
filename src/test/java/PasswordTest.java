import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {

    Password obj = new Password();

    @Test
    public void happyFirstName() {
        Assert.assertTrue(obj.isFirstName("Madhukar"));
    }

    @Test
    public void sadFirstName2() {
        Assert.assertFalse(obj.isFirstName("madhukar Tatiraju"));
    }

    @Test
    public void happyLastName() {
        Assert.assertTrue(obj.isLastName("Tatiraju"));
    }

    @Test
    public void sadLastName() {
        Assert.assertFalse(obj.isLastName("tatirajU"));
    }

    @Test
    public void happyNumber() {
        Assert.assertTrue(obj.isNumber("91 9341561823"));
    }

    @Test
    public void sadNumber() {
        Assert.assertFalse(obj.isNumber("91 9341561823551"));
    }

    @Test
    public void happyPassword() {
        Assert.assertTrue(obj.password("^&^%$#$jdnHkj8"));
    }

    @Test
    public void sadPassword() {
        Assert.assertFalse(obj.password("^&^%$#$jdnkj8"));
    }
}