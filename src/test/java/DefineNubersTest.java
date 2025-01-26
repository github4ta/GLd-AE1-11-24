import by.itacademy.kurepin.DefineNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DefineNubersTest {
    @Test
    public void testDefNum1() {
        Assertions.assertEquals("good", DefineNumber.defineNumbersAboveZero(-1, 3, 5));
    }

    @Test
    public void testDefNum2() {
        Assertions.assertEquals("bad", DefineNumber.defineNumbersAboveZero(-1, -3, -5));
    }

    @Test
    public void testDefNum3() {
        Assertions.assertEquals("good", DefineNumber.defineNumbersAboveZero(-13332, 23445511, 532323));
    }

    @Test
    public void testDefNum4() {
        Assertions.assertEquals("fine", DefineNumber.defineNumbersAboveZero(-1, -3, 5));
    }

    @Test
    public void defNum5() {
        Assertions.assertEquals("excellent", DefineNumber.defineNumbersAboveZero(31231231, 8484783, 55465));
    }

    @Test
    public void testDefNum6() {
        Assertions.assertEquals("bad", DefineNumber.defineNumbersAboveZero(-2323, -4443, -2225));
    }

    @Test
    public void testDefNum7() {
        Assertions.assertEquals("excellent", DefineNumber.defineNumbersAboveZero(33, 13, 35));
    }
}
