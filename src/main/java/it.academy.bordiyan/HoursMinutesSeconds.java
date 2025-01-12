package it.academy.bordiyan;

public class HoursMinutesSeconds {
     public static String convertSeconds(int totalSeconds){
if (totalSeconds<0){
    return "Указано неверное количество секунд";
}
         int hours = totalSeconds / 3600;
         int minutes = (totalSeconds % 3600) / 60;
         int seconds = totalSeconds % 60;
     }
}
