package by.itacademy.tsyhler;

import java.util.Arrays;

public class CompareNumbers {
    public static String compareWithZero(int a, int b, int c) {
        int[] numbers = {a, b, c};
        int positiveCount = (int) Arrays.stream(numbers).filter(s -> s > 0).count();
        if (positiveCount == 3) return "excellent";
        if (positiveCount == 2) return "good";
        if (positiveCount == 1) return "fine";
        return "bad";
    }

    public static void main(String[] args) {
        System.out.println(compareWithZero(-1, -1, -1));
    }
}
