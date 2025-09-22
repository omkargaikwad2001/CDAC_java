package util;

public class Stocks {

    private int qtyProduced;
    private int qtyConsumed;
    boolean bProduced;

    public Stocks() {}

    public synchronized void Produce() {
        while (bProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }

        setQtyProduced(getQtyProduced() + 1);
        System.out.println("Produced: " + getQtyProduced());
        bProduced = true;
        notifyAll();
    }

    public synchronized void Consume() {
        while (!bProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }

        setQtyConsumed(getQtyConsumed() + 1);
        System.out.println("Consumed: " + getQtyConsumed());
        bProduced = false;
        notifyAll();
    }

	public int getQtyProduced() {
		return qtyProduced;
	}

	public void setQtyProduced(int qtyProduced) {
		this.qtyProduced = qtyProduced;
	}

	public int getQtyConsumed() {
		return qtyConsumed;
	}

	public void setQtyConsumed(int qtyConsumed) {
		this.qtyConsumed = qtyConsumed;
	}
}
