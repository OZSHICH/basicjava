package OopLabPink;

public class Test2 {
    public static void main(String[] args) {
        //TODO minimum and maximum of arr
        int[] arr = {1, 54, 7, 2, 87, 3, 4, 2, 3,};

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("the max number is: " + max);
        System.out.println("the min number is: " + min);

    }
}

