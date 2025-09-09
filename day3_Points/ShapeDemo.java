public class ShapeDemo {
    public static void main(String[] args) {

        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        Point c = new Point(5, 6);
        Point d = new Point(7, 8);

        Line line = new Line(a, b);
        Triangle triangle = new Triangle(a, b, c);
        Rectangle rectangle = new Rectangle(a, b, c, d);

        System.out.println(line.display());
        System.out.println(triangle.display());
        System.out.println(rectangle.display());
    }
}