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

    @Test
    public void testPositiveNumber3() {
        Assertions.assertEquals("fine - одно числа больше 0", PositiveNumber.positiveNumber(-5, 5, -5));
    }

    @Test
    public void testPositiveNumber4() {
        Assertions.assertEquals("Bad - ни одного числа больше 0", PositiveNumber.positiveNumber(-5, -5, -5));
    }

    @Test
    public void testPositiveNumber5() {
        Assertions.assertEquals("Вы ввели все нули", PositiveNumber.positiveNumber(0, 0, 0));
    }
}
