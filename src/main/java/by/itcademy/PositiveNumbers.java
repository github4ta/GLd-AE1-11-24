package by.itcademy;

public class PositiveNumbers {
    public static String positiveNumbers(int a, int b, int c) {
        if (isAllNumbersPositive(a, b, c)) {
            return "excellent";
        }

        if (isAnyOfThreeNumbersPositive(a, b, c)) {
            return "good";
        }

        if (isAllNumbersNegative(a, b, c)) {
            return "fine";
        } else {
            return "bad";
        }
    }

    private static boolean isAllNumbersPositive(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }

    private static boolean isAnyOfThreeNumbersPositive(int a, int b, int c) {
        return (a * b < 0 && c > 0 ||
                a * c < 0 && b > 0 ||
                c * b < 0 && a > 0 ||
                a == 0 && b > 0 && c > 0 ||
                b == 0 && a > 0 && c > 0 ||
                c == 0 && b > 0 && a > 0);
    }

    private static boolean isAllNumbersNegative(int a, int b, int c) {
        return (a * b < 0 && c < 0 ||
                a * c < 0 && b < 0 ||
                c * b < 0 && a < 0 ||
                a == 0 && b == 0 && c > 0 ||
                b == 0 && c == 0 && a > 0 ||
                c == 0 && a == 0 && b > 0);
    }
}

