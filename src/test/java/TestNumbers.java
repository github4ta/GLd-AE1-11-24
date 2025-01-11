import by.itacademy.tsyhler.Numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestNumbers {
    @ParameterizedTest
    @CsvSource({
            "2, 2, 2, 'excellent'",
            "0, 4, 5, 'good'",
            "-1, 0, 2, 'fine'",
            "0, 0, 0, 'bad'",
            "-2, -2, -2, 'bad'",
            "0x7fffffff, 0x7fffffff, 0x7fffffff, 'excellent'"
    })
    public void testPositiveNumbers(int a, int b, int c, String expectedResult) {
        Assertions.assertEquals(expectedResult, Numbers.positiveNumbers(a, b, c));
    }
}
