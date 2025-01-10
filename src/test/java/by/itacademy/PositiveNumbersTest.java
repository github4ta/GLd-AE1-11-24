package by.itacademy;

import by.itcademy.PositiveNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveNumbersTest {
    @Test
    public void threePositives() {
        Assertions.assertEquals("excellent", PositiveNumbers.positiveNumbers(1, 2, 9));
    }

    @Test
    public void twoPositives1() {
        Assertions.assertEquals("good", PositiveNumbers.positiveNumbers(1, -2, 9));
    }

    @Test
    public void twoPositives2() {
        Assertions.assertEquals("good", PositiveNumbers.positiveNumbers(-1, 2, 9));
    }

    @Test
    public void twoPositives3() {
        Assertions.assertEquals("good", PositiveNumbers.positiveNumbers(1, 2, -9));
    }

    @Test
    public void twoPositivesWithOneZero1() {
        Assertions.assertEquals("good", PositiveNumbers.positiveNumbers(1, 2, 0));
    }

    @Test
    public void onePositive1() {
        Assertions.assertEquals("fine", PositiveNumbers.positiveNumbers(1, -2, -9));
    }

    @Test
    public void onePositive2() {
        Assertions.assertEquals("fine", PositiveNumbers.positiveNumbers(-1, 2, -9));
    }

    @Test
    public void onePositive3() {
        Assertions.assertEquals("fine", PositiveNumbers.positiveNumbers(-1, -2, 9));
    }

    @Test
    public void onePositiveWithTwoZeros() {
        Assertions.assertEquals("fine", PositiveNumbers.positiveNumbers(0, 2, 0));
    }

    @Test
    public void noPositives() {
        Assertions.assertEquals("bad", PositiveNumbers.positiveNumbers(-1, -2, -9));
    }

    @Test
    public void noPositivesThreeZeros() {
        Assertions.assertEquals("bad", PositiveNumbers.positiveNumbers(0, 0, 0));
    }
}
