package by.itacademy.psekha;

public class ChangeOfNumber {
    public static String numbersOfChange(int a, int b, int c) {
        //  if (a > 0 & b > 0 & c > 0) {
        //  return String.format("a=%s, b=%s, c=%s excellent", a, b, c);
        if (a > 0 && b > 0 && c < 0 || a > 0 && b < 0 && c > 0 || a < 0 && b > 0 && c > 0) {
            return "good";
        } else if (a > 0 && b < 0 && c < 0 || a < 0 && b > 0 && c < 0 || a < 0 && b < 0 && c > 0) {
            return String.format("a=%s, b=%s, c=%s fine", a, b, c);
        } else if (a < 0 & b < 0 & c < 0) {
            return String.format("a=%s, b=%s, c=%s bad", a, b, c);
        } else if (a==0 & b==0 & c==0) {
            return "not found numbers";
        }
        return "excellent";
    }
}

