package by.itacademy.belaya.digitsum;

public class DigitSum {

    private static boolean isFourDigitNumber(int number){
        return (number>=1000&&number<=9999)||(number<=-1000&&number>=-9999);
    }
}
