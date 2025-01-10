import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersTest {
    @Test
    @Description("Test defineZeros method with all zeros")
    public void checkZeros() {
        Assertions.assertEquals("bad", Numbers.defineZeros(0, 0, 0));
    }

    @Test
    @Description("Test defineZeros method with one zero")
    public void checkOneZero() {
        Assertions.assertEquals("good", Numbers.defineZeros(2, 1, 0));
    }

    @Test
    @Description("Test defineZeros method with two zeros")
    public void checkTwoZeros() {
        Assertions.assertEquals("fine", Numbers.defineZeros(0, 0, 120));
    }

    @Test
    @Description("Test defineZeros method without zeros")
    public void checkWithoutZeros() {
        Assertions.assertEquals("excellent", Numbers.defineZeros(1, 2, 3));
    }

    @Test
    @Description("Test defineZeros method with all zeros")
    public void checkNegativeValues() {
        Assertions.assertEquals("bad", Numbers.defineZeros(0, -10, -3));
    }

    @Test
    @Description("Test defineZeros method with large values")
    public void checkLargeValues() {
        Assertions.assertEquals("excellent", Numbers.defineZeros(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        Assertions.assertEquals("bad", Numbers.defineZeros(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}

