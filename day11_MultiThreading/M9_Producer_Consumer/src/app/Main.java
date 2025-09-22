package app;

import util.Consumer;
import util.Producer;
import util.Stocks;

public class Main {

    public static void main(String[] args) {

        Stocks s = new Stocks();

        Producer p = new Producer(s);
        Consumer c = new Consumer(s);

        p.t.start();
        c.t.start();

        try {
            // Let producer and consumer run for some time
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop both threads
        p.StopNow();
        c.stopNow();

        // Ensure any waiting threads are released
        synchronized (s) {
            s.notifyAll();
        }

        try {
            p.t.join();
            c.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total produced : " + s.getQtyProduced());
        System.out.println("Total consumed : " + s.getQtyConsumed());
    }
}
