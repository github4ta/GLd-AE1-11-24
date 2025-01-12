package by.itacademy.kurepin;

public class SecondsToFullTime {
    public static String secondsConvert(int sec) {
        String time = String.format("%d часов %d минут %d секунд", sec / 3600, (sec % 3600) / 60, sec % 60);
        return time;
    }

}
