package OoplabCoral;

public class Recursion3 {
    public static void main(String[] args) {
        System.out.println(mult(5, 3));
    }

    public static int mult(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a + mult(a, b - 1);
    }
}
