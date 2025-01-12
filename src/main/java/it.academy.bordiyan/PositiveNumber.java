package it.academy.bordiyan;

public class PositiveNumber {
    public static String positiveNumber(int a, int b, int c) {
        if (a > 0 & b > 0 & c > 0) {
            return "excellent - все три числа больше 0";
        }
        if ((a > 0 & b > 0 & c < 0) || (a > 0 & b < 0 & c > 0) || (a < 0 & b > 0 & c > 0)) {
            return "good - два числа больше 0";
        }
        if ((a > 0 & b < 0 & c < 0) || (a < 0 & b > 0 & c < 0) || (a < 0 & b < 0 & c > 0)) {
            return "fine - одно числа больше 0";
        }
        if (a < 0 & b < 0 & c < 0) {
            return "Bad - ни одного числа больше 0";
        } else {
            return "Вы вели все нули";
        }
    }
}
