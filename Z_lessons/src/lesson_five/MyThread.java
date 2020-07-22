package lesson_five;

public class MyThread extends Thread {

    MyThread(String name) {
        super(name);
        this.start();
    }

    @Override
    public void run() {
//        while (!isInterrupted()) {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                //interrupt();
                //break;
            }
            System.out.println("thread " + getName() + " stopped");
//        }
    }
}
