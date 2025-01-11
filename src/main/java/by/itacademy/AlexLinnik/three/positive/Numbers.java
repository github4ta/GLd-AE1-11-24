package by.itacademy.AlexLinnik.three.positive;

public class Numbers {
    public static String numbers(int a, int b, int c) {
        int positiveCount = 0;
        if (a > 0) {
            positiveCount++;
        }
        if (b > 0) {
            positiveCount++;
        }
        if (c > 0) {
            positiveCount++;
        }
        if (positiveCount == 3) {
            return "excellent";
        }
        if (positiveCount == 2) {
            return "good";
        }
        if (positiveCount == 1) {
            return "fine";
        }
        if (a==0 & b ==0 & c==0){
            return "мы так не договаривались";
        }
        return "bad";
    }

}
