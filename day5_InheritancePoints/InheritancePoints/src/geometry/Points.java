package geometry;

public class Points {

    private int x;
    private int y;

    public Points() {
        this.x = 0;
        this.y = 0;
    }

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
