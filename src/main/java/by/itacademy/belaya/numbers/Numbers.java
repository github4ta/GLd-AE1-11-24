package by.itacademy.belaya.numbers;

public class Numbers {

    public static String getClassificationForNumbers(int number1, int number2, int number3) {
        int count = 0;

        if (isPositive(number1)) {
            count++;
        }
        if (isPositive(number2)) {
            count++;
        }
        if (isPositive(number3)) {
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

    private static boolean isPositive(int number) {
        return number > 0;
    }
}
