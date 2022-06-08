package OoplabCoral;

public class Recursion2 {
    public static void main(String[] args) {
        String s = "Moshe";
//        StringBuilder s1 = new StringBuilder();
//        s1.append(s1);
//        s1.reverse();
//        System.out.println(s1);
        System.out.println(reverseString(s));
    }

    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
