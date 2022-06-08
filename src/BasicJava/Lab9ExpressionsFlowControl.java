package BasicJava;

import java.util.Random;
import java.util.Scanner;

public class Lab9ExpressionsFlowControl {
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
        String part1 = "There will be";
        String visitors = "5";
        String part2 = "pepole for dinner,";
        String part3 = "kobi is on standby";
        System.out.println(part1 + " " + visitors + " " + part2 + " " + part3);
    }

    public static void ex2() {
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("sum of a and b is " + a + b);
        System.out.println(("avg of a + b is " + (a + b) / 2));
        System.out.println("a%10 is " + a % 10);
        System.out.println("b%10 is " + b % 10);
        System.out.println("surface of a and b is " + a * b);
        System.out.println("par of a and b is " + (a + b) * 2);
    }

    public static void ex3() {
        int movie = (int) (Math.random() * 250) + 100;
        System.out.println(movie);
        System.out.println("the movie time is: " + movie / 60 + ":" + movie % 60);
        System.out.println("the movie time is: " + movie / 60 + " hours and " + movie % 60 + " minutes");


    }

    public static void ex4() {
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        System.out.println("the bigger number is " + Math.max(a, b));
        System.out.println("the lowest number is " + Math.min(a, b));
        System.out.println("the avg is " + (a + b) / 2);
        System.out.println("the sum is " + (a + b));
        if ((a + b) % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");


        }
    }

    public static void ex5() {
        int a = (int) (Math.random() * 550) + 200;
        int b = (int) (Math.random() * 550) + 200;
        int c = (int) (Math.random() * 550) + 200;
        System.out.println(a + " " + b + " " + c);
        System.out.println("the bigest number is " + Math.max(a, Math.max(b, c)));
        if (Math.max(a, Math.max(b, c)) % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");


        }


    }

    public static void ex6() {
        String firstname = "max";
        String teamname = "megateam";
        float age = 27.5f;
        int goal = (int) (Math.random() * 850) + 150;
        System.out.println("number of goals is " + goal);
        if (goal > 600) {
            System.out.println("WOW");
        } else {
            System.out.println(goal);
        }

        System.out.println("the playr name is " + firstname + " and he plays in the team called " + teamname + " and is age is " + age);

    }

    public static void ex7() {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println((Math.pow(a, 2)));
        System.out.println((Math.pow(b, 2)));
        System.out.println((Math.pow(c, 2)));


    }

    public static void ex8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = scanner.nextDouble();
        System.out.print("Input height in meters: ");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("the BMI is " + BMI + " kg/m2");
        if (BMI > 24.9)
            System.out.println("Overweight");
        else if (BMI > 18.5) System.out.println("Healthy");
        else if (BMI > 29.9) System.out.println("Obese");

        scanner.close();


    }

    public static void ex9() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        int d = (int) (Math.random() * 100);
        int e = (int) (Math.random() * 100);
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        System.out.println(Math.max(a, Math.max(b, Math.max(c, Math.max(d, e)))));

    }

    public static void ex10() {
        int a= (int) (Math.random()*10)+10;
        int b= (int) (Math.random()*10)+10;
        int c= (int) (Math.random()*10)+10;
        int d= (int) (Math.random()*10)+10;
        int e= (int) (Math.random()*10)+10;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        System.out.println(Math.max(a, Math.max(b, Math.max(c, Math.max(d, e)))));
    }

}
