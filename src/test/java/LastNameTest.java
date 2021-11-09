import org.junit.Assert;
import org.junit.Test;

public class LastNameTest {

    LastName obj = new LastName();

    @Test
    public void isLastName1() {
        Assert.assertTrue(obj.isLastName("Tatiraju"));
    }

    @Test
    public void isLastName2() {
        Assert.assertFalse(obj.isLastName("tatirajU"));
    }
}