package it.academy.bordiyan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSumTest {
    @Test
    public void numberSumTest1() {
        Assertions.assertEquals(37, NumberSum.numberSumParts(2314));
    }

    @Test
    public void numberSumTest2() {
        Assertions.assertEquals(39, NumberSum.numberSumParts(1623));
    }
}




