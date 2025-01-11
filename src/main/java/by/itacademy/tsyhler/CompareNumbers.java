package by.itacademy.tsyhler;

import java.util.Arrays;
//Дано
//Три целых числа.
//        Написать код, который будет выводить в консоль сообщение:
//        - “excellent” если все три числа больше 0,
//        - “good” если два числа больше 0,
//        - “fine” если одно число больше 0,
//        - “bad” если нет ни одного числа больше 0.
//Оформить решение в виде метода в классе (названия на ваше усмотрение)
//Написать тесты на проверки метода.
//Не забываем комитить АТОМАРНЫЕ шаги.
//Соощаем о вашем решении здесь (Replay in thread) ссылкой на ваш PR.

public class CompareNumbers {
    public static String compareWithZero(int a, int b, int c) {
        int[] numbers = {a, b, c};
        if (Arrays.stream(numbers).filter(s -> s > 0).count() == 3) return "excellent";
        if (Arrays.stream(numbers).filter(s -> s > 0).count() == 2) return "good";
        if (Arrays.stream(numbers).filter(s -> s > 0).count() == 1) return "fine";
        return "bad";
    }

    public static void main(String[] args) {
        System.out.println(compareWithZero(-1, -1, -1));
    }
}
