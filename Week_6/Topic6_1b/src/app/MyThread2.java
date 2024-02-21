package app;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("MyThread2: Iteration " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds (0.5 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}