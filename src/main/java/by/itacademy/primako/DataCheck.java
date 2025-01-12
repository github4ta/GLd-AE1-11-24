package by.itacademy.primako;

public class DataCheck {
    public static String checkDate(int day, int month) {
        int january = 1;
        int february = 2;
        int march = 3;
        int april = 4;
        int may = 5;
        int june = 6;
        int july = 7;
        int august = 8;
        int september = 9;
        int october = 10;
        int november = 11;
        int december = 12;

        if (month < 1 | month > 12 | day < 1 | day > 31 |
                (month == april | month == june | month == august | month == september | month == november) & day > 30 | month == february & day > 28) {
            return "Такой даты не существует";
        }
        if (month == january & (day == 1 | day == 2 | day == 7) | month == march & day == 8 | month == may & (day == 1 | day == 9 | day == 14) | month == july & day == 3 | month == november & day == 7 | month == december & day == 25) {
            return "Праздничный день";
        }
        String[] monthNames = {
                "января", "февраля", "марта", "апреля", "мая", "июня",
                "июля", "августа", "сентября", "октября", "ноября", "декабря"
        };
        return (day + " " + monthNames[month - 1]);
    }
}
