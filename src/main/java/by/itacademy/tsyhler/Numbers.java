package by.itacademy.tsyhler;

import java.util.Arrays;

public class Numbers {
    public static String positiveNumbers(int a, int b, int c) {
        int[] numbers = {a, b, c};
        int positiveCount = (int) Arrays.stream(numbers).filter(s -> s > 0).count();
        if (positiveCount == 3) return "excellent";
        if (positiveCount == 2) return "good";
        if (positiveCount == 1) return "fine";
        return "bad";
    }


    //    Многозначное число – число, у которого 2 и более цифр, например, 23, 124, 2345678.
//    Написать код, который будет выводить в консоль сообщение:
//            “5 - последняя цифра числа ХХХ5”.
//    Оформить решение в виде метода в классе (названия на ваше усмотрение)
    public static String lastDigitOfNumber(long number) {
        int lastDigit = (int) (number % 10);
        if (lastDigit < 0) lastDigit = -lastDigit;
        return String.format("%d - последняя цифра числа %d", lastDigit, number);
    }

    public static String lastDigitOfNumber(String number) {
        char[] digitsOfNumber = number.toCharArray();
        return String.format("%s - последняя цифра числа %s", digitsOfNumber[digitsOfNumber.length - 1], number);
    }

    public static void main(String[] args) {
        System.out.println(positiveNumbers(-1, -1, -1));
        System.out.println(lastDigitOfNumber("56543334"));

    }
}
