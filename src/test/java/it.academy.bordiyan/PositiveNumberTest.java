package it.academy.bordiyan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveNumberTest {
    @Test
    public void testPositiveNumber1() {
        Assertions.assertEquals("excellent - все три числа больше 0", PositiveNumber.positiveNumber(5, 5, 5));
    }

    @Test
    public void testPositiveNumber2() {
        Assertions.assertEquals("good - два числа больше 0", PositiveNumber.positiveNumber(-5, 5, 5));
    }

}
