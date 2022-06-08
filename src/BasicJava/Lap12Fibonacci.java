package BasicJava;

import java.util.Scanner;

public class Lap12Fibonacci {
    public static Scanner scanner = new Scanner(System.in);


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
        //ex10();
    }

    public static void ex1() {
        int a1 = 1;
        int a2 = 1;
        System.out.println(" The Fibonacci Series ");
        System.out.println(a1);
        System.out.println(a2);
        for (int i = 2; i < 30; i++) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            System.out.println(a2);
        }

    }

    public static void ex2() {
        int a1 = 1;
        int a2 = 1;
        System.out.println("pls insert a number:");
        int idx = scanner.nextInt();
        for (int i = 2; i < idx; i++) {
            a2 = a1 + a2;
            a1 = a2 - a1;
        }
        System.out.println("your index number is :" + a2);

    }

    public static void ex3() {
        int a1 = 1;
        int a2 = 1;
        int idx = (int) (Math.random() * 30) + 10;
        System.out.println("take the series until the random number");
        System.out.println("the random number is: " + idx);
        for (int i = 2; i < idx; i++) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            System.out.println(a2);
        }
    }

    public static void ex4() {
        int a1 = 1;
        int a2 = 1;
        int idx = (int) (Math.random() * 30) + 10;
        System.out.println("the random number is: " + idx);
        System.out.println("all the even numbers in the series are");
        for (int i = 2; i < idx; i++) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            if (a2 % 2 == 0) {
                System.out.println(a2);
            }
        }
    }

    public static void ex5() {
        int a1 = 1;
        int a2 = 1;
        int idx = (int) (Math.random() * 30) + 10;
        System.out.println("the random number is: " + idx);
        System.out.println("all the odd numbers in the series are");
        for (int i = 2; i < idx; i++) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            if (a2 % 2 == 1) {
                System.out.println(a2);
            }
        }
    }

    public static void ex6() {
        int a1 = 1;
        int a2 = 1;
        int sum = 0;
        int idx = (int) (Math.random() * 30) + 10;
        System.out.println("the random number is: " + idx);
        System.out.println(a1);
        System.out.println(a2);
        for (int i = 2; i < idx; i++) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            System.out.println(a2);
            sum = sum + a2;
        }
        System.out.println("the sum is: " + sum);
    }

    public static void ex7() {
        int a1 = 1;
        int a2 = 1;
        int sum = 0;
        int idx = (int) (Math.random() * 30) + 10;
        System.out.println("the random number is: " + idx);
        System.out.println(a1);
        System.out.println(a2);
        for (int i = 2; i < idx; i++) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            System.out.println(a2);
            sum = sum + a2;
        }
        System.out.println("the sum is: " + sum);
        System.out.println("tha avg is: " + sum / idx);
    }

    public static void ex8() {
        int a = (int) (Math.random() * 95) + 5;
        int b = (int) (Math.random() * 95) + 5;
        int f1 = Math.min(a, b);
        int f2 = Math.max(a, b);
        System.out.println("start : " + f1);
        System.out.println("end : " + f2);
        int a1 = 1;
        int a2 = 1;
        int fibo = 0;
        while ((fibo = a1 + a2) < f1) {
            a1 = a2;
            a2 = fibo;
        }
        while ((fibo = a1 + a2) <= f2) {
            System.out.println(fibo);
            a1 = a2;
            a2 = fibo;

        }
    }

    public static void ex9() {
        int a = (int) (Math.random() * 95) + 5;
        int b = (int) (Math.random() * 95) + 5;
        int f1 = Math.min(a, b);
        int f2 = Math.max(a, b);
        int max = 0;
        System.out.println("start : " + f1);
        System.out.println("end : " + f2);
        int a1 = 1;
        int a2 = 1;
        int fibo = 0;
        while ((fibo = a1 + a2) < f1) {
            a1 = a2;
            a2 = fibo;
        }
        while ((fibo = a1 + a2) <= f2) {
            System.out.println(fibo);
            a1 = a2;
            a2 = fibo;
        }
        if (fibo > max) {
            max = fibo;
        }
        System.out.println("the biggest number is: "+(max-a1));

    }

    public static void ex10() {
        int num = (int) (Math.random() * 100) + 100;
        System.out.println("the random number is: " + num);
        for (int i = 1; i <= num; i++) {
            if (i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7) {
                System.out.print(" Boom! ");
            } else {
                System.out.print(" "+i+ " ");
            }
        }


    }
}








