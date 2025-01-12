public class FourDigitNumber {
    public static int findSumHalvesFourDigits(int number) {
        //проверяем можно ли дальше работать с числом
        if (number < 0) {
            throw new IllegalArgumentException("Число отрицательное");
        }
        //проверяем равно ли введенное значение нулю
        if (number == 0) {
            return 0;
        }

        String stringNumber = String.valueOf(number);
        //прверяем действительно ли занчение состоит их 4 знаков
        if (stringNumber.length() != 4) {
            throw new IllegalArgumentException("Число не четырехзначное");
        }

        int firstPart = Integer.parseInt(stringNumber.substring(0, 2));
        int secondPart = Integer.parseInt(stringNumber.substring(2));

        return firstPart + secondPart;
    }
}
