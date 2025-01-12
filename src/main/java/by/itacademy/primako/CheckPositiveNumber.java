package by.itacademy.primako;

public class CheckPositiveNumber {
    public static String checkNumber(int a, int b, int c) {

        if (a > 0 & b > 0 & c > 0) {
            return "excellent";
        }
        if (a > 0 & b > 0 & c <= 0 | a > 0 & c > 0 & b <= 0 | b > 0 & c > 0 & a <= 0) {
            return "good";
        }
        if (a > 0 & b <= 0 & c <= 0 | a <= 0 & c > 0 & b <= 0 | b > 0 & c <= 0 & a <= 0) {
            return "fine";
        }
        if (a <= 0 & b <= 0 & c <= 0) {
            return "bad";
        }
        return "not found";
    }
}

