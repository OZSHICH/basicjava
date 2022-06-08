package OoplabRed.OopLabRedArraysAndStaticFunctions;

public class pointutils {

    public static void movepoints(point[] points, int dx, int dy) {
        for (int i = 0; i < points.length; i++) {
            points[i].move(dx, dy);

        }
    }

    public static void print(point[] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i]);

        }
        System.out.println("-----------------");
    }

    public static point merge(point[] points) {

//       int x= 0;
//       int y= 0;
//        for (int i = 0; i <points[i]; i++) {
//


        point result = new point(0, 0);
        for (int i = 0; i < points.length; i++) {
            result.move(points[i].getX(), points[i].getY());

        }

        return result;
    }
}
