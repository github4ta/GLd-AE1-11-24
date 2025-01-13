package by.itacademy.belaya.multidigitnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiDigitNumberTest {

    @Test
    @DisplayName("Positive multi-digit number")
    public void test1() {
        Assertions.assertEquals("5 - последняя цифра числа 15",
                MultiDigitNumber.getMessageAboutLastDigit(15));
    }

    @Test
    @DisplayName("Negative multi-digit number")
    public void test2() {
        Assertions.assertEquals("4 - последняя цифра числа -104894",
                MultiDigitNumber.getMessageAboutLastDigit(-104894));
    }

    @Test
    @DisplayName("Number is zero")
    public void test3() {
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> MultiDigitNumber.getMessageAboutLastDigit(0));
        Assertions.assertEquals("Число должно быть многозначным", exception.getMessage());
    }
}
