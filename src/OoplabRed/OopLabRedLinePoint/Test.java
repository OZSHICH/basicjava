package OoplabRed.OopLabRedLinePoint;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(l1);

        System.out.println("First line is: " + l1);
        System.out.println("Second line is: " + l2);

    }
}
