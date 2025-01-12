package by.itacademy.primako;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClockTest {
    @Test
    public void testClockNegative() {
        Assertions.assertEquals("Ошибка! Значение вводимого числа должно быть минимум 0", Clock.convertSeconds(-59897));
    }
    @Test
    public void testClockZero() {
        Assertions.assertEquals("0 часов 0 минут 0 секунд", Clock.convertSeconds(0));
    }
    @Test
    public void testClockPositive1() {
        Assertions.assertEquals("1 часов 0 минут 0 секунд", Clock.convertSeconds(3600));
    }
    @Test
    public void testClockPositive2() {
        Assertions.assertEquals("100026 часов 16 минут 19 секунд", Clock.convertSeconds(360094579));
    }

}
