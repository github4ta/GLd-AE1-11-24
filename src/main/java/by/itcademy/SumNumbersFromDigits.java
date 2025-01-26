package by.itcademy;

public class SumNumbersFromDigits {
    public static int sumFromDigits(int number) {
        int ab = getABNumber(number);
        int cd = getCDNumber(number);
        return ab + cd;
    }

    private static int getABNumber(int number){
        return number / 100;
    }

    private static int getCDNumber(int number){
        return number % 100;
    }
}
