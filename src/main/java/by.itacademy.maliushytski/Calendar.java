public class Calendar {
    public static String getDayAndMonths(int day, int month) {
        if (day <= 0 || month <= 0) {
            throw new IllegalArgumentException("Incorrect value");
        }

        Month enumMonth = Month.fromInt(month);

        if (month > 12 || month < 1) {
            return "This date does not exist";
        }

        if ((enumMonth == Month.JANUARY || enumMonth == Month.MARCH || enumMonth == Month.MAY || enumMonth == Month.JULY
                || enumMonth == Month.AUGUST || enumMonth == Month.OCTOBER || enumMonth == Month.DECEMBER) && day > 31) {
            return "This date does not exist";
        }

        if ((enumMonth == Month.APRIL || enumMonth == Month.JUNE || enumMonth == Month.SEPTEMBER ||
                enumMonth == Month.NOVEMBER) && day > 30) {
            return "This date does not exist";
        }

        if (enumMonth == Month.FEBRUARY && day > 28) {
            return "This date does not exist";
        }

        if (enumMonth == Month.JANUARY && (day == 1 || day == 2 || day == 7)) {
            return "Public holiday";
        }
        if (enumMonth == Month.MARCH && day == 8) {
            return "Public holiday";
        }
        if (enumMonth == Month.MAY && (day == 1 || day == 9 || day == 14)) {
            return "Public holiday";
        }
        if (enumMonth == Month.JULY && day == 3) {
            return "Public holiday";
        }
        if (enumMonth == Month.NOVEMBER && day == 7) {
            return "Public holiday";
        }
        if (enumMonth == Month.DECEMBER && day == 25) {
            return "Public holiday";
        }
        return day + getDayPostfix(day) + " of " + getFormattedMoth(enumMonth);
    }

    private static String getFormattedMoth(Month enumMonth) {
        String monthName = enumMonth.name();
        return monthName.charAt(0) + monthName.substring(1).toLowerCase();
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
