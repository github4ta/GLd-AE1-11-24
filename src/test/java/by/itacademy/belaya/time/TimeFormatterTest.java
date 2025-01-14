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
}
