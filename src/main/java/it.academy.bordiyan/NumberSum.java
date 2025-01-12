package it.academy.bordiyan;

public class NumberSumParts {
    public static int numberSum() {
        int number = 2314;
        String numStr = String.valueOf(number);

        int ab = Integer.parseInt(numStr.substring(0, 2));
        int cd = Integer.parseInt(numStr.substring(2));

        return ab + cd;
    }
}

public static void main(String[] args) {
    NumberSumParts numberSumParts = new NumberSumParts();
    System.out.println(numberSum.sumOfParts(2314)); // Выводит 37
    System.out.println(numberSum.sumOfParts(1234)); // Выводит 37
}
}


