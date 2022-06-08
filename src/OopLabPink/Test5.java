package OopLabPink;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
//        int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        System.out.println("Original Array : " + Arrays.toString(arr1));
//
//        arr1[9] = arr1[8];
//        arr1[8] = arr1[7];
//        arr1[7] = arr1[6];
//        arr1[6] = arr1[5];
//        arr1[5] = arr1[4];
//        arr1[4] = arr1[3];
//        arr1[3] = arr1[2];
//        arr1[2] = 5;
//        System.out.println("New Array: " + Arrays.toString(arr1));

        System.out.println();
        int[] arr2 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int idx = 2;
        int newvalue = 5;

        System.out.println("Original Array : " + Arrays.toString(arr2));

//        int temp= arr2[5];
//        arr2[5] = arr2[6];
//        arr2[6] = temp;
//TODO move index arr left
        System.arraycopy(arr2, idx, arr2, idx + 1, arr2.length - 1 - idx);
//         אופציה שניה
//        for (int i = arr2.length - 1; i > idx; i--) {
//            arr2[i] = arr2[i - 1];
//TODO put number in arr index
        arr2[2] = 5;

//        int temp= arr2[5];
//        arr2[5] = arr2[6];
//        arr2[6] = temp;
//        arr2[idx] = newvalue;


        System.out.println("New Array:       " + Arrays.toString(arr2));


    }
}




