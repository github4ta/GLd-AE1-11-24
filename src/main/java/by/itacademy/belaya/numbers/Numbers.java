package by.itacademy.belaya.numbers;

public class Numbers {
    public static String getClassificationForNumbers(int number1, int number2, int number3) {
        int count = 0;
        if (number1 > 0) {
            count++;
        }
        if (number2 > 0) {
            count++;
        }
        if (number3 > 0) {
            count++;
        }
        switch (count) {
            case 3:
                return "excellent";
            case 2:
                return "good";
            case 1:
                return "fine";
            default:
                return "bad";
        }
    }
}
