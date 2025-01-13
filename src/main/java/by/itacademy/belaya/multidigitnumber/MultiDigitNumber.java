package by.itacademy.belaya.multidigitnumber;

public class MultiDigitNumber {

    private static boolean isMultiDigitNumber(long number) {
        return Math.abs(number) >= 10;
    }

    private static long getLastDigit(long number) {
        return Math.abs(number % 10);
    }
}
