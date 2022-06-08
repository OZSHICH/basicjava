package OoplabCoral;

import java.util.*;

public class Recursion1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("pls insert a number: ");
        int num = scanner.nextInt();
        System.out.println(fact(num));
    }

    private static int fact(int num) {
        if (num == 2) {
            return num;
        }
        return num * fact(num - 1);
    }
}