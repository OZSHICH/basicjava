package BasicJava.C9;

import java.util.*;

public class E4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
            scanner.close();
        }
    }
}
