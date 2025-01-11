package Test.ThreeNumbers;

import by.itacademy.AlexLinnik.three.positive.Numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testThreeNumbers {
    @Test
    @DisplayName("3/3")
    public void addTest1(){
        Assertions.assertEquals("excellent", Numbers.numbers(1,2,6));
    }
    @Test
    @DisplayName("2/3")
    public void addTest2(){
        Assertions.assertEquals("good",Numbers.numbers(-4,8,9));
    }
    @Test
    @DisplayName("1/3")
    public void addTest3(){
        Assertions.assertEquals("fine",Numbers.numbers(-9,-7,3));
    }
    @Test
    @DisplayName("Все 0")
    public void addTest4(){
        Assertions.assertEquals("мы так не договаривались",Numbers.numbers(0,0,0));
    }
}
