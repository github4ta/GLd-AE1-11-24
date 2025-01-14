public enum DaySuffix {
    FIRST(1, "st"),
    SECOND(2, "nd"),
    THIRD(3, "rd"),
    DEFAULT(4, "th");

    private final int day;
    private final String suffix;

    DaySuffix(int day, String suffix) {
        this.day = day;
        this.suffix = suffix;
    }

    public static String getSuffix(int day) {
        for (DaySuffix ds : values()) {
            if (ds.day == day) {
                return ds.suffix;
            }
        }
        return DEFAULT.suffix;
    }
}
