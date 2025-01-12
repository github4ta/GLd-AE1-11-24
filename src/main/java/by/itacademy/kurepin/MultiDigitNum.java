package by.itacademy.kurepin;

public class MultiDigitNum {
    public static String lastValueOfNumber(int num) {
        String result;

        if ((int) Math.log10(num) + 1 > 1) {
            result = (num % 10) + " - последняя цифра числа " + num;
        } else result = "Не является многозначным";

        return result;
    }


}
