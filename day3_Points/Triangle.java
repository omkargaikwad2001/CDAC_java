class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String display() {
        return "Triangle: " + p1.display() + " " + p2.display() + " " + p3.display();
    }
}