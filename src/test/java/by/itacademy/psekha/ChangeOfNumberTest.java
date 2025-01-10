

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangeOfNumberTest {
    @Test
    public  void test(){
        Assertions.assertEquals(0, by.itacademy.psekha.ChangeOfNumber.numbersOfChange(2,3,4));
    }
}
