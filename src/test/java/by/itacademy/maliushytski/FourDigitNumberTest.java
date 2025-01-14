import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FourDigitNumberTest {
    @Test
    @Description("Test sum of halves of four digits number")
    public void checkSumHalvesFourDigits() {
        Assertions.assertEquals(68, FourDigitNumber.findSumHalvesFourDigits(2345));
    }

    @Test
    @Description("Test sum of halves of four negative digits number")
    public void checkSumHalvesFourNegativeDigits() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FourDigitNumber.findSumHalvesFourDigits(-5698));
    }

    @Test
    @Description("Test sum of halves of three digits number")
    public void checkSumHalvesThreeNegativeDigits() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FourDigitNumber.findSumHalvesFourDigits(598));
    }

    @Test
    @Description("Test sum of halves of five digits number")
    public void checkSumHalvesFiveNegativeDigits() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FourDigitNumber.findSumHalvesFourDigits(59478));
    }

    @Test
    @Description("Test sum of halves of four zeros")
    public void checkSumHalvesFourZeros() {
        Assertions.assertEquals(0, FourDigitNumber.findSumHalvesFourDigits(0000));
    }
}
