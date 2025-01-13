import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartsOfNumberTest {

    @Test
    public void testPart() {
        Assertions.assertEquals(37, PartsOfNumber.addParts(2314));
    }

    @Test
    public void testPart1() {
        Assertions.assertEquals(111, PartsOfNumber.addParts(2784));
    }
}
