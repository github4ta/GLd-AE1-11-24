package by.itacademy.belaya.dates;

import java.util.HashSet;
import java.util.Set;

public class Holiday {

    private static final Set<String> HOLIDAYS = new HashSet<>();

    static {
        HOLIDAYS.add("1-1");
        HOLIDAYS.add("1-2");
        HOLIDAYS.add("1-7");
        HOLIDAYS.add("3-8");
        HOLIDAYS.add("5-1");
        HOLIDAYS.add("5-9");
        HOLIDAYS.add("5-14");
        HOLIDAYS.add("7-3");
        HOLIDAYS.add("11-7");
        HOLIDAYS.add("12-25");
    }

    public static boolean isHoliday(int month, int day) {
        return HOLIDAYS.contains(month + "-" + day);
    }
}
