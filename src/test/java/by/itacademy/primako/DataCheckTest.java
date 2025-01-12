package by.itacademy.primako;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataCheckTest {
    @Test
    public void testCorrectDate1(){
        Assertions.assertEquals("1 марта",DataCheck.checkDate(1,3));
    }
    @Test
    public void testCorrectDate31(){
        Assertions.assertEquals("31 марта",DataCheck.checkDate(31,3));
    }
    @Test
    public void testCorrectDate28(){
        Assertions.assertEquals("28 февраля",DataCheck.checkDate(28,2));
    }
    @Test
    public void testCorrectDate30(){
        Assertions.assertEquals("30 ноября",DataCheck.checkDate(30,11));
    }
    @Test
    public void testHolidayDate1jan(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(1,1));
    }
    @Test
    public void testHolidayDate2jan(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(2,1));
    }
    @Test
    public void testHolidayDate7jan(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(7,1));
    }
    @Test
    public void testHolidayDate8mar(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(8,3));
    }
    @Test
    public void testHolidayDate1jmay(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(1,5));
    }
    @Test
    public void testHolidayDate9jmay(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(9,5));
    }
    @Test
    public void testHolidayDate14jmay(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(14,5));
    }
    @Test
    public void testHolidayDate13jul(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(3,7));
    }
    @Test
    public void testHolidayDate7nov(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(7,11));
    }
    @Test
    public void testHolidayDate25dec(){
        Assertions.assertEquals("Праздничный день",DataCheck.checkDate(25,12));
    }
    @Test
    public void testInvalidDay(){
        Assertions.assertEquals("Такой даты не существует",DataCheck.checkDate(156,5));
    }
    @Test
    public void testInvalidMonth(){
        Assertions.assertEquals("Такой даты не существует",DataCheck.checkDate(15,585));
    }
    @Test
    public void testInvalidDate(){
        Assertions.assertEquals("Такой даты не существует",DataCheck.checkDate(156,5532));
    }
    @Test
    public void testInvalidDateZero1(){
        Assertions.assertEquals("Такой даты не существует",DataCheck.checkDate(0,5));
    }
    @Test
    public void testInvalidDateZero2(){
        Assertions.assertEquals("Такой даты не существует",DataCheck.checkDate(0,0));
    }
}
