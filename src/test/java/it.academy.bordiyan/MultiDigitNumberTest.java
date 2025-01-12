package it.academy.bordiyan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiDigitNumberTest {

    @Test
    public void digitNumberTest1() {
        Assertions.assertEquals("3 - последняя цифра числа 23", MultiDigitNumber.digitNumber(23));
    }

    @Test
    public void digitNumberTest2() {
        Assertions.assertEquals("4 - последняя цифра числа 124", MultiDigitNumber.digitNumber(124));
    }

    @Test
    public void digitNumberTest3() {
        Assertions.assertEquals("8 - последняя цифра числа 2345678", MultiDigitNumber.digitNumber(2345678));
    }
}