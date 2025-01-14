package by.itacademy.belaya.time;

import java.math.BigInteger;

public class TimeFormatter {

    private static BigInteger getHours(long totalSeconds) {
        return BigInteger.valueOf(totalSeconds / 3600);
    }

    private static BigInteger getMinutes(long totalSeconds) {
        return BigInteger.valueOf(totalSeconds % 3600 / 60);
    }

    private static BigInteger getRemainingSeconds(long totalSeconds) {
        return BigInteger.valueOf(totalSeconds % 60);
    }
}
