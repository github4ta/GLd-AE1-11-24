import java.util.stream.Stream;

public class Numbers {
    public static String defineZeros(int firstNumber, int secondNumber, int thirdNumber) {
        long qtyNonZeroNumbers = Stream.of(firstNumber, secondNumber, thirdNumber).filter(n -> n > 0).count();
        return switch ((int) qtyNonZeroNumbers) {
            case 1 -> Status.FINE.getDescription();
            case 2 -> Status.GOOD.getDescription();
            case 3 -> Status.EXCELLENT.getDescription();
            default -> Status.BAD.getDescription();
        };
    }
}
