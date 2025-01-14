package by.itacademy.belaya.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    @Test
    @DisplayName("All numbers are positive")
    public void test1() {
        Assertions.assertEquals("excellent",
                Numbers.getClassificationForNumbers(1, Integer.MAX_VALUE, 20));
    }

    @Test
    @DisplayName("Two numbers are positive")
    public void test2() {
        Assertions.assertEquals("good",
                Numbers.getClassificationForNumbers(0, Integer.MAX_VALUE, 20));
    }

    @Test
    @DisplayName("One number is positive")
    public void test3() {
        Assertions.assertEquals("fine",
                Numbers.getClassificationForNumbers(0, Integer.MAX_VALUE, -10));
    }

    @Test
    @DisplayName("Numbers are not positive")
    public void test4() {
        Assertions.assertEquals("bad",
                Numbers.getClassificationForNumbers(0, 0, -10));
    }

    @Test
    @DisplayName("All numbers are zero")
    public void test5() {
        Assertions.assertEquals("bad",
                Numbers.getClassificationForNumbers(0, 0, 0));
    }

    @Test
    @DisplayName("All numbers are negative")
    public void test6() {
        Assertions.assertEquals("bad",
                Numbers.getClassificationForNumbers(-1, -2, Integer.MIN_VALUE));
    }
}
