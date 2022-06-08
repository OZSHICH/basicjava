package OopLabPink;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //TODO move arr1 to end of arr2
        int[] arr1 = {1, 2, 3, 17, 21, 5};
        int[] arr2 = {6, 76, 42};

        int r1 = arr1.length;
        int r2 = arr2.length;

        int[] result = new int[r2 + r1];

        System.arraycopy(arr1, 0, result, r2, r1);
        System.arraycopy(arr2, 0, result, 0, r2);


        System.out.println(Arrays.toString(result));


    }
}
