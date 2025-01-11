package by.itacademy.tsyhler;

import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;

public class DateChecker {

    private static final Set<MonthDay> CELEBRATION_DAYS = Set.of(
            MonthDay.of(1, 1),
            MonthDay.of(1, 2),
            MonthDay.of(1, 7),
            MonthDay.of(3, 8),
            MonthDay.of(5, 1),
            MonthDay.of(5, 9),
            MonthDay.of(5, 14),
            MonthDay.of(7, 3),
            MonthDay.of(11, 7),
            MonthDay.of(12, 25)
    );


    public static String dateExist(int day, int month) {
        try {
            YearMonth yearMonth = YearMonth.of(2025, month);
            MonthDay date = MonthDay.of(month, day);
            if (day < 1 || day > yearMonth.lengthOfMonth()) {
                return "такой даты не существует";
            } else if (CELEBRATION_DAYS.contains(date)) {
                return "Праздничный день";
            } else {
                return DateChecker.dateToString(day, month);
            }

        } catch (Exception e) {
            return "такой даты не существует";
        }
    }


    private static String dateToString(int day, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month - 1); // т.к месяцы начинаются с нуля
        calendar.set(Calendar.DATE, day);
        String monthName = calendar.getDisplayName(Calendar.MONTH,
                Calendar.LONG, new Locale("ru"));
        return day + " " + monthName;
    }

    public static void main(String[] args) {
        System.out.println(dateExist(3, 4));
    }

}
