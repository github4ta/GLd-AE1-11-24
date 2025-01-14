package by.itacademy.belaya.time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TimeFormatterTest {

    @Test
    @DisplayName("Negative seconds")
    public void test1() {
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> TimeFormatter.getFormattedTime(-100));
        Assertions.assertEquals("Время не может быть отрицательным", exception.getMessage());
    }

    @Test
    @DisplayName("Zero seconds")
    public void test2() {
        Assertions.assertEquals("0 секунд",
                TimeFormatter.getFormattedTime(0));
    }

    @Test
    @DisplayName("Max value of seconds")
    public void test3() {
        Assertions.assertEquals("2562047788015215 часов 30 минут 7 секунд",
                TimeFormatter.getFormattedTime(Long.MAX_VALUE));
    }

    @Test
    @DisplayName("Singular values")
    public void test4() {
        Assertions.assertEquals("1 час 1 минута 1 секунда",
                TimeFormatter.getFormattedTime(3661));
    }

    @Test
    @DisplayName("Dual values")
    public void test5() {
        Assertions.assertEquals("2 часа 2 минуты 2 секунды",
                TimeFormatter.getFormattedTime(7322));
    }

    @Test
    @DisplayName("Teen values")
    public void test6() {
        Assertions.assertEquals("3 часа 7 минут 14 секунд",
                TimeFormatter.getFormattedTime(11234));
    }
}
