package it.academy.bordiyan;

public class NumberSum {
    public static int numberSum(){
        int number = 2314;
        String numStr = String.valueOf(number);

        int ab = Integer.parseInt(numStr.substring(0, 2));
        System.out.println(ab);
    }
}
