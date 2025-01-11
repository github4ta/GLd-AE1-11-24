package Test.ThreeNumbers;

import by.itacademy.AlexLinnik.three.positive.Numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testThreeNumbers {
    @Test
    @DisplayName("We check for the presence of three positive numbers.")
    public void testNumbers1() {
        Assertions.assertEquals("excellent", Numbers.numbers(1, 2, 6));
    }

    @Test
    @DisplayName("We check for the presence of two positive numbers.")
    public void testNumbers2() {
        Assertions.assertEquals("good", Numbers.numbers(-4, 8, 9));
    }

    @Test
    @DisplayName("We check for the presence of one positive digit.")
    public void testNumbers3() {
        Assertions.assertEquals("fine", Numbers.numbers(-9, -7, 3));
    }

    @Test
    @DisplayName("We check for the presence of zeros.")
    public void testNumbers4() {
        Assertions.assertEquals("мы так не договаривались", Numbers.numbers(0, 0, 0));
    }
}
