package by.itacademy.kurepin;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    public static String checkDate(int month, int day) {
        String[] monthNames = {"Января", "Февраля", "Марта", "Апреля", "Мая",
                "Июня", "Июля", "Августа", "Сентября", "Октября", "Ноября", "Декабря"};
        String result = "";

        if (month > 12 || month < 1) {
            result = "Не существующий месяц";
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day > 0 && day <= 31) {
                    switch (month) {
                        case 1: {
                            if (day == 1 || day == 2 || day == 7) {
                                result = "Праздничный день";

                            } else result = day + " " + monthNames[month - 1];
                            break;
                        }
                        case 3: {
                            if (day == 8) {
                                result = "Праздничный день";

                            } else result = day + " " + monthNames[month - 1];
                            break;
                        }
                        case 5: {
                            if (day == 1 || day == 9 || day == 14) {
                                result = "Праздничный день";

                            } else result = day + " " + monthNames[month - 1];
                            break;
                        }
                        case 7: {
                            if (day == 3) {
                                result = "Праздничный день";

                            } else result = day + " " + monthNames[month - 1];
                            break;
                        }
                        case 10: {
                            result = day + " " + monthNames[month - 1];
                            break;
                        }
                        case 12: {
                            if (day == 25) {
                                result = "Праздничный день";

                            } else result = day + " " + monthNames[month - 1];
                            break;
                        }
                    }
                } else result = "День некоректыный";
            }

            if (month == 2) {
                if (day < 29) {
                    result = day + " " + monthNames[month - 1];
                } else result = "День некоректыный";
            }

            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 0 && day <= 30) {
                    if (month == 11 && day == 7) {
                        result = "Праздничный день";
                    } else {
                        result = day + " " + monthNames[month - 1];
                    }
                } else result = "День некоректыный";
            }
        }
        return result;
    }


}




