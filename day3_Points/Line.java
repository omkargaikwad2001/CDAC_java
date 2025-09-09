class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String display() {
        return "Line: " + p1.display() + " " + p2.display();
    }
}