import java.time.Month;
import java.time.MonthDay;
import java.util.Set;

public class Calendar {
    private static final Set<Month> MONTHS_WITH_31_days = Set.of(
            Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY,
            Month.AUGUST, Month.OCTOBER, Month.DECEMBER);

    private static final Set<Month> MONTHS_WITH_30_days = Set.of(
            Month.APRIL, Month.JUNE, Month.SEPTEMBER, Month.NOVEMBER);

    private static final Set<MonthDay> PUBLIC_HOLIDAYS = Set.of(
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

    public static String getDayAndMonths(int day, int month) {
        String publicHoliday = "Public holiday";
        if (day <= 0 || month <= 0) {
            throw new IllegalArgumentException("Incorrect value");
        }

        Months enumMonth = Months.fromInt(month);
        Month javaMonth = Month.of(enumMonth.getMonthNumber());

        if (isMonthWith31DaysInvalid(javaMonth, day) || isMonthWith30DaysInvalid(javaMonth, day) ||
                (javaMonth == Month.FEBRUARY && day > 28)) {
            return "This date does not exist";
        }

        if (isDayPublicHoliday(javaMonth, day)) {
            return publicHoliday;
        }

        return day + DaySuffix.getSuffix(day) + " of " + getFormattedMoth(javaMonth);
    }

    private static String getFormattedMoth(Month javaMonth) {
        String monthName = javaMonth.name();
        return monthName.charAt(0) + monthName.substring(1).toLowerCase();
    }

    private static boolean isMonthWith31DaysInvalid(Month javaMonth, int day) {
        return MONTHS_WITH_31_days.contains(javaMonth) && day > 31;
    }

    private static boolean isMonthWith30DaysInvalid(Month javaMonth, int day) {
        return MONTHS_WITH_30_days.contains(javaMonth) && day > 30;
    }

    private static boolean isDayPublicHoliday(Month month, int day) {
        return PUBLIC_HOLIDAYS.stream().anyMatch(h -> h.equals(MonthDay.of(Month.valueOf(month.name()), day)));
    }
}
