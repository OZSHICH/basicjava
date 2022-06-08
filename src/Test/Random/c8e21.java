package Test.Random;

public class c8e21 {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;

        int index = 4;
        while (index > 2) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            index--;

        }
        System.out.println(a2);
    }
}
