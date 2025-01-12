package by.itacademy.primako;

public class Calculate {

    public static String calculateSum(int number) {
        if (number < 1000 | number > 9999) {
            return "Ошибка! Введите число в четырехзначное число!";
        }

        int ab = number / 100;
        int cd = number % 100;

        return String.valueOf(ab + cd);
    }
}
