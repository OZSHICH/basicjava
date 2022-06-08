package BasicJava;

import java.util.Scanner;

public class Lab9Scanner {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
        ex4();
//        ex5();
//        ex6();
//        ex7();
//        ex8();
//        ex9();
//        ex10();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter firstname");
        String firstName = scanner.next();
        System.out.println("pls enter lastname");
        String lastname = scanner.next();
        System.out.println("pls enter age");
        float age = scanner.nextFloat();
        System.out.println("pls enter city");
        String city = scanner.next();
        System.out.printf("hello, i'm %s %s, my age is %.1f and from %s ", firstName, lastname, age, city);


        scanner.close();
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert 3 numbers");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.print("the sum of a b and c is " + (a + b + c));


        scanner.close();
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert 3 numbers");

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        System.out.println("the average is " + ((a + b + c) / 3));
        scanner.close();


    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert a number");
        int a = scanner.nextInt();
        System.out.println((a % 2 == 0)?"even"  : "odd ");
//        if (a % 2 == 0) {
//            System.out.println("Even");
//        } else System.out.println("Odd");


        scanner.close();

    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert first name");
        char m = scanner.next().charAt(0);
        if (m == 'M') {
            System.out.println("starts with M");
        } else {
            System.out.println("not starting with M");
        }
        scanner.close();


    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert first name");
        char M = scanner.next().charAt(0);
        if (M == 'm') {
            System.out.println("starts with m");
        } else System.out.println("not start with m");
        scanner.close();
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.print("the biggest number is " + Math.max(a, Math.max(b, c)));
        scanner.close();


    }

    public static void ex8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("the lowest number is " + (Math.min(a, Math.min(b, c))));

        scanner.close();

    }

    public static void ex9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to go quit?, press Y or N");
        char quit = scanner.next().charAt(0);
        if (quit == 'Y') {
            System.out.println("SEE YA");
        } else if (quit == 'N') {
            System.out.println("GOOD CHOICE");
        } else System.out.println("UNSUPPORTED BYE BYE");
        scanner.close();
    }

    public static void ex10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert your age");
        float a = scanner.nextFloat();
        if (a >= 18) {
            System.out.println("above 18");
        } else System.out.println("under 18");
        scanner.close();


    }
}

















