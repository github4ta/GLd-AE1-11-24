package it.academy.bordiyan;

public class NumberSum {
    public static int numberSumParts(int number) {

        String numStr = String.valueOf(number);
        int ab = Integer.parseInt(numStr.substring(0, 2));
        int cd = Integer.parseInt(numStr.substring(2));
        return ab + cd;
    }
}

// Для проверки, чисто для себя.
class Main {
    public static void main(String[] args) {
        NumberSum numberSum = new NumberSum();
        System.out.println(NumberSum.numberSumParts(2314));
        System.out.println(NumberSum.numberSumParts(1423));
    }
}


