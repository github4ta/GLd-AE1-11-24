import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LastNumbersTest {
    @ParameterizedTest
    @Description("Test ordinary digits")
    @CsvSource({
            "'3 - последняя цифра числа 123', 123",
            "'0 - последняя цифра числа -100',-100",
            "'7 - последняя цифра числа 2147483647',2147483647"

    })
    public void checkOrdinaryDigits(String expectedResult, int number) {
        Assertions.assertEquals(expectedResult, LastNumber.getLastDigitAsString(number));
    }

    @ParameterizedTest
    @Description("Test irrelevant digits")
    @CsvSource({
            "'irrelevant number', 0",
            "'irrelevant number',1"
    })
    public void checkIrrelevantDigits(String expectedResult, int number) {
        Assertions.assertEquals(expectedResult, LastNumber.getLastDigitAsString(number));
    }
}
