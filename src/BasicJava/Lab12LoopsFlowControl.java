package BasicJava;

import java.util.Enumeration;
import java.util.Scanner;

public class Lab12LoopsFlowControl {
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
        ex10();
    }

    public static void ex1() {
        System.out.println("please insert a number");
        int sum = 0;
        int num = scanner.nextInt();
        while (num >= 0) {
            sum += num;
            System.out.println("please insert a number");
            num = scanner.nextInt();
        }
        System.out.println("Sum : " + sum);
        scanner.close();
    }

    public static void ex2() {
        System.out.println("please insert a number");
        int sum = 0;
        int count = 0;
        int num = scanner.nextInt();
        while (num >= 0) {
            sum += num;
            count++;
            System.out.println("please insert a number");
            num = scanner.nextInt();
        }
        if (sum / count != 0) {
            System.out.println("avg : " + sum / count);
        } else {
            System.out.println("there's no avg");
            scanner.close();

        }
    }

    public static void ex3() {
        System.out.println("please insert a number");
        int num = scanner.nextInt();
        int fact = 1;
        while (num >= 0) {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
            fact = 1;
            {
            }
            System.out.println("please insert a number");
            num = scanner.nextInt();
        }
    }

    public static void ex4() {
        System.out.println("please insert a number");
        int num = scanner.nextInt();
        while (num > 0) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + ": is not a prime number");
                } else {
                    System.out.println(num + ": is prime number");
                }
                System.out.println("please insert a number");
                num = scanner.nextInt();
            }
        }
    }

    public static void ex5() {
        System.out.println("please insert a number");
        int max = Integer.MIN_VALUE;
        int num = scanner.nextInt();
        while (num != -999) {
            if (num > max) {
                max = num;
            }
            System.out.println("please insert a number");
            num = scanner.nextInt();
        }
        System.out.println(max);
    }

    public static void ex6() {
        System.out.println("please insert a number");
        int min = Integer.MAX_VALUE;
        int num = scanner.nextInt();
        while (num != -999) {
            if (num < min) {
                min = num;
            }
            System.out.println("please insert a number");
            num = scanner.nextInt();
        }
        System.out.println(min);
    }

    public static void ex7() {
        System.out.println("pls insert a number:");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static void ex8() {
        System.out.println("pls insert a number:");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }

    public static void ex9() {
        System.out.println("pls insert rows");
        int rows = scanner.nextInt();
        System.out.println("pls insert cols");
        int cols = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ex10() {
        System.out.println("welcome");
        for (int i = 2; i < 10; i+=2) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact*=j;
            }
            System.out.print(i);
            System.out.println(" fact is :"+fact);

        }





        }
    }
