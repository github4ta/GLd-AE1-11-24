package by.itacademy.belaya.dates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DatesTest {

    @Test
    @DisplayName("Invalid month and day")
    public void test1() {
        Assertions.assertEquals("такой даты не существует",
                Dates.getClassificationForDates(0, -1));
    }

    @Test
    @DisplayName("Holiday")
    public void test2() {
        Assertions.assertEquals("Праздничный день",
                Dates.getClassificationForDates(1, 1));
    }

    @Test
    @DisplayName("Regular non-holiday date")
    public void test3() {
        Assertions.assertEquals("14 марта",
                Dates.getClassificationForDates(3, 14));
    }
}
