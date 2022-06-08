package BasicJava.C9;

import java.util.*;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter firstname");
        String firstName = scanner.next();
        System.out.println("pls enter lastname");
        String lastname = scanner.next();
        System.out.println("pls enter age");
        float age = scanner.nextFloat();
        System.out.println("pls enter city");
        String city = scanner.next();

        System.out.printf("hello, i'm %s %s, my age is %.1f and from %s ", firstName, lastname, age, city);


        scanner.close();
    }
}