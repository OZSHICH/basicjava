package BasicJava.C9;

import java.util.*;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter a number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Math.max(a, Math.max(b, c)));

        scanner.close();

    }
}
