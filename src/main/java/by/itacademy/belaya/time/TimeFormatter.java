package by.itacademy.belaya.time;

import java.math.BigInteger;

public class TimeFormatter {

    public static String getFormattedTime(long totalSeconds) {

        if (isNegative(totalSeconds)) {
            throw new IllegalArgumentException("Время не может быть отрицательным");
        }

        BigInteger hours = getHours(totalSeconds);
        BigInteger minutes = getMinutes(totalSeconds);
        BigInteger remainingSeconds = getRemainingSeconds(totalSeconds);

        StringBuilder formattedTime = new StringBuilder();

        if (hours.compareTo(BigInteger.ZERO) > 0) {
            formattedTime.append(hours)
                    .append(" ")
                    .append(TimeUnitFormatter.HOURS.getWordForm(hours.longValue()));
        }
        if (minutes.compareTo(BigInteger.ZERO) > 0) {
            if (!formattedTime.isEmpty()) {
                formattedTime.append(" ");
            }
            formattedTime.append(minutes)
                    .append(" ")
                    .append(TimeUnitFormatter.MINUTES.getWordForm(minutes.longValue()));
        }
        if (remainingSeconds.compareTo(BigInteger.ZERO) > 0 || formattedTime.isEmpty()) {
            if (!formattedTime.isEmpty()) {
                formattedTime.append(" ");
            }
            formattedTime.append(remainingSeconds)
                    .append(" ")
                    .append(TimeUnitFormatter.SECONDS.getWordForm(remainingSeconds.longValue()));
        }
        return formattedTime.toString();
    }

    private static BigInteger getHours(long totalSeconds) {
        return BigInteger.valueOf(totalSeconds / 3600);
    }

    private static BigInteger getMinutes(long totalSeconds) {
        return BigInteger.valueOf(totalSeconds % 3600 / 60);
    }

    private static BigInteger getRemainingSeconds(long totalSeconds) {
        return BigInteger.valueOf(totalSeconds % 60);
    }

    private static boolean isNegative(long totalSeconds) {
        return totalSeconds < 0;
    }
}
