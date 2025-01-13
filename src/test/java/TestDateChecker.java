import by.itacademy.tsyhler.DateChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDateChecker {
    @ParameterizedTest
    @CsvSource({
            "15, 7, 15 июля",
            "1, 2, 1 февраля",
            "28, 2, 28 февраля"
    })
    void testValidDate(int day, int month, String expected) {
        assertEquals(expected, DateChecker.dateExist(day, month));
    }

    @ParameterizedTest
    @CsvSource({
            "31, 2, такой даты не существует",
            "0, 5, такой даты не существует",
            "-1, 10, такой даты не существует",
            "15, 13, такой даты не существует"
    })
    void testInvalidDate(int day, int month, String expected) {
        assertEquals(expected, DateChecker.dateExist(day, month));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, Праздничный день",
            "7, 1, Праздничный день",
            "25, 12, Праздничный день"
    })
    void testVacationDate(int day, int month, String expected) {
        assertEquals(expected, DateChecker.dateExist(day, month));
    }
}
