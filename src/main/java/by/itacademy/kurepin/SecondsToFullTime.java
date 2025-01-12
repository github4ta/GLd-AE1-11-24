package by.itacademy.kurepin;

public class SecondsToFullTime {
    public static String secondsConvert(int sec) {
        int hours=sec/3600;
        int minutes=(sec%3600)/60;
        int seconds=sec%60;
        String time;
        if (hours==0){
             time = String.format("%d минут %d секунд", minutes, seconds);
        }else {
            time = String.format("%d часов %d минут %d секунд", hours, minutes, seconds);
        }

        return time;
    }

}
