package by.itacademy.tsyhler;

import java.util.Arrays;

public class Numbers {

    public static String positiveNumbers(int a, int b, int c) {
        int[] numbers = {a, b, c};
        int positiveCount = (int) Arrays.stream(numbers).filter(s -> s > 0).count();
        if (positiveCount == 3) {
            return "excellent";
        }
        if (positiveCount == 2) {
            return "good";
        }
        if (positiveCount == 1) {
            return "fine";
        }
        return "bad";
    }

    public static String lastDigitOfNumber(long number) {
        int lastDigit = (int) (number % 10);
        if (lastDigit < 0) lastDigit = -lastDigit;
        return String.format("%d - последняя цифра числа %d", lastDigit, number);
    }

    public static String lastDigitOfNumber(String number) {
        char[] digitsOfNumber = number.toCharArray();
        return String.format("%s - последняя цифра числа %s", digitsOfNumber[digitsOfNumber.length - 1], number);
    }

    public static int sumOfNumbers(int number) {
        int firstPartOfNumber = number / 100;
        int secondPartOfNumber = (number < 0) ? -number % 100 : number % 100;
        return firstPartOfNumber + secondPartOfNumber;
    }
}
