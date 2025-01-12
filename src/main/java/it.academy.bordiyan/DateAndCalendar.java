package it.academy.bordiyan;

public class DateAndCalendar {
    public static String dateCalendar(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return "Такой даты не существует";
        }

        if (month == 2 & day > 28) {
            return "Такой даты не существует";
        }

    }

}
