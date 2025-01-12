import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastNumberTest {
    @Test
    public void testLastNumber(){
        Assertions.assertEquals(3,LastNumber.getNumber(15883));
    }

    @Test
    public void testLastNumber1(){
        Assertions.assertEquals(-3,LastNumber.getNumber(-15883));
    }
}
