package last.digit.test.last;

import by.itacademy.AlexLinnik.output.the.last.digit.output.the.last.digit.of.a.Number1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testdigit {
    @Test
    @DisplayName("We output the last digit of the number")
    public void testLastDigit1() {
        Assertions.assertEquals(9, Number1.number(1589));
    }

    @Test
    @DisplayName("Checking for a negative number.")
    public void testLastDigit2() {
        Assertions.assertEquals(-8, Number1.number(-65378));
    }
}
