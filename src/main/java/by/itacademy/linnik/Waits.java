package by.itacademy.linnik;

public class Waits {
public static void waitFor(int seconds){
    try {
        Thread.sleep(seconds*1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
