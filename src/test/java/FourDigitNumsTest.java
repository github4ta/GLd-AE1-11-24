import by.itacademy.kurepin.FourDigitNums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FourDigitNumsTest {
    @Test
    public void summTest1(){
        Assertions.assertEquals(46, FourDigitNums.summOfHalfs(1234));
    }
    @Test
    public void summTest2(){
        Assertions.assertEquals(121, FourDigitNums.summOfHalfs(5566));
    }
    @Test
    public void summTest3(){
        Assertions.assertEquals(98, FourDigitNums.summOfHalfs(1484));
    }
    @Test
    public void summTest4(){
        Assertions.assertEquals(198, FourDigitNums.summOfHalfs(9999));
    } @Test
    public void summTest5(){
        Assertions.assertEquals(86, FourDigitNums.summOfHalfs(3254));
    }
    public void summTest6(){
        Assertions.assertEquals(0, FourDigitNums.summOfHalfs(32544));
    }


}
