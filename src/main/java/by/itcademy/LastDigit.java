package by.itcademy;

public class LastDigit {
    public static String lastDigit(int number) {
        int digit = number % 10;
        return String.format("%s - последняя цифра числа %s", digit, number);
    }
}
