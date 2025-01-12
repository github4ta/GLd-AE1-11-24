import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalendarTest {
    @Test
    @Description("Check valid 1st date")
    public void testFirstDate() {
        Assertions.assertEquals("1st of April", Calendar.getDayAndMonths(1, 4));
    }

    @Test
    @Description("Check valid 2nd date")
    public void testSecondDate() {
        Assertions.assertEquals("2nd of April", Calendar.getDayAndMonths(2, 4));
    }

    @Test
    @Description("Check valid 3rd date")
    public void testThirdDate() {
        Assertions.assertEquals("3rd of April", Calendar.getDayAndMonths(3, 4));
    }

    @Test
    @Description("Check valid 4th date")
    public void testForthDate() {
        Assertions.assertEquals("4th of April", Calendar.getDayAndMonths(4, 4));
    }

    @Test
    @Description("Check 1st of January")
    public void testFirstOfJanuary() {
        Assertions.assertEquals("Public holiday", Calendar.getDayAndMonths(1, 1));
    }

    @Test
    @Description("Check 2nd of January")
    public void testSecondOfJanuary() {
        Assertions.assertEquals("Public holiday", Calendar.getDayAndMonths(2, 1));
    }

    @Test
    @Description("Check 7th of January")
    public void testSeventhOfJanuary() {
        Assertions.assertEquals("Public holiday", Calendar.getDayAndMonths(7, 1));
    }

    @Test
    @Description("Check 8th of March")
    public void testEighthsOfMarch() {
        Assertions.assertEquals("Public holiday", Calendar.getDayAndMonths(8, 3));
    }

    @Test
    @Description("Check 1st of May")
    public void testFirstOfMay() {
        Assertions.assertEquals("Public holiday", Calendar.getDayAndMonths(1, 5));
    }

    @Test
    @Description("Check 9th of May")
    public void testNinthOfMay() {
        Assertions.assertEquals("Public holiday", Calendar.getDayAndMonths(9, 5));
    }

    @Test
    @Description("Check non-existing date")
    public void testNonExistingDate() {
        Assertions.assertEquals("This date does not exist", Calendar.getDayAndMonths(29, 2));
    }

    @Test
    @Description("Check non-existing date")
    public void testNonExistingDateInParticularMonth() {
        Assertions.assertEquals("This date does not exist", Calendar.getDayAndMonths(31, 4));
    }

    @Test
    @Description("Check invalid values")
    public void testInvalidValues() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calendar.getDayAndMonths(-1, 0));
    }
}
