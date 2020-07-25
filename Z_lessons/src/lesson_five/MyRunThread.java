package lesson_five;

public class MyRunThread implements Runnable {
    @Override
    public void run() {
        System.out.println("hello from runnable thread");
    }
}
