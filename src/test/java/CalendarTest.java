import by.itacademy.kurepin.Calendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalendarTest {
    @Test
    public void calendarTest1(){
        Assertions.assertEquals("Праздничный день", Calendar.checkDate(1,1));
    }
    @Test
    public void calendarTest2(){
        Assertions.assertEquals("Праздничный день", Calendar.checkDate(1,2));
    }
    @Test
    public void calendarTest3(){
        Assertions.assertEquals("Праздничный день", Calendar.checkDate(1,7));
    }
    @Test
    public void calendarTest4(){
        Assertions.assertEquals("Праздничный день", Calendar.checkDate(3,8));
    }
    @Test
    public void calendarTest5(){
        Assertions.assertEquals("Праздничный день", Calendar.checkDate(7,3));
    }
    @Test
    public void calendarTest6(){
        Assertions.assertEquals("Праздничный день", Calendar.checkDate(11,7));
    }
    @Test
    public void calendarTest7(){
        Assertions.assertEquals("Праздничный день", Calendar.checkDate(12,25));
    }
    @Test
    public void calendarTest8(){
        Assertions.assertEquals("28 Февраля", Calendar.checkDate(2,28));
    }
    @Test
    public void calendarTest9(){
        Assertions.assertEquals("11 Сентября", Calendar.checkDate(9,11));
    }
    @Test
    public void calendarTest10(){
        Assertions.assertEquals("16 Декабря", Calendar.checkDate(12,16));
    }
}
