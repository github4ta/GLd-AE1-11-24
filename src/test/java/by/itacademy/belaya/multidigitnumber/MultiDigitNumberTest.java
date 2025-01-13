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
}
