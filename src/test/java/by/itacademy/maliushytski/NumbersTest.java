import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersTest {
    @Test
    @Description("Test defineZeros method with all zeros")
    public void testZeros() {
        Assertions.assertEquals("bad", Numbers.defineZeros(0, 0, 0));
    }

    @Test
    @Description("Test defineZeros method with one zero")
    public void testOneZero() {
        Assertions.assertEquals("good", Numbers.defineZeros(2, 1, 0));
    }

    @Test
    @Description("Test defineZeros method with two zeros")
    public void testTwoZeros() {
        Assertions.assertEquals("fine", Numbers.defineZeros(0, 0, 120));
    }

    @Test
    @Description("Test defineZeros method without zeros")
    public void testWithoutZeros() {
        Assertions.assertEquals("excellent", Numbers.defineZeros(1, 2, 3));
    }

    @Test
    @Description("Test defineZeros method with all zeros")
    public void testNegativeValues() {
        Assertions.assertEquals("bad", Numbers.defineZeros(0, -10, -3));
    }

    @Test
    @Description("Test defineZeros method with large max values")
    public void testLargeMaxValues() {
        Assertions.assertEquals("excellent", Numbers.defineZeros(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    @Description("Test defineZeros method with large min values")
    public void checkLargeMinValues() {
        Assertions.assertEquals("bad", Numbers.defineZeros(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
