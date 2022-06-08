package OopLabPink;

public class Test1 {
    public static void main(String[] args) {
        //TODO average of arr
        int[] arr = {1, 54, 7, 2, 87, 3, 4, 2, 3};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf(("%.3f"), sum / (arr.length));
    }
}
