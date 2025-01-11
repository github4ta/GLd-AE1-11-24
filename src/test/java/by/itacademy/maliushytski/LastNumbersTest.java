import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastNumbersTest {
    @Test
    @Description("Test ordinary digit")
    public void checkOrdinaryDigit() {
        Assertions.assertEquals("3 - последняя цифра числа 123", LastNumber.sendLastNumber(123));
    }

    @Test
    @Description("Test zero digit")
    public void checkZeroDigit() {
        Assertions.assertEquals("irrelevant number", LastNumber.sendLastNumber(0));
    }

    @Test
    @Description("Test irrelevant digit")
    public void checkIrrelevantDigit() {
        Assertions.assertEquals("irrelevant number", LastNumber.sendLastNumber(1));
    }

    @Test
    @Description("Test negative digit")
    public void checkNegativeDigit() {
        Assertions.assertEquals("0 - последняя цифра числа -100", LastNumber.sendLastNumber(-100));
    }

    @Test
    @Description("Test large digit")
    public void checkLargeDigit() {
        Assertions.assertEquals("7 - последняя цифра числа 2147483647", LastNumber.sendLastNumber(Integer.MAX_VALUE));
    }
}
