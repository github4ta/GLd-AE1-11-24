package it.academy.bordiyan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DateAndCalendarTest {

    @Test
    @DisplayName("такой даты не существует")
    public void dateCalendarTest(){
        Assertions.assertEquals("AUGUST 31", DateAndCalendar.dateCalendar(8, 31));
    }
}
