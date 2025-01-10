package by.itcademy;

public class PositiveNumbers {
    public static String positiveNumbers(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            return "excellent";
        }
        if (a * b < 0 && c > 0 ||
                a * c < 0 && b > 0 ||
                c * b < 0 && a > 0 ||
                a == 0 && b > 0 && c > 0 ||
                b == 0 && a > 0 && c > 0 ||
                c == 0 && b > 0 && a > 0
        ) {
            return "good";
        }
        if (a * b < 0 && c < 0 ||
                a * c < 0 && b < 0 ||
                c * b < 0 && a < 0 ||
                a == 0 && b == 0 && c > 0 ||
                b == 0 && c == 0 && a > 0 ||
                c == 0 && a == 0 && b > 0) {
            return "fine";

        } else {
            return "bad";
        }
    }
}

