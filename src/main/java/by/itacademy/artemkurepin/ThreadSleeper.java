package by.itacademy.artemkurepin;

public class ThreadSleeper {
    public static void threadSleepOnTime(int mills) {
        try {
            Thread.sleep(mills);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
