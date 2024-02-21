package app;

import java.util.Random;

public class CounterThread extends Thread {
    @Override
    public void run() {
        Random rand = new Random();
        int sleepTime = rand.nextInt(1000) + 1; // Random sleep time between 1 and 1000 milliseconds

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //ounter.increment();
    }
}