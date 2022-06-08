package Test.Random;

public class C6E5 {
    public static void main(String[] args) {
        String name = "max";
        int sal = 100000;
        double tax = 0;
        if (sal <= 23000) {
            tax = sal * 0.1;
        } else if (sal <= 46000) {
            tax = 23000 * 0.1 + (sal - 23000) * 0.2;
        } else if (sal <= 120000) {
            tax = 23000 * 0.1 + 23000 * 0.2 + (sal - 46000) * 0.3;
        } else if (sal <= 220000) {
            tax = 23000 * 0.1 + 23000 * 0.2 + 74000 * 0.3 + (sal - 12000) * 0.4;
        } else {
            tax = 23000 * 0.1 + 23000 * 0.2 + 74000 * 0.3 + 100000 * 0.4 + (sal - 220000) * 0.5;
        }
        System.out.println(name + " " + sal);
        System.out.println("tax :" + tax);
        System.out.println("net : " + (sal - tax));
    }
}
