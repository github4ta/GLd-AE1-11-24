public class Calendar {
    public static final int JANUARY = 1;//31
    public static final int FEBRUARY = 2;//28
    public static final int MARCH = 3;//31
    public static final int APRIL = 4;//30
    public static final int MAY = 5;//31
    public static final int JUNE = 6;//30
    public static final int JULY = 7;//31
    public static final int AUGUST = 8;//31
    public static final int SEPTEMBER = 9;//30
    public static final int OCTOBER = 10;//31
    public static final int NOVEMBER = 11;//30
    public static final int DECEMBER = 12;//31

    public static String getDayAndMonths(int day, int month) {
        if (day <= 0 || month <= 0) {
            throw new IllegalArgumentException("Incorrect value");
        }

        if (month > 12 || month < 1) {
            return "This date does not exist";
        }

        if ((month == JANUARY || month == MARCH || month == MAY || month == JULY || month == AUGUST || month == OCTOBER || month == DECEMBER) && day > 31) {
            return "This date does not exist";
        }

        if ((month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) && day > 30) {
            return "This date does not exist";
        }

        if (month == FEBRUARY && day > 28) {
            return "This date does not exist";
        }

        if (month == JANUARY && (day == 1 || day == 2 || day == 7)) {
            return "Public holiday";
        }
        if (month == MARCH && day == 8) {
            return "Public holiday";
        }
        if (month == MAY && (day == 1 || day == 9 || day == 14)) {
            return "Public holiday";
        }
        if (month == JULY && day == 3) {
            return "Public holiday";
        }
        if (month == NOVEMBER && day == 7) {
            return "Public holiday";
        }
        if (month == DECEMBER && day == 25) {
            return "Public holiday";
        }
        return day + getDayPostfix(day) + " of " + getMonthName(month);
    }

    private static String getMonthName(int month) {
        return switch (month) {
            case JANUARY -> "January";
            case FEBRUARY -> "February";
            case MARCH -> "March";
            case APRIL -> "April";
            case MAY -> "May";
            case JUNE -> "June";
            case JULY -> "July";
            case AUGUST -> "August";
            case SEPTEMBER -> "September";
            case OCTOBER -> "October";
            case NOVEMBER -> "November";
            case DECEMBER -> "December";
            default -> "Unknown";
        };
    }

    private static String getDayPostfix(int day) {
        String result = "";
        if (day == 1) {
            result = "st";
        } else if (day == 2) {
            result = "nd";
        } else if (day == 3) {
            result = "rd";
        } else {
            result = "th";
        }
        return result;
    }
}
