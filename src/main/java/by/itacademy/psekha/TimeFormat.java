public class TimeFormat {
    public static String getTime(int seconds) {
        int sec = 1249;
        String time = String.format(" %d минут %d секунд", (sec % 3600) / 60, sec % 60);
        return time;
    }
    public static String getTime(String[] args) {
        int sec = 648958;
        String time = String.format("%03d часов %02d минут %02d секунд", sec / 3600, (sec % 3600) / 60, sec % 60);
        return time;
    }
}