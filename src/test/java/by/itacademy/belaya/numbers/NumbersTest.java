package by.itacademy.belaya.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    @Test
    @DisplayName("All numbers are positive")
    public void test1() {
        Assertions.assertEquals("excellent",
                Numbers.classify(1, Integer.MAX_VALUE, 20));
    }

}

