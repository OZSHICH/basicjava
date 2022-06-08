package BasicJava;

import java.util.Random;

public class Lab9Random {
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
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        int c = (int) (Math.random() * 10) + 1;

        System.out.println(a + " " + b + " " + c);
        System.out.println("sum of 3 random numbers is " + (a + b + c));

    }

    public static void ex2() {
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        int c = (int) (Math.random() * 10) + 1;
        System.out.println(a + " " + b + " " + c);
        System.out.println("average of 3 random numbers " + (a + b + c) / 3);    //.f מוסיף עשרוני


    }

    public static void ex3() {
        int a = (int) (Math.random() * 100) + 1;
        System.out.println(a);
        if (a % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void ex4() {
        int a = (int) (Math.random() * 50) + 30;
        System.out.println(a);

        if (a % 2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");
    }

    public static void ex5() {
        int a = (int) (Math.random() * 750) + 200;
        int b = (int) (Math.random() * 750) + 200;
        int c = (int) (Math.random() * 750) + 200;
        System.out.println(a + " " + b + " " + c);
        System.out.println("the biggest number is " + (Math.max(a, Math.max(b, c))));


    }

    public static void ex6() {
        int a = (int) (Math.random() * 750) + 200;
        int b = (int) (Math.random() * 750) + 200;
        int c = (int) (Math.random() * 750) + 200;
        System.out.println((a + " " + " " + b + " " + c));
        System.out.println("the lowest number out of 3 random number " + (Math.min(a, Math.min(b, c))));


    }

    public static void ex7() {
        int a = (int) (Math.random() * 100) + 1;
        System.out.println(a);
        if (a > 50) {
            System.out.println("number is bigger then 50 ");
        } else System.out.println("number is lower then 50 ");

    }

    public static void ex8() {
        int len  = (int) (Math.random() * 20) + 15;
        int wide = (int) (Math.random() * 10) + 10;
        System.out.println("Square lan is " + len  + " and wid is " + wide);
        System.out.println("Square surface is " + len  * wide);
        System.out.println("Square perimeter is " + (len  + wide) * 2);


    }

    public static void ex9() {
        int radius = (int) (Math.random() * 10) + 3;
        System.out.println("the radius is " + radius);
        System.out.println("the surface is " + Math.PI * radius * radius);
        System.out.println("the perimeter is " + 2 * Math.PI * radius);
    }

    public static void ex10() {
        int a = (int) (Math.random() * 20) - 10;
        System.out.println("the random number is "+a);
    }
}


