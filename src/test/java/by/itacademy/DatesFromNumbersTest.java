package by.itacademy;

import by.itcademy.DatesFromNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DatesFromNumbersTest {
    private final String dateDoesNotExist = "date does not exist";
    private final String holiday = "holiday";

    @Test
    @DisplayName("not existing date with month = 0")
    public void test1() {
        Assertions.assertEquals(dateDoesNotExist, DatesFromNumbers.writeDate(0, 1));
    }

    @Test
    @DisplayName("not existing date with day = 0")
    public void test2() {
        Assertions.assertEquals(dateDoesNotExist, DatesFromNumbers.writeDate(1, 0));
    }

    @Test
    @DisplayName("not existing date with day = 32")
    public void test3() {
        Assertions.assertEquals(dateDoesNotExist, DatesFromNumbers.writeDate(1, 32));
    }

    @Test
    @DisplayName("not existing date - February, 30")
    public void test4() {
        Assertions.assertEquals(dateDoesNotExist, DatesFromNumbers.writeDate(2, 30));
    }

    @Test
    @DisplayName("not existing date - April, 31")
    public void test5() {
        Assertions.assertEquals("date does not exist", DatesFromNumbers.writeDate(4, 31));
    }

    @Test
    @DisplayName("not existing date - May, 32")
    public void test6() {
        Assertions.assertEquals(dateDoesNotExist, DatesFromNumbers.writeDate(5, 32));
    }

    @Test
    @DisplayName("Holiday, Jan-1")
    public void test7() {
        Assertions.assertEquals(holiday, DatesFromNumbers.writeDate(1, 1));
    }

    @Test
    @DisplayName("Holiday, May-9")
    public void test8() {
        Assertions.assertEquals(holiday, DatesFromNumbers.writeDate(5, 9));
    }

    @Test
    @DisplayName("Jan-31")
    public void test9() {
        Assertions.assertEquals("31 JANUARY", DatesFromNumbers.writeDate(1, 31));
    }

    @Test
    @DisplayName("Feb-28")
    public void test10() {
        Assertions.assertEquals("28 FEBRUARY", DatesFromNumbers.writeDate(2, 28));
    }

    @Test
    @DisplayName("Mar-15")
    public void test11() {
        Assertions.assertEquals("15 MARCH", DatesFromNumbers.writeDate(3, 15));
    }
    @Test
    @DisplayName("Aug-31")
    public void test12() {
        Assertions.assertEquals("31 AUGUST", DatesFromNumbers.writeDate(8, 31));
    }
}
