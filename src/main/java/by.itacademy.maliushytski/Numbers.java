import java.util.stream.Stream;

public class Numbers {
    public static String defineZeros(int firstNumber, int secondNumber, int thirdNumber) {
        long qtyNonZeroNumbers = Stream.of(firstNumber, secondNumber, thirdNumber).filter(n -> n > 0).count();

        if (qtyNonZeroNumbers == 1) {
            return "fine";
        } else if (qtyNonZeroNumbers == 2) {
            return "good";
        } else if (qtyNonZeroNumbers == 3) {
            return "excellent";
        }
        return "bad";
    }
}
