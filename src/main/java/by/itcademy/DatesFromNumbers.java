package by.itcademy;

import java.time.Month;

public class DatesFromNumbers {
    public static String writeDate(int month, int day) {
        if (month < 1 || month > 12 ||
                day < 1 || day > 31 ||
                (month == 2 && day > 28) ||
                ((month == 4 || month == 6 || month == 9 || month == 11)) && day > 30) {
            return "date does not exist";
        }

        if ((month == 1 && (day == 1 || day == 2 || day == 7)) ||
                (month == 3 && day == 8) ||
                (month == 5 && (day == 1 || day == 9 || day == 14)) ||
                (month == 11 && day == 7) ||
                (month == 12 && day == 25)) {
            return "holiday";
        } else {
            return day + " " + Month.of(month);
        }
    }
}
