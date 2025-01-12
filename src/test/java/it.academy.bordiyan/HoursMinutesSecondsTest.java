package it.academy.bordiyan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HoursMinutesSecondsTest {

    @Test
    public void testConvertSeconds1() {
        Assertions.assertEquals("20 минут 49 секунд", HoursMinutesSeconds.convertSeconds(1249));
    }

    @Test
    public void testConvertSeconds2() {
        Assertions.assertEquals("180 часов 15 минут 58 секунд", HoursMinutesSeconds.convertSeconds(648958));
    }
}