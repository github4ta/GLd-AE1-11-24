package by.itacademy;

import by.itcademy.LastDigit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LastDigitTest {
    @Test
    @DisplayName("last digit of 10")
    public void test1() {
        Assertions.assertEquals("0 - последняя цифра числа 10", LastDigit.lastDigit(10));
    }

    @Test
    @DisplayName("last digit of 100")
    public void test2() {
        Assertions.assertEquals("0 - последняя цифра числа 100", LastDigit.lastDigit(100));
    }

    @Test
    @DisplayName("last digit of 35")
    public void test3() {
        Assertions.assertEquals("5 - последняя цифра числа 35", LastDigit.lastDigit(35));
    }

    @Test
    @DisplayName("last digit of 12313")
    public void test4() {
        Assertions.assertEquals("3 - последняя цифра числа 12313", LastDigit.lastDigit(12313));
    }

    @Test
    @DisplayName("last digit of 1000009")
    public void test5() {
        Assertions.assertEquals("9 - последняя цифра числа 1000009", LastDigit.lastDigit(1000009));
    }

    @Test
    @DisplayName("last digit of 123457")
    public void test6() {
        Assertions.assertEquals("7 - последняя цифра числа 123457", LastDigit.lastDigit(123457));
    }

    @Test
    @DisplayName("last digit of 10")
    public void test7() {
        Assertions.assertEquals("0 - последняя цифра числа 10", LastDigit.lastDigit(10));
    }
}
