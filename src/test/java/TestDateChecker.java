import by.itacademy.tsyhler.DateChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestDateChecker {
    @ParameterizedTest
    @CsvSource({
            "3, 1,  '3 января'",
            "31, 12, '31 декабря'",
            "29, 2, 'такой даты не существует'",
            "1, 13, 'такой даты не существует'",
            "31, 11, 'такой даты не существует'",
            "0, 1, 'такой даты не существует'",
            "1, 0, 'такой даты не существует'",
            "-1, 2, 'такой даты не существует'",
            "1, -2, 'такой даты не существует'",
            "1, 1, 'Праздничный день'",
            "25, 12, 'Праздничный день'",
            "9, 5, 'Праздничный день'"
    })
    public void testDateExist(int day, int month, String expectedResult) {
        Assertions.assertEquals(expectedResult, DateChecker.dateExist(day, month));
    }
}
