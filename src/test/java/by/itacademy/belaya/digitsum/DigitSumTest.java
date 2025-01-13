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

    @Test
    @DisplayName("Positive four-digit number")
    public void test2() {
        Assertions.assertEquals(20,
                DigitSum.getSumOfTwoPartsOfNumber(1010));
    }
}
