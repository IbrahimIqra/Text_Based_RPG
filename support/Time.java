package support;

public class Time
{
    public static void sleep(final int sec) {
        try {
            Thread.sleep(sec * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}