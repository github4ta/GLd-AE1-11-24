package by.tiacademy.alex.linnik.test.data.checker;

import by.itacademy.AlexLinnik.dataChecker.DataChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestData {
    @Test
    public void addTest() {
        Assertions.assertEquals("Праздничный день", DataChecker.printHolidayDay(1, 1));
    }

    @Test
    public void addTest1() {
        Assertions.assertEquals("февраль", DataChecker.getMonthName(2));
    }

    @Test
    public void addTest2() {
        Assertions.assertEquals("такой даты не существует", DataChecker.date(6, 32));
    }

    @Test
    public void addTest3() {
        Assertions.assertEquals("актуальная дата", DataChecker.date(2, 3));
    }

    @Test
    public void addTest4() {
        Assertions.assertEquals("Праздничный день", DataChecker.date(1, 1));
    }

}
