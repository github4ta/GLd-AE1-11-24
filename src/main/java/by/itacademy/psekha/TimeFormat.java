public class TimeFormat {
    public static String getTime(int seconds) {
        int minutes = (seconds % 3600) / 60;
        int hours = seconds / 3600;
        int sec = seconds % 60;
        if (hours > 0 ) {
            return String.format("%03d часов %02d минут %02d секунд", hours, minutes, sec);

        }else if (minutes > 0 ){
            return String.format("%02d минут %02d секунд", minutes, sec);
        }
        return String.format(" %02d секунд", sec);
    }
}
