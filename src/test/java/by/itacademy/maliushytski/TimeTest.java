import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    @Description("Check full time set(hours,minutes,seconds)")
    public void testFullTimeSet() {
        Assertions.assertEquals("180 часов 15 минут 58 секунд", Time.setTimeFormatFromSeconds(648958));
    }

    @Test
    @Description("Check part time set(minutes,seconds)")
    public void testMinutesSecondsTimeSet() {
        Assertions.assertEquals("20 минут 49 секунд", Time.setTimeFormatFromSeconds(1249));
    }

    @Test
    @Description("Check part time set(seconds)")
    public void testSecondsTimeSet() {
        Assertions.assertEquals("59 секунд", Time.setTimeFormatFromSeconds(59));
    }

    @Test
    @Description("Check time with lack of seconds")
    public void testLackSeconds() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Time.setTimeFormatFromSeconds(0));
    }

    @Test
    @Description("Check time with lack of seconds")
    public void testTimeNegativeAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Time.setTimeFormatFromSeconds(-60));
    }
}
