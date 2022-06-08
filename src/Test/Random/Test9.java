package Test.Random;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("not prime");

            } else {
                System.out.println("prime");

                scanner.close();
            }
        }

    }
}

