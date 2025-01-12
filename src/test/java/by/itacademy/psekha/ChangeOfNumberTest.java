

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangeOfNumberTest {

    @Test
    public void test() {
        Assertions.assertEquals("not found numbers", by.itacademy.psekha.ChangeOfNumber.numbersOfChange(0, 0, 0));
    }

    @Test
    public void test1() {
        Assertions.assertEquals("bad", by.itacademy.psekha.ChangeOfNumber.numbersOfChange(-7, -11, -1));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("fine", by.itacademy.psekha.ChangeOfNumber.numbersOfChange(-2, -4, 9));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("good", by.itacademy.psekha.ChangeOfNumber.numbersOfChange(20, 7, -4));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("excellent", by.itacademy.psekha.ChangeOfNumber.numbersOfChange(10, 20, 30));
    }
}
