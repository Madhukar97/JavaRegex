import com.bridgelabz.FirstName;
import org.junit.Assert;
import org.junit.Test;

public class FirstNameTestCase {
    FirstName obj = new FirstName();

    @Test
    public void testFirstName1() {
        Assert.assertTrue(obj.isFirstName("Madhukar"));
    }

    @Test
    public void testFirstName2() {
        Assert.assertFalse(obj.isFirstName("madhukar Tatiraju"));
    }
}
