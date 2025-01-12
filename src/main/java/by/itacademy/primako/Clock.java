package by.itacademy.primako;

public class Clock {
    public static String convertSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        if (totalSeconds < 0) {
            return "Ошибка! Значение вводимого числа должно быть минимум 0";
        }
        return hours + " часов " + minutes + " минут " + seconds + " секунд";
    }
}
