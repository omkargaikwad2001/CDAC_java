package util;

public class Consumer implements Runnable {
    public Thread t;
    private Stocks s;
    private volatile boolean bRun;

    public Consumer(Stocks s) {
        t = new Thread(this, "Consumer");
        this.s = s;
        bRun = true;
    }

    @Override
    public void run() {
        while (bRun) {
            s.Consume();
            try {
                Thread.sleep(150); // simulate time to consume
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void stopNow() {
        bRun = false;
        synchronized (s) {
            s.notifyAll(); // wake up if consumer is waiting
        }
    }
}
