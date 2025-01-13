package by.itacademy.belaya.digitsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DigitSumTest {

    @Test
    @DisplayName("Number is not four-digit")
    public void test1() {
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> DigitSum.getSumOfTwoPartsOfNumber(103));
        Assertions.assertEquals("Число должно быть четырехзначным", exception.getMessage());
    }
}
