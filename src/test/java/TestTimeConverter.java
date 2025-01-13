import by.itacademy.tsyhler.TimeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestTimeConverter {
    @ParameterizedTest
    @CsvSource({
            "566565656, '157379 часов 20 минут 56 секунд'",
            "3660, '1 часов 1 минут 0 секунд'",
            "3600, '1 часов 0 минут 0 секунд'",
            "3500, '0 часов 58 минут 20 секунд'",
            "0, '0 часов 0 минут 0 секунд'"
    })
    public void testTimeToNormalView(int seconds, String expected) {
        Assertions.assertEquals(expected, TimeConverter.timeToNormalView(seconds));
    }

    @ParameterizedTest
    @CsvSource({
            "-35, 'Некорректное значение'"
    })
    public void testIncorrectTimeValue(int seconds, String expected) {
        Assertions.assertEquals(expected, TimeConverter.timeToNormalView(seconds));
    }
}
