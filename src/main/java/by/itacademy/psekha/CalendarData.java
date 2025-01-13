import java.time.Month;

public class CalendarData {
    public static String getData(int month, int day) {
        if (month > 12 || month < 1 || day < 1 || day > 31) {
            return "there is no such date";
        }
        if (month == 2 & day > 28) {
            return "there is no such date";
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return "there is no such date";
        }

    }
}

