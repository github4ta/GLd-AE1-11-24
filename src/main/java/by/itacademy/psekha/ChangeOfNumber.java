package by.itacademy.psekha;

public class ChangeOfNumber {
    public static String numbersOfChange(int a, int b, int c) {
        if (a > 0 && b > 0 && c < 0 || a > 0 && b < 0 && c > 0 || a < 0 && b > 0 && c > 0) {
            return "good";
        } else if (a > 0 && b < 0 && c < 0 || a < 0 && b > 0 && c < 0 || a < 0 && b < 0 && c > 0) {
            return "fine";
        } else if (a < 0 & b < 0 & c < 0) {
            return "bad";
        } else if (a == 0 & b == 0 & c == 0) {
            return "not found numbers";
        }
        return "excellent";
    }
}

