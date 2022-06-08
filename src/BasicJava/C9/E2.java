package BasicJava.C9;

import java.util.*;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("sum: " + (a + b + c));

        scanner.close();
    }
}
