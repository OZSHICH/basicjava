package OopLabPink;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        //TODO find number index in arr from scanner
        int[] arr = {1, 54, 7, 2, 87, 3, 4, 2, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert a number");
        int number = scanner.nextInt();
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("number " + number + "not found");
        }
        System.out.println(number + " is in index " + idx);

        scanner.close();

    }


}

