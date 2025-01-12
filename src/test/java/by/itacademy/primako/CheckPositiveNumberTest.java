package by.itacademy.primako;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckPositiveNumberTest {
    @Test
    public void testExcellentPositive(){
        Assertions.assertEquals("excellent",CheckPositiveNumber.checkNumber(99,35,875));
    }
    @Test
    public void testGoodPositive(){
        Assertions.assertEquals("good",CheckPositiveNumber.checkNumber(-85,35,875));
    }
    @Test
    public void testGoodPositiveZero(){
        Assertions.assertEquals("good",CheckPositiveNumber.checkNumber(0,35,875));
    }
    @Test
    public void testFinePositive(){
        Assertions.assertEquals("fine",CheckPositiveNumber.checkNumber(-85,-35,875));
    }
    @Test
    public void testFinePositiveZero1(){
        Assertions.assertEquals("fine",CheckPositiveNumber.checkNumber(0,-35,875));
    }
    @Test
    public void testFinePositiveZero2(){
        Assertions.assertEquals("fine",CheckPositiveNumber.checkNumber(0,0,875));
    }
    @Test
    public void testBadPositive(){
        Assertions.assertEquals("bad",CheckPositiveNumber.checkNumber(-85,-35,-875));
    }
    @Test
    public void testBadPositiveZero1(){
        Assertions.assertEquals("bad",CheckPositiveNumber.checkNumber(0,-35,-875));
    }
    @Test
    public void testBadPositiveZero2(){
        Assertions.assertEquals("bad",CheckPositiveNumber.checkNumber(0,0,-875));
    }
    @Test
    public void testBadPositiveZero3(){
        Assertions.assertEquals("bad",CheckPositiveNumber.checkNumber(0,0,0));
    }
}
