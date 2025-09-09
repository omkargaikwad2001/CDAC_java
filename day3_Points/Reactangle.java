class Rectangle {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public String display() {
        return "Rectangle: " + p1.display() + " " + p2.display() + " " + p3.display() + " " + p4.display();
    }
}