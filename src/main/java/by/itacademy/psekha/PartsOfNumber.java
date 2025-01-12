public class PartsOfNumber {
    public static int addParts(int number) {

        String numberStr = String.valueOf(number);

        int firstPart = Integer.parseInt(numberStr.substring(0, 2));
        int secondPart = Integer.parseInt(numberStr.substring(2));

        return firstPart + secondPart;
    }
}
