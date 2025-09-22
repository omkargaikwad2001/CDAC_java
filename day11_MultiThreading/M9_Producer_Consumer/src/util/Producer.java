package util;

public class Producer implements Runnable {
    public Thread t;
    private Stocks s;
    private volatile boolean bRun;

    public Producer(Stocks s) {
        t = new Thread(this, "Producer");
        this.s = s;
        bRun = true;
    }

    @Override
    public void run() {
        while (bRun) {
            s.Produce();
            try {
                Thread.sleep(100); // simulate time to produce
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void StopNow() {
        bRun = false;
        synchronized (s) {
            s.notifyAll(); // wake up if producer is waiting
        }
    }
}
