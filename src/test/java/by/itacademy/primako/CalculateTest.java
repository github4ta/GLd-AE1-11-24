package by.itacademy.primako;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateTest {
    @Test
    public void testSum4Zero() {
        Assertions.assertEquals("Ошибка! Введите число в четырехзначное число!", Calculate.calculateSum(0000));
    }
    @Test
    public void testSumZero() {
        Assertions.assertEquals("Ошибка! Введите число в четырехзначное число!", Calculate.calculateSum(0));
    }
    @Test
    public void testSumZero2() {
        Assertions.assertEquals("Ошибка! Введите число в четырехзначное число!", Calculate.calculateSum(0002));
    }
    @Test
    public void testSum999() {
        Assertions.assertEquals("Ошибка! Введите число в четырехзначное число!", Calculate.calculateSum(999));
    }
    @Test
    public void testSum99999() {
        Assertions.assertEquals("Ошибка! Введите число в четырехзначное число!", Calculate.calculateSum(99999));
    }
    @Test
    public void testSumPositive() {
        Assertions.assertEquals("158", Calculate.calculateSum(9563));
    }
}
