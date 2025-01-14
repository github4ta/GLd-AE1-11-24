public class LastNumber {
    public static String getLastDigitAsString(int number) {
        int lowerBoundaryToStartProcess = -10;
        int upperBoundaryToStartProcess = 10;
        if (number >= upperBoundaryToStartProcess || number <= lowerBoundaryToStartProcess) {
            return String.format("%s - последняя цифра числа %s", getLastDigit(number), number);
        }
        return "irrelevant number";
    }

    private static int getLastDigit(int number) {
        return number % 10;
    }
}
