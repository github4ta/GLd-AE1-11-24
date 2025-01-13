public class TimeFormat {
    public static String getTime(int seconds) {
        int minutes = (seconds % 3600) / 60;
        int hours = seconds / 3600;
        int newSeconds = seconds % 60;
        if (hours > 0) {
            return String.format("%03d часов %02d минут %02d секунд", hours, minutes, newSeconds);
        } else if (minutes > 0) {
            return String.format("%02d минут %02d секунд", minutes, newSeconds);
        }
        return String.format(" %02d секунд", newSeconds);
    }
}
