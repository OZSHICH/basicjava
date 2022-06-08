package BasicJava.C9;

import java.util.*;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a name");
        char m = scanner.next().charAt(0);

        if (m == 'm') {
            System.out.println("starts with m");
        } else {
            System.out.println("not starts with m");

            scanner.close();
        }
    }
}

