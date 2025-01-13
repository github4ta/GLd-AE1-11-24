package by.itacademy.belaya.dates;

public class Dates {

    public static String getClassificationForDates(int month, int dayOfMonth) {
        if (month < 1 || month > 12 || dayOfMonth < 1 || dayOfMonth > Month.getDaysInMonth(month)) {
            return "такой даты не существует";
        } else if (Holiday.isHoliday(month, dayOfMonth)) {
            return "Праздничный день";
        }
        return dayOfMonth + " " + Month.getMonthNameInDate(month);
    }
}
