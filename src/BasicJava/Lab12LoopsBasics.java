package BasicJava;

import java.util.*;

public class Lab12LoopsBasics {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        ex10();
    }

    public static void ex1() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void ex2() {
        String name = "Hello World";
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }

    public static void ex3() {
        String name = "Hello Wolrd";
        for (int i = 10; i > 0; i--) {
            System.out.println(name);
        }

    }

    public static void ex4() {
        String name = "Hello World";
        int i = 1;
        while (i <= 10) {
            System.out.println(name);
            i++;
        }


    }

    public static void ex5() {
        String name = "Hello World";
        int i = 10;
        while (i >= 0) {
            System.out.println(name);
            i--;

        }

    }

    public static void ex6() {


    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("pls insert a number");
        for (int i = 0; i < num; i += 2) {
            System.out.println(i + " ");
            System.out.println();
            scanner.close();

        }
    }

    public static void ex8() {
        int num = (int) (Math.random() * 51) + 50;
        System.out.println("the random number is: " + num
        );
        for (int i = 1; i < num; i++) {
            System.out.println(i + " ");


        }

    }

    public static void ex9() {
        int a = (int) (Math.random() * 51) + 50;
        int b = (int) (Math.random() * 51) + 50;
        System.out.println(a + " " + b);
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            System.out.println(i + " ");

        }


    }

    public static void ex10() {
        int den = (int) (Math.random() * 100) + 50;
        int max = (int) (Math.random() * 100) + 1;
        System.out.println(den + " " + max);
        if (den > max) {
            int tmp = max;
            max = den;
            den = tmp;
            for (int i = 1; i < max; i++) {
                if (i % den == 0) {
                    System.out.println(i + " ");

                }


            }
        }

    }
}
