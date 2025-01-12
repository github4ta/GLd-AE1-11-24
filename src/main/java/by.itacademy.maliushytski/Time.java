public class Time {
    public static String setTimeFormatFromSeconds(int seconds) {
        if (isValid(seconds)) {
            throw new IllegalArgumentException("No seconds to convert");
        }

        int hours = getHours(seconds);
        int minutes = getMinutes(seconds);
        int lastSeconds = getSeconds(seconds);

        if (hours > 0) {
            return String.format("%s часов %s минут %s секунд", hours, minutes, lastSeconds);
        } else if (minutes > 0) {
            return String.format("%s минут %s секунд", minutes, lastSeconds);
        } else {
            return String.format("%s секунд", lastSeconds);
        }
    }

    private static boolean isValid(int seconds) {
        return seconds <= 0;
    }

    private static int getHours(int seconds) {
        return seconds / 3600;
    }

    private static int getMinutes(int seconds) {
        return (seconds % 3600) / 60;
    }

    private static int getSeconds(int seconds) {
        return seconds % 60;
    }
}
