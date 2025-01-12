package by.itacademy.kurepin;

public class DefineNumber {
    public static String defineNumbersAboveZero(int a, int b, int c) {
        int[] nums = new int[]{a, b, c};
        int counter = 0;
        for (int num : nums) {
            if (num>0){
                counter++;
            }
        }
        String result= "bad";
        switch (counter){
            case 0:
                result="bad";
                break;
            case 1:
                result="fine";
                break;
            case 2:
                result="good";
                break;
            case 3:
                result="excellent";
                break;
        }
        return result;
    }




}
