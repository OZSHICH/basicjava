package BasicJava;

public class Lab12LoopsAlgorithms {

    public static void main(String[] args) {
        // ex1();
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
        int num = (int) (Math.random() * 7) + 1;
        int fact = 1;
        System.out.println("the random number is: " + num);
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("the fact of: " + num + " = " + fact);
    }

    public static void ex2() {
        int num = (int) (Math.random() * 7) + 1;
        int fact = 1;
        System.out.println("the random number is: " + num);
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("the fact of: " + num + " is " + fact);

    }

    public static void ex3() {
        int num = (int) (Math.random() * 7) + 1;
        int fact = 1;
        System.out.println("the random number is: " + num);
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("fact is: " + fact);
    }

    public static void ex4() {
        int num = (int) (Math.random() * 7) + 1;
        int fact = 1;
        System.out.println("the random number is: " + num);
        int i = num;
        while (i >= 1) {
            fact *= i;
            i--;
        }
        System.out.println("fact is: " + fact);
    }

    public static void ex5() {
        int num = (int) (Math.random() * 10001);
        System.out.println("num is: " + num);
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println("count : " + count);
    }

    public static void ex6() {
        int num = (int) (Math.random() * 10001);
        System.out.println("num is: " + num);
        System.out.println("the right digit is :" + num % 10);
    }

    public static void ex7() {
        int num = (int) (Math.random() * 10001);
        System.out.println("num is: " + num);
        while (num > 9) {
            num /= 10;
        }
        System.out.println("the left digit is: " + num);
    }

    public static void ex8() {
        int num = (int) (Math.random() * 10001);
        System.out.println("num is: " + num);
        int oppo = 0;
        while (num > 1) {
            oppo = oppo * 10 + num % 10;
            num /= 10;
        }
        System.out.println("the opposite num is: " + oppo);

    }

    public static void ex9() {
        int num = (int) (Math.random() * 100001), oppo = 0;
        System.out.println("num is: " + num);
        int originalnum = num;
        while (num > 1) {
            oppo = oppo * 10 + num % 10;
            num /= 10;
        }
        if (originalnum == oppo) {
            System.out.println(oppo + " is palindrome");
        } else {
            System.out.println(oppo + " is not palindrome");
        }
    }

    public static void ex10() {
        int num = (int) (Math.random() * 100001), ledtdigit = 0, rightdigit = 0, count = 0, sumofdigit = 0, oppo = 0, originnum = num;
        System.out.println("the random number is: " + num);
        ledtdigit = num;
        while (ledtdigit > 9) {
            ledtdigit /= 10;
        }
        System.out.println("the left digit is: " + ledtdigit);
        rightdigit = num % 10;
        {
        }
        System.out.println("the right digit is: " + rightdigit);
        {
        }
        while (num > 0) {
            count++;
            sumofdigit += num % 10;
            oppo = oppo * 10 + num % 10;
            num /= 10;
        }
        System.out.println("sum of digit: " + sumofdigit);
        System.out.println("number of digit is: " + count);
        System.out.println("opposite number is: " + oppo);
        if (originnum == oppo) {
            System.out.println("the number is Palindrome");
        } else {
            System.out.println("the number is not Palindrome");
            System.out.println("!!!thank you and good night!!!");
        }
    }


}



