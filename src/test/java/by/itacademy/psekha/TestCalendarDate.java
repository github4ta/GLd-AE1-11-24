import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalendarDate {
    @Test
    @DisplayName("there is no such date")
    public void testDate(){
        Assertions.assertEquals("there is no such date",CalendarData.getData(0,5));
    }

    @Test
    @DisplayName("there is no such date")
    public void testDate1(){
        Assertions.assertEquals("there is no such date",CalendarData.getData(2,30));
    }

    @Test
    @DisplayName("15 September")
    public void testDate2(){
        Assertions.assertEquals("SEPTEMBER 15",CalendarData.getData(9,15));
    }

    @Test
    @DisplayName("holiday day")
    public void testDate3(){
        Assertions.assertEquals("holiday day",CalendarData.getData(3,8));
    }

    @Test
    @DisplayName("28 November")
    public void testDate4(){
        Assertions.assertEquals("NOVEMBER 28",CalendarData.getData(11,28));
    }

    @Test
    @DisplayName("23 December")
    public void testDate5(){
        Assertions.assertEquals("DECEMBER 23",CalendarData.getData(12,23));
    }

    @Test
    @DisplayName("holiday day")
    public void testDate6(){
        Assertions.assertEquals("holiday day",CalendarData.getData(1,1));
    }
}
