package it.academy.bordiyan;

public class DateAndCalendar {
    public static String dateCalendar(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return "Такой даты не существует";
        }

        if (month == 2 & day > 28) {
            return "Такой даты не существует";
        }

        if ((month == 4 || month == 6 || month == 9 || month == 12) & day >= 30) {
            return "Такой даты не существует";
        }
        if ((month == 1 && (day == 1 || day == 2 || day == 7)) ||
                (month == 3 && day == 8) ||
                (month == 5 && (day == 1 || day == 9 || day == 14)) ||
                (month == 7 && day == 3) ||
                (month == 11 && day == 7) ||
                (month == 12 && day == 25)) {
            return "Праздничный день";
        }
    }
}

