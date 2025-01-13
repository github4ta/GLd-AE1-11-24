package it.academy.bordiyan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DateAndCalendarTest {

    @Test
    @DisplayName("Такой даты не существует")
    public void dateCalendarTest(){
        Assertions.assertEquals("Такой даты не существует", DateAndCalendar.dateCalendar(13, 32));
    }
}
