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
        Assertions.assertEquals("0 - последняя цифра числа 0", LastNumber.sendLastNumber(0));
    }
}
