package by.itacademy;

import by.itcademy.TimeFromNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TimeFromNumbersTests {
    @Test
    @DisplayName("1 sec")
    public void test1() {
        Assertions.assertEquals("0:00:01" , TimeFromNumbers.receiveTimeFromNumbers(1));
    }

    @Test
    @DisplayName("10 sec")
    public void test3() {
        Assertions.assertEquals("0:00:10" , TimeFromNumbers.receiveTimeFromNumbers(10));
    }

    @Test
    @DisplayName("60 sec")
    public void test4() {
        Assertions.assertEquals("0:01:00" , TimeFromNumbers.receiveTimeFromNumbers(60));
    }

    @Test
    @DisplayName("600 sec")
    public void test5() {
        Assertions.assertEquals("0:10:00" , TimeFromNumbers.receiveTimeFromNumbers(600));
    }

    @Test
    @DisplayName("70 sec")
    public void test6() {
        Assertions.assertEquals("0:01:10" , TimeFromNumbers.receiveTimeFromNumbers(70));
    }

    @Test
    @DisplayName("71 sec")
    public void test7() {
        Assertions.assertEquals("0:01:11" , TimeFromNumbers.receiveTimeFromNumbers(71));
    }

    @Test
    @DisplayName("3601 sec")
    public void test8() {
        Assertions.assertEquals("1:00:01" , TimeFromNumbers.receiveTimeFromNumbers(3601));
    }
}
