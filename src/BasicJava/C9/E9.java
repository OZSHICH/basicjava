package BasicJava.C9;

import java.util.*;

public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("out?");
        char max = scanner.next().charAt(0);
        if (max == 'y') {
            System.out.println("bye max");
        } else if (max == 'n') {
            System.out.println("enter");
        } else System.out.println("not max");
        scanner.close();
    }
}
