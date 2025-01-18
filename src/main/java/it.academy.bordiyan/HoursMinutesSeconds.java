package it.academy.bordiyan;

public class HoursMinutesSeconds {
    public static String convertSeconds(int totalSeconds) {
        if (totalSeconds < 0) {
            return "Указано неверное количество секунд";
        }
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        if (hours > 0) {
            return String.format("%03d часов %02d минут %02d секунд", hours, minutes, seconds);
        } else if (minutes > 0) {
            return String.format("%02d минут %02d секунд", minutes, seconds);
        }
        return String.format(" %02d секунд", seconds);
    }
}
