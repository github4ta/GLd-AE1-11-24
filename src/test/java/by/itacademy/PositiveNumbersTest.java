package by.itacademy;

import by.itcademy.PositiveNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositiveNumbersTest {
    private final String good = "good";
    private final String fine = "fine";
    private final String excellent = "excellent";
    private final String bad = "bad";

    @Test
    @DisplayName("three positive numbers")
    public void testThreePositives() {
        Assertions.assertEquals(excellent, PositiveNumbers.positiveNumbers(1, 2, 9));
    }

    @Test
    @DisplayName("two positive numbers")
    public void testTwoPositives1() {
        Assertions.assertEquals(good, PositiveNumbers.positiveNumbers(1, -2, 9));
    }

    @Test
    @DisplayName("two positive numbers ")
    public void testTwoPositives2() {
        Assertions.assertEquals(good, PositiveNumbers.positiveNumbers(-1, 2, 9));
    }

    @Test
    @DisplayName("two positive numbers")
    public void testTwoPositives3() {
        Assertions.assertEquals(good, PositiveNumbers.positiveNumbers(1, 2, -9));
    }

    @Test
    @DisplayName("two positive numbers")
    public void testTwoPositivesWithOneZero1() {
        Assertions.assertEquals(good, PositiveNumbers.positiveNumbers(1, 2, 0));
    }

    @Test
    @DisplayName("one positive number")
    public void testOnePositive1() {
        Assertions.assertEquals(fine, PositiveNumbers.positiveNumbers(1, -2, -9));
    }

    @Test
    @DisplayName("one positive number")
    public void testOnePositive2() {
        Assertions.assertEquals(fine, PositiveNumbers.positiveNumbers(-1, 2, -9));
    }

    @Test
    @DisplayName("one positive number")
    public void testOnePositive3() {
        Assertions.assertEquals(fine, PositiveNumbers.positiveNumbers(-1, -2, 9));
    }

    @Test
    @DisplayName("one positive number")
    public void testOnePositiveWithTwoZeros() {
        Assertions.assertEquals(fine, PositiveNumbers.positiveNumbers(0, 2, 0));
    }

    @Test
    @DisplayName("no positive numbers")
    public void testNoPositives() {
        Assertions.assertEquals(bad, PositiveNumbers.positiveNumbers(-1, -2, -9));
    }

    @Test
    @DisplayName("three zeros")
    public void testNoPositivesThreeZeros() {
        Assertions.assertEquals(bad, PositiveNumbers.positiveNumbers(0, 0, 0));
    }
}
