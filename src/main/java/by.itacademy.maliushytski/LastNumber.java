public class LastNumber {
    public static String sendLastNumber(int number) {
        if (number >= 10 || number <= -10) {
            int lastNumber = number % 10;
            return String.format("%s - последняя цифра числа %s", lastNumber, number);
        }
        return "irrelevant number";
    }
}
