public class FourDigitNumber {
    public static int findSumHalvesFourDigits(int number) {
        String stringNumber = String.valueOf(number);
        if (number < 0) {
            throw new IllegalArgumentException("Число отрицательное");
        } else if (number == 0) {
            return 0;
        } else if (stringNumber.length() != 4) {
            throw new IllegalArgumentException("Число не четырехзначное");
        }
        int firstPart = Integer.parseInt(stringNumber.substring(0, 2));
        int secondPart = Integer.parseInt(stringNumber.substring(2));

        return firstPart + secondPart;
    }
}
