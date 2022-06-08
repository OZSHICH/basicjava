package Test.Random;

public class c8e2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        //will fix a&b if needed

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
}
