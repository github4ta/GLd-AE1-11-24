package by.itacademy.bordiyan;

public class PositiveNumber {
    public static String positiveNumber(int a, int b, int c) {
        if (a > 0 & b > 0 & c > 0) {
            return "excellent - все три числа больше 0";
        }
        if ((a > 0 & b > 0 & c < 0) || (a > 0 & b < 0 & c > 0) || (a < 0 & b > 0 & c > 0)) {
            return String.format("good - два числа больше 0");
        }
        if ((a > 0 & b < 0 & c < 0) || (a < 0 & b > 0 & c < 0) || (a < 0 & b < 0 & c > 0)) {
            return String("fine - одно числа больше 0");
        } if (a < 0 & b < 0 & c < 0) {
            return String("Bad - ни одного числа больше 0");
        }
       return String("Вы вели нули");
    }
}
