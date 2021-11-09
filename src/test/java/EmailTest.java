import org.junit.Assert;
import org.junit.Test;

public class EmailTest {

    Email obj = new Email();

    @Test
    public void isEmail1() {
        Assert.assertTrue(obj.isEmail("abc@yahoo.com"));
    }

    @Test
    public void isEmail2() {
        Assert.assertTrue(obj.isEmail("abc-100@yahoo.com"));
    }

    @Test
    public void isEmail3() {
        Assert.assertTrue(obj.isEmail("abc.100@yahoo.com"));
    }

    @Test
    public void isEmail4() {
        Assert.assertTrue(obj.isEmail("abc111@abc.com"));
    }

    @Test
    public void isEmail5() {
        Assert.assertTrue(obj.isEmail("abc-100@abc.net"));
    }

    @Test
    public void isEmail6() {
        Assert.assertTrue(obj.isEmail("abc.100@abc.com.au"));
    }

    @Test
    public void isEmail7() {
        Assert.assertTrue(obj.isEmail("abc@1.com"));
    }

    @Test
    public void isEmail8() {
        Assert.assertTrue(obj.isEmail("abc@yahoo.com.com"));
    }

    @Test
    public void isEmail9() {
        Assert.assertTrue(obj.isEmail("abc+100@yahoo.com"));
    }

}