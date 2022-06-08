package BasicJava;

public class Lab14ArraysBasic {
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
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'd', 'r', 'c'};
        int countA = 0;
        int countC = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                countA++;
            } else if (arr[i] == 'c') {
                countC++;
            }
        }
        System.out.println("a appears " + countA + " times");
        System.out.println("a and c appears " + (countC + countA) + " times");

    }

    public static void ex2() {
        String name = "John Bryce";
        char[] let = name.toLowerCase().toCharArray();
        int countlet = 0;
        for (int i = 0; i < let.length; i++) {
            if (let[i] == 'a' || let[i] == 'e' || let[i] == 'i' || let[i] == 'o' || let[i] == 'u') {
                countlet++;
            }
        }
        System.out.println("in " + name + " there are " + countlet + " let");
    }

    public static void ex3() {
        String name = "Sara Shara Shir Cameach";
        char[] let = name.toLowerCase().toCharArray();
        int countlet = 0;
        for (int i = 0; i < let.length; i++) {
            if (let[i] == 'a' || let[i] == 'e' || let[i] == 'i' || let[i] == 'o' || let[i] == 'u') {
                countlet++;
            }
        }
        System.out.println("in " + name + " there are " + countlet + " let");
    }

    public static void ex4() {
        int[] arr = {1, 2, 3, 1, 2, 3, 3, 2, 1, 9, 5, 1, 1, 9};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            } else if (arr[i] == 3) {
                count3++;
            } else if (arr[i] == 5) {
                count5++;
            }
        }
        System.out.println("number 1 appears: " + count1 + " times");
        System.out.println("number 3 appears: " + count3 + " times");
        System.out.println("number 2 and 5 appears: " + (count2 + count5) + " times");

    }

    public static void ex5() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
            System.out.print(arr[i] + ",");
        }
    }

    public static void ex6() {
        int[] arr = new int[10];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
            if (arr[i] > max) {
                max = arr[i];

            }

            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("max is: " + max);


    }

    public static void ex7() {
        int[] arr = new int[10];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
            if (arr[i] < min) {
                min = arr[i];
            }

            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("min is: " + min);

    }

    public static void ex8() {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
            sum += arr[i];
            System.out.print(arr[i] + ",");

        }
        System.out.println();
        System.out.println("the sum is: " + sum);

    }

    public static void ex9() {
        int[] arr = new int[10];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
            sum += arr[i];
            count++;
            System.out.print(arr[i] + ",");

        }
        System.out.println();
        System.out.println("the sum is: " + sum);
        System.out.println("the avg is: " + sum / count);

    }

    public static void ex10() {
        int[] arr = new int[100];
        int max = 0;
        int maxidx = 0;
        int min = 100;
        int minidx = 0;
        int sum = 0;
        int avg = 0;
        int sumeven = 0;
        int sumodd = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.random() * 100) + 1;
            arr[i]= num;
            System.out.print(num+ " ");
            if (num < min) {
                min = num;
                minidx=i;
            }
            if (num > max) {
                max = num;
                maxidx=i;
            }
            if (num%2==0){
                sumeven+=num;
            }
            if (num%2==1){
                sumodd+=num;
            }

            sum += arr[i];
            count++;


        }System.out.println();

        System.out.println("the min number is: "+min);
        System.out.println("min location : "+minidx);
        System.out.println("the max number is: "+max);
        System.out.println("max location : "+maxidx);
        System.out.println("sum of all odd numbers: "+sumodd);
        System.out.println("sum of all even numbers: "+sumeven);
        System.out.println("the sum is: " + sum);
        System.out.println("the avg is: " + sum / count);

    }
}