public class LastNumber {
    public static String sendLastNumber(int number) {
        int lastNumber = number % 10;
        return String.format("%s - последняя цифра числа %s", lastNumber, number);
    }
}
