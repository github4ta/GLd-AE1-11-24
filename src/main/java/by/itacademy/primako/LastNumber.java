package by.itacademy.primako;

public class LastNumber {
    public static String printLastNumber(int number) {
        if (number >= 10 || number <= -10) {
            int lastNumber = Math.abs(number % 10);
            return (lastNumber + " - последняя цифра числа " + number);
        }
        return ("Число " + number + " не является многозначным");
    }
}

