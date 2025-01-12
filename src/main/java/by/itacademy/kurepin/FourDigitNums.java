package by.itacademy.kurepin;

public class FourDigitNums {
    public static int summOfHalfs(int number){
        int firstHalf=Integer.parseInt((""+number/1000)+(""+number%1000/100));
        int secondHalf=Integer.parseInt((""+number%100/10)+(""+number%10));

        return firstHalf+secondHalf;
    }



}
