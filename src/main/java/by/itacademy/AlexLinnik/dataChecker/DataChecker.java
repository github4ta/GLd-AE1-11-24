package by.itacademy.AlexLinnik.dataChecker;

public class DataChecker {
    public static String date(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return "такой даты не существует";
        } else {
            // Проверка на количество дней в месяце
            boolean isValidDate = true;
            if (month == 2 && day > 28) {
                isValidDate = false;
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                isValidDate = false;
            }
            if (!isValidDate) {
                return "такой даты не существует";
            } else {
                return printHolidayDay(month, day);
            }
        }
    }

    public static String printHolidayDay(int month, int day) {
        switch (month) {
            case 1:
                if (day == 1 || day == 2 || day == 7) {
                    return "Праздничный день";
                }
            case 3:
                if (day == 8) {
                    return "Праздничный день";
                }
            case 5:
                if (day == 1 || day == 9 || day == 14) {
                    return "Праздничный день";
                }
            case 7:
                if (day == 3) {
                    return "Праздничный день";
                }
            case 11:
                if (day == 7) {
                    return "Праздничный день";
                }
            case 12:
                if (day == 25 | day == 31) {
                    return "Праздничный день";
                }
            default:
                return day + " " + getMonthName(month);
        }
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "январь";
            case 2 -> "февраль";
            case 3 -> "март";
            case 4 -> "апрель";
            case 5 -> "май";
            case 6 -> "июнь";
            case 7 -> "июль";
            case 8 -> "август";
            case 9 -> "сентябрь";
            case 10 -> "октябрь";
            case 11 -> "ноябрь";
            case 12 -> "декабрь";
            default -> "";
        };
    }
}


