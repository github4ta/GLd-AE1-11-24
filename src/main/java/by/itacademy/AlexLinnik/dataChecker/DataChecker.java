package by.itacademy.AlexLinnik.dataChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DataChecker {
    public static final String INVALID_DATE_MSG = "такой даты не существует";
    public static final String ЭТО_ПРАЗДНИЧНЫЙ_ДЕНЬ = "Это праздничный день";
    static Map<Integer, Set<Integer>> hollyDays = new HashMap<>();
    static Map<Integer, String> months = new HashMap<>();

    static {
        hollyDays.put(1, Set.of(1, 7, 2));
        hollyDays.put(3, Set.of(8));
        hollyDays.put(5, Set.of(1, 9, 14));
        hollyDays.put(7, Set.of(3));
        hollyDays.put(11, Set.of(7));
        hollyDays.put(12, Set.of(25, 31));
        months.put(1, "Январь");
        months.put(2, "Февраль");
        months.put(3, "Март");
        months.put(4, "Апрель");
        months.put(5, "Май");
        months.put(6, "Июнь");
        months.put(7, "Июль");
        months.put(8, "Август");
        months.put(9, "Сентябрь");
        months.put(10, "Октябрь");
        months.put(11, "Ноябрь");
        months.put(12, "Декабрь");
    }

    public static String checkDate(final int month, final int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return INVALID_DATE_MSG;
        } else {
            boolean isValidDate = true;
            if (month == 2 && day > 28) {
                isValidDate = false;
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                isValidDate = false;
            }
            if (!isValidDate) {
                return INVALID_DATE_MSG;
            } else {
                return printHolidayDay(month, day);
            }
        }
    }


    public static String printHolidayDay(int month, int day) {
        Set<Integer> days = hollyDays.get(month);
        if (days != null && days.contains(day)) {
            return ЭТО_ПРАЗДНИЧНЫЙ_ДЕНЬ;
        } else {
            return "Обычный день";
        }
    }

    public static String getMonthName(int monthNumber) {
        return months.get(monthNumber);
    }
}


