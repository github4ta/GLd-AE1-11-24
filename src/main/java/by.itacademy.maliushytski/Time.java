public class Time {
    public static String setTimeFormatFromSeconds(int seconds) {
        if (seconds <= 0) {
            throw new IllegalArgumentException("No seconds to convert");
        }
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int lastSeconds = seconds % 60;
        if (hours > 0) {
            return String.format("%s часов %s минут %s секунд", hours, minutes, lastSeconds);
        } else if (minutes > 0) {
            return String.format("%s минут %s секунд", minutes, lastSeconds);
        } else {
            return String.format("%s секунд", lastSeconds);
        }
    }
}
