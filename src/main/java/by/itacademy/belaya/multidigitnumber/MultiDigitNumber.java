package by.itacademy.belaya.multidigitnumber;

public class MultiDigitNumber {

    public static String getMessageAboutLastDigit(long number) {
        if (!isMultiDigitNumber(number)) {
            throw new IllegalArgumentException("Число должно быть многозначным");
        }
        return new StringBuilder()
                .append(getLastDigit(number))
                .append(" - последняя цифра числа ")
                .append(number)
                .toString();
    }

    private static boolean isMultiDigitNumber(long number) {
        return Math.abs(number) >= 10;
    }

    private static long getLastDigit(long number) {
        return Math.abs(number % 10);
    }
}
