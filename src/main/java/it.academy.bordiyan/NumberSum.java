package it.academy.bordiyan;

public class NumberSum {
    public static int numberSum() {
        int number = 2314;
        String numStr = String.valueOf(number);

        int ab = Integer.parseInt(numStr.substring(0, 2));
        int cd = Integer.parseInt(numStr.substring(2));

        return ab + cd;
    }
}

class Main {
    public static void main(String[] args) {
        NumberSum numberSum = new NumberSum();
        System.out.println(NumberSum.numberSum());
    }
}


