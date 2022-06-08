package Test.Random;

public class Test {
    public static void main(String[] args) {
        int sal = (int) (Math.random() * 120_001);
        System.out.println("sal : " + sal);
        double tax = 0;
        if (sal <= 23_000) {
            tax = sal * 1.1;
        } else if (sal <= 50_000) {
            tax = 23_000 * 1.1 + (sal - 23_001) * 1.2;
        } else if (sal <= 100_000) {
            tax = 23_000 * 1.1 + (50_000 - 23_001) * 1.2 + (sal - 50_001) * 1.3;
        } else {
            tax = 23_000 * 1.1 + (50_000 - 23_001) * 1.2 + (100_000 - 50_001) * 1.3 + (sal - 100_101) * 1.4;
        }
        System.out.println("tax : " + tax);
        System.out.println("net : " + (sal - tax));
    }


}
