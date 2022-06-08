package BasicJava;

import java.util.Scanner;

public class Lab10Conditions {
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
        int a = (int) (Math.random() * 100);
        System.out.println(a);
        if (a > 50) System.out.println("Big");
        if (a < 50) System.out.println("Small");
        if (a == 50) System.out.println("Bingo");
    }

    public static void ex2() {
        int a = (int) (Math.random() * 101);
        System.out.println(a);
        if (a > 50) {
            System.out.println("Big");
        } else if (a < 50) {
            System.out.println("Small");
        } else if (a == 50) {
            System.out.println("Bingo");
        }
    }

    public static void ex3() {
        int sal = (int) (Math.random() * 1001) + 5000;
        System.out.println("sal is: " + sal + " ₪");
        if (sal * 0.1 <= 6000) {
            System.out.println("new sal is:" + (sal + (sal * 0.1)) + " ₪");
        } else {
            System.out.println("new sal is: " + (sal + (sal * 0.05)) + " ₪");
        }

    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("min num is: " + Math.pow(min, 3));
        System.out.println("the middle num is " + (sum - max - min));

        scanner.close();
    }

    public static void ex5() {
        int sal = (int) (Math.random() * 120001);

        System.out.println("sal is: " + sal);
        double tax = 0;
        if (sal <= 23000) {
            tax = sal * 0.1;
        } else if
        (sal <= 50000) {
            tax = sal * 0.2;
        } else if
        (sal <= 100000) {
            tax = sal * 0.3;
        } else {
            tax = sal * 0.4;
        }
        System.out.println("the tax is: " + tax);
        System.out.println("net sal is: " + (sal - tax));

    }

    public static void ex6() {
        int sal = (int) (Math.random() * 120001);
        double tax = 0;
        if (sal <= 23000) {
            tax = sal * 0.1;
        } else if (sal <= 50000) {
            tax = 23000 * 0.1 + (sal - 23000) * 0.2;
        } else if (sal <= 100000) {
            tax = 23000 * 0.1 + 27000 * 0.2 + (sal - 50000) * 0.3;
        } else {
            tax = 23000 * 0.1 + 27000 * 0.2 + 50000 * 0.3 + (sal - 100000) * 0.4;
        }
        System.out.println("sal is: " + sal);
        System.out.println("tax is: " + tax);
        System.out.println("net sal is: " + (sal - tax));

    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert a year");
        int year = scanner.nextInt();
        System.out.println("the year is:" + year);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Regular year");
        }

        scanner.close();
    }

    public static void ex8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert a month");
        int month = scanner.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter GoodBye");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring GoodBye");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer GoodBye");
        } else {
            System.out.println("Fall GoodBye");
        }
        scanner.close();


    }


    public static void ex9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls insert a year");
        int year = scanner.nextInt();
        System.out.println("pls insert a month");
        int month = scanner.nextInt();
        System.out.println("the year is: " + year);
        System.out.println("and the month is: " + month);
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 | month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("29 days");
        } else {
            System.out.println("28 days");
        }
        scanner.close();
    }

        public static void ex10 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("pls insert age with d.point");
            double age = scanner.nextDouble();
//        if (age>21) {
//            System.out.println("Welcome");
//        }else {
//            System.out.println("!!!GO HOME KID!!!");
//        }

            System.out.println((age > 21) ? "Welcome" : "!!!GO HOME KID!!!");

            scanner.close();


        }
    }






