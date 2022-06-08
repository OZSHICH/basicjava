package BasicJava.C9;

import java.util.*;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter 3 numbers");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        System.out.println("avg: " + (a + b + c) / 3);
        scanner.close();
    }
}
