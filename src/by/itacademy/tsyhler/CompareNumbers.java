package by.itacademy.tsyhler;

import java.util.Arrays;

public class CompareNumbers {
    public static String compareWithZero(int a, int b, int c) {
        int[] numbers = {a, b, c};
        if (Arrays.stream(numbers).filter(s -> s > 0).count() == 3) return "excellent";
        if (Arrays.stream(numbers).filter(s -> s > 0).count() == 2) return "good";
        if (Arrays.stream(numbers).filter(s -> s > 0).count() == 1) return "fine";
        return "bad";
    }

    public static void main(String[] args) {
        System.out.println(compareWithZero(-1, -1, -1));
    }
}
