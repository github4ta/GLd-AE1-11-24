package by.itcademy;

public class SumNumbersFromDigits {
    public static int sumFromDigits(int number) {

        int ab = number / 100;
        int cd = number % 100;
        return ab + cd;
    }
}
