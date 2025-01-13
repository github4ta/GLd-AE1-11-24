package by.itacademy.tsyhler;

public class TimeConverter {

    public static String timeToNormalView(int seconds) {
        if (seconds < 0) return "Некорректное значение";
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        return String.format("%d часов %d минут %d секунд", hours, minutes, seconds % 60);
    }

}
