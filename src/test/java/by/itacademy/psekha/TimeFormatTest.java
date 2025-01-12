import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeFormatTest {
    @Test
    public void testTime() {
        Assertions.assertEquals("20 минут 49 секунд", TimeFormat.getTime(1249));
    }

    @Test
    public void testTime1() {
        Assertions.assertEquals("180 часов 15 минут 58 секунд", TimeFormat.getTime(648958));
    }
}