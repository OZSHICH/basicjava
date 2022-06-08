package BasicJava.C9;

import java.util.*;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a name");
        char m = scanner.next().charAt(0);

        if (m == 'M') {
            System.out.println("starts with M");
        } else {
            System.out.println("not starts with M");

            scanner.close();
        }
    }
}

