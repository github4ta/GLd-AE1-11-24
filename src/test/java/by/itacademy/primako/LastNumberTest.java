package by.itacademy.primako;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastNumberTest {

    @Test
    public void testNumberPositive() {
        Assertions.assertEquals("4 - последняя цифра числа 458954", LastNumber.printLastNumber(458954));
    }
    @Test
    public void testNumberZero() {
        Assertions.assertEquals("Число 0 не является многозначным", LastNumber.printLastNumber(0));
    }
    @Test
    public void testNumberNegative() {
        Assertions.assertEquals("4 - последняя цифра числа -458954", LastNumber.printLastNumber(-458954));
    }
    @Test
    public void testNumberNegative10() {
        Assertions.assertEquals("0 - последняя цифра числа -10", LastNumber.printLastNumber(-10));
    }
    @Test
    public void testNumberPositive10() {
        Assertions.assertEquals("0 - последняя цифра числа 10", LastNumber.printLastNumber(10));
    }
    @Test
    public void testNumberNegative9() {
        Assertions.assertEquals("Число -9 не является многозначным", LastNumber.printLastNumber(-9));
    }
    @Test
    public void testNumberPositive9() {
        Assertions.assertEquals("Число 9 не является многозначным", LastNumber.printLastNumber(9));
    }
}
