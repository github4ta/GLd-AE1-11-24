package by.itacademy.belaya.dates;

//учтено требование не учитывать високосные года
public enum Month {
    JANUARY(1, 31, "января"),
    FEBRUARY(2, 28, "февраля"),
    MARCH(3, 31, "марта"),
    APRIL(4, 30, "апреля"),
    MAY(5, 31, "мая"),
    JUNE(6, 30, "июня"),
    JULY(7, 31, "июля"),
    AUGUST(8, 31, "августа"),
    SEPTEMBER(9, 30, "сентября"),
    OCTOBER(10, 31, "октября"),
    NOVEMBER(11, 30, "ноября"),
    DECEMBER(12, 31, "декабря");

    private final int number;
    private final int daysInMonth;
    private final String monthNameInDate;

    Month(int number, int daysInMonth, String monthNameInDate) {
        this.number = number;
        this.daysInMonth = daysInMonth;
        this.monthNameInDate = monthNameInDate;
    }
}

