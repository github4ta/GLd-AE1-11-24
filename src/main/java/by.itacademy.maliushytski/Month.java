public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int number;

    Month(int number) {
        this.number = number;
    }

    public int getMonthNumber() {
        return number;
    }

    public static Month fromInt(int i) {
        for (Month month : values()) {
            if (month.getMonthNumber() == i) {
                return month;
            }
        }
        return null;
    }
}
