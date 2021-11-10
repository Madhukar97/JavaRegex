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

    @Test
    public void isEmail10() {
        Assert.assertFalse(obj.isEmail("abc"));
    }

    @Test
    public void isEmail11() {
        Assert.assertFalse(obj.isEmail("abc@.com.my"));
    }

    @Test
    public void isEmail12() {
        Assert.assertFalse(obj.isEmail("abc123@gmail.a"));
    }

    @Test
    public void isEmail13() {
        Assert.assertFalse(obj.isEmail("abc123@.com"));
    }

    @Test
    public void isEmail14() {
        Assert.assertFalse(obj.isEmail("abc123@.com.com"));
    }

    @Test
    public void isEmail15() {
        Assert.assertFalse(obj.isEmail(".abc@abc.com"));
    }

    @Test
    public void isEmail16() {
        Assert.assertFalse(obj.isEmail("abc()*@gmail.com"));
    }

    @Test
    public void isEmail17() {
        Assert.assertFalse(obj.isEmail("abc@%*.com"));
    }

    @Test
    public void isEmail18() {
        Assert.assertFalse(obj.isEmail("abc..2002@gmail.com"));
    }

    @Test
    public void isEmail19() {
        Assert.assertFalse(obj.isEmail("abc.@gmail.com"));
    }

    @Test
    public void isEmail20() {
        Assert.assertFalse(obj.isEmail("abc@abc@gmail.com"));
    }

    @Test
    public void isEmail21() {
        Assert.assertFalse(obj.isEmail("abc@gmail.com.1a"));
    }

    @Test
    public void isEmail22() {
        Assert.assertFalse(obj.isEmail("abc@gmail.com.aa.au"));
    }
}