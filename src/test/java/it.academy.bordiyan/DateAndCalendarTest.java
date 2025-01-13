package it.academy.bordiyan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DateAndCalendarTest {

    @Test
    @DisplayName("Такой даты не существует")
    public void dateCalendarTest1() {
        Assertions.assertEquals("Такой даты не существует", DateAndCalendar.dateCalendar(13, 32));
    }

    @Test
    @DisplayName("Праздничный день")
    public void dateCalendar2() {
        Assertions.assertEquals("Праздничный день", DateAndCalendar.dateCalendar(1,7));
    }

    @Test
    @DisplayName("MARCH 26")
    public void dateCalendar3() {
        Assertions.assertEquals("MARCH 26", DateAndCalendar.dateCalendar(3,26));
    }
}
