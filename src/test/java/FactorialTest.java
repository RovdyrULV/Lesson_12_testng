import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testGetFactorial() {
        Assert.assertEquals(Factorial.getFactorial(5), 120);
        Assert.assertEquals(Factorial.getFactorial(0), 1);
        Assert.assertEquals(Factorial.getFactorial(-24), 1);
    }
}