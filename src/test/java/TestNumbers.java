import by.itacademy.tsyhler.Numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestNumbers {
    @ParameterizedTest
    @CsvSource({
            "2, 2, 2, 'excellent'",
            "0x7fffffff, 0x7fffffff, 0x7fffffff, 'excellent'"
    })
    public void testExcellent(int a, int b, int c, String expectedResult) {
        Assertions.assertEquals(expectedResult, Numbers.positiveNumbers(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 4, 5, 'good'"
    })
    public void testGood(int a, int b, int c, String expectedResult) {
        Assertions.assertEquals(expectedResult, Numbers.positiveNumbers(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 0, 2, 'fine'"
    })
    public void testFine(int a, int b, int c, String expectedResult) {
        Assertions.assertEquals(expectedResult, Numbers.positiveNumbers(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0, 'bad'",
            "-2, -2, -2, 'bad'"
    })
    public void testBad(int a, int b, int c, String expectedResult) {
        Assertions.assertEquals(expectedResult, Numbers.positiveNumbers(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({
            "10, '0 - последняя цифра числа '",
            "18738785489, '9 - последняя цифра числа '",
            "3333333333333, '3 - последняя цифра числа '",
            "-1837287424, '4 - последняя цифра числа '",
            "0, '0 - последняя цифра числа '",
            "-35, '5 - последняя цифра числа '"
    })
    public void testLastDigitOfNumber(long number, String expectedResult) {
        Assertions.assertEquals(expectedResult + number, Numbers.lastDigitOfNumber(number));
    }

    @ParameterizedTest
    @CsvSource({
            "10, '0 - последняя цифра числа '",
            "18738785489, '9 - последняя цифра числа '",
            "333333333333333333333, '3 - последняя цифра числа '",
            "-1837287424, '4 - последняя цифра числа '",
            "0, '0 - последняя цифра числа '",
            "-35, '5 - последняя цифра числа '"
    })
    public void testLastDigitOfNumberString(String number, String expectedResult) {
        Assertions.assertEquals(expectedResult + number, Numbers.lastDigitOfNumber(number));
    }

    @ParameterizedTest
    @CsvSource({
            "4444, 88",
            "4900, 49",
            "-3456, 22",
            "-2001, -19",
            "1000, 10 "
    })
    public void testSumOfNumbers(int number, int expectedResult) {
        Assertions.assertEquals(expectedResult, Numbers.sumOfNumbers(number));
    }
}
