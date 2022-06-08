package OoplabRed.OopLabRedArraysAndStaticFunctions;

public class Test {
    public static void main(String[] args) {
        point p1 = new point(2, 3);
        point p2 = new point(3, 4);
        point p3 = new point(4, 5);
        point[] points = {p1, p2, p3};

//        pointutils.print(points);
//        pointutils.movepoints(points,2,3);
//        pointutils.print(points);

        System.out.println(pointutils.merge(points));

    }

}
