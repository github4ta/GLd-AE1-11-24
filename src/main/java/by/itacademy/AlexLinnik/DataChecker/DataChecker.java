package by.itacademy.AlexLinnik.DataChecker;

public class DataChecker {
    public static String date(int a, int b) {
        int month = 0;
        int day = 0;
// Проверка на существование даты
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

            // Если дата не корректна, выводим сообщение
            if (!isValidDate) {
                return "такой даты не существует";
            } else {
                printHolidayDay(month, day);
            }
        }
        return "";
    }

    public static String printHolidayDay(int month, int day) {
        switch (month) {
            case 1:
                if (day == 1 || day == 2 || day == 7) ;
                return "Праздничный день";
            case 3:
                if (day == 8)
                    return "Праздничный день";
            case 5:
                if (day == 1 || day == 9 || day == 14)
                    return "Праздничный день";
            case 7:
                if (day == 3)
                    return "Праздничный день";
            case 11:
                if (day == 7)
                    return "Праздничный день";
            case 12:
                if (day == 25 | day == 31)
                    return "Праздничный день";
            default:
                return day + " " + getMonthName(month);
        }
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "январь";
            case 2:
                return "февраль";
            case 3:
                return "март";
            case 4:
                return "апрель";
            case 5:
                return "май";
            case 6:
                return "июнь";
            case 7:
                return "июль";
            case 8:
                return "август";
            case 9:
                return "сентябрь";
            case 10:
                return "октябрь";
            case 11:
                return "ноябрь";
            case 12:
                return "декабрь";
            default:
                return "";
        }
    }
}


