package by.itacademy.nikolaipsekha;

public class MyClass {
    public static String numbersOfChange(int a, int b, int c) {
        if (a > 0 & b > 0 & c > 0) {
            return " exellent ";
        } else if (a > 0 && b > 0 && c < 0) {
            return " good ";
        } else if (a > 0 && b < 0 && c < 0) {
            return " fine ";
        } else if (a < 0 && b < 0 && c < 0) {
            return " bad ";
        }
        return " ";
    }
}
