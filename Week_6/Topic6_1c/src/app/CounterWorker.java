package app;

public class CounterWorker {
    public static void main(String[] args) {
        CounterThread[] threads = new CounterThread[1000];

        for (int i = 0; i < 1000; i++) {
            threads[i] = new CounterThread();
            threads[i].start();
        }

        for (CounterThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Counter Value: " + Counter.getCount());
    }
}
