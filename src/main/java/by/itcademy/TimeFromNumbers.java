package by.itcademy;

public class TimeFromNumbers {
    public static String receiveTimeFromNumbers(int numberOfSeconds) {
        int secResult = numberOfSeconds % 60;
        int minutes = numberOfSeconds / 60;
        int minResult = minutes % 60;
        int hoursResult = minutes / 60;
        if (hoursResult == 24) {
            return String.format("%d:%02d:%02d", 0, minResult, secResult);
        } else {
            return String.format("%d:%02d:%02d", hoursResult, minResult, secResult);
        }
    }
}
