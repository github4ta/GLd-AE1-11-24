package it.academy.bordiyan;

public class MultiDigitNumber {
    public static String digitNumber(int number) {
        if (number < 10) {
            return "Число должно быть многозначным, содержать 2 и более цифры";
        }

        int digitNumber = number % 10;
        return digitNumber+ " - последняя цифра числа " + number;
    }
}
