package by.itacademy;

import by.itcademy.SumNumbersFromDigits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumNumbersFromDigitsTest {
    @Test
    @DisplayName("1234 number")
    public void test1() {
        Assertions.assertEquals(46, SumNumbersFromDigits.sumFromDigits(1234));
    }

    @Test
    @DisplayName("4321 number")
    public void test2() {
        Assertions.assertEquals(64, SumNumbersFromDigits.sumFromDigits(4321));
    }

    @Test
    @DisplayName("1000 number")
    public void test3() {
        Assertions.assertEquals(10, SumNumbersFromDigits.sumFromDigits(1000));
    }

    @Test
    @DisplayName("9999 number")
    public void test4() {
        Assertions.assertEquals(198, SumNumbersFromDigits.sumFromDigits(9999));
    }

    @Test
    @DisplayName("1001 number")
    public void test5() {
        Assertions.assertEquals(11, SumNumbersFromDigits.sumFromDigits(1001));
    }

    @Test
    @DisplayName("9009 number")
    public void test6() {
        Assertions.assertEquals(99, SumNumbersFromDigits.sumFromDigits(9009));
    }
}
