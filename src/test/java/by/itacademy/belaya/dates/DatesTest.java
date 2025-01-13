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
}
