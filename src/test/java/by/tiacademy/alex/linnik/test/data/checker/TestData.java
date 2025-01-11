package by.tiacademy.alex.linnik.test.data.checker;

import by.itacademy.AlexLinnik.dataChecker.DataChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static by.itacademy.AlexLinnik.dataChecker.DataChecker.INVALID_DATE_MSG;
import static by.itacademy.AlexLinnik.dataChecker.DataChecker.IT_IS_A_HOLIDAY;

public class TestData {
    @Test
    public void addTest() {
        Assertions.assertEquals("Это праздничный день", DataChecker.printHolidayDay(1, 1));
    }

    @Test
    public void addTest1() {
        Assertions.assertEquals("Февраль", DataChecker.getMonthName(2));
    }

    @Test
    public void addTest2() {
        Assertions.assertEquals(INVALID_DATE_MSG, DataChecker.checkDate(6, 32));
    }

    @Test
    public void addTest3() {
        Assertions.assertEquals("Обычный день", DataChecker.checkDate(2, 3));
    }

    @Test
    public void addTest4() {
        Assertions.assertEquals(IT_IS_A_HOLIDAY, DataChecker.checkDate(1, 1));
    }
}
