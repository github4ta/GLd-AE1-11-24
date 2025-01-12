package it.academy.bordiyan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiDigitNumberTest {

    @Test
    public void digitNumberTest1() {
        Assertions.assertEquals("3 - последняя цифра числа 23", MultiDigitNumber.digitNumber(23));
    }

}
