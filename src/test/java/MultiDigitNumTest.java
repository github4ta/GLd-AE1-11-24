import by.itacademy.kurepin.MultiDigitNum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiDigitNumTest {
    @Test
    public void valueTest1(){
        Assertions.assertEquals("3 - последняя цифра числа 77633", MultiDigitNum.lastValueOfNumber(77633));
    }
    @Test
    public void valueTest2(){
        Assertions.assertEquals("2 - последняя цифра числа 12", MultiDigitNum.lastValueOfNumber(12));
    }
    @Test
    public void valueTest3(){
        Assertions.assertEquals("0 - последняя цифра числа 10", MultiDigitNum.lastValueOfNumber(10));
    }
    @Test
    public void valueTest4(){
        Assertions.assertEquals("4 - последняя цифра числа 1024", MultiDigitNum.lastValueOfNumber(1024));
    }
    @Test
    public void valueTest5(){
        Assertions.assertEquals("Не является многозначным", MultiDigitNum.lastValueOfNumber(1));
    }

}
