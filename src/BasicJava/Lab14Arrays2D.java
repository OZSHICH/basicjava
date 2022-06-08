package BasicJava;

public class Lab14Arrays2D {
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
        int[][] arr = new int[20][10];
        int totalSumAvg = 0;
        double maxAvg = 0;
        int maxIdx = 0;
        double minAvg = 100;
        int minIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                int grade = (int) (Math.random() * 41) + 60;
                System.out.print(grade + " ");
                arr[i][j] = grade;
                sum += grade;
            }
            System.out.println();
            double avg = sum * 1.0 / arr[i].length;
            System.out.println("student #" + i + " avg : " + avg);
            totalSumAvg += avg;
            if (avg > maxAvg) {
                maxAvg = avg;
                maxIdx = i;
            }
            if (avg < minAvg) {
                minAvg = avg;
                minIdx = i;
            }

        }

        System.out.println("total avg : " + totalSumAvg * 1.0 / arr.length);
        System.out.println("max location : " + maxIdx);
        System.out.println("min location : " + minIdx);
    }

    public static void ex2() {
        int[][] arr = new int[10][4];
        int totalSumAvg = 0;
        double maxAvg = 0;
        int maxIdx = 0;
        double minAvg = 100;
        int minIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                int age = (int) (Math.random() * 121);
                System.out.print(age + " ");
                arr[i][j] = age;
                sum += age;
            }
            System.out.println();
            double avg = sum * 1.0 / arr[i].length;
            System.out.println("Aprt #" + i + " avg : " + avg);
            totalSumAvg += avg;
            if (avg > maxAvg) {
                maxAvg = avg;
                maxIdx = i;
            }
            if (avg < minAvg) {
                minAvg = avg;
                minIdx = i;
            }

        }

        System.out.println("total avg : " + totalSumAvg * 1.0 / arr.length);
        System.out.println("max location : " + maxIdx);
        System.out.println("min location : " + minIdx);
    }

    public static void ex3() {

        int[][] arr = new int[20][10];
        int totalSumAvg = 0;
        double maxAvg = 0;
        int maxIdx = 0;
        double minAvg = 17001;
        int minIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                int sal = (int) (Math.random() * 3_001)+12_001+2_000;
                System.out.print(sal + " ");
                arr[i][j] = sal;
                sum += sal;
            }
            System.out.println();
            double avg = sum * 1.0 / arr[i].length;
            System.out.println("student #" + i + " avg : " + avg);
            totalSumAvg += avg;
            if (avg > maxAvg) {
                maxAvg = avg;
                maxIdx = i;
            }
            if (avg < minAvg) {
                minAvg = avg;
                minIdx = i;
            }

        }

        System.out.println("total avg : " + totalSumAvg * 1.0 / arr.length);
        System.out.println("max location : " + maxIdx);
        System.out.println("min location : " + minIdx);



    }

    public static void ex4() {
        int[][]arr = new int[10][10];
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=val++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void ex5() {
        int[][]arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void ex6() {
        int[][]arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = (int)(Math.random()*101)+100;
                if(val%5==0 || val%7==0){
                    val = 0;
                }
                arr[i][j] = val;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void ex7() {
        int[][]arr = new int[10][10];
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                int val = (int)(Math.random()*101)+100;
                sum+=val;
                arr[i][j] = val;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            System.out.println("idx : "+i + " sum : "+sum);
            if(sum>max){
                max = sum;
                maxIdx = i;
            }

        }

        System.out.println("max row : "+ maxIdx);
    }

    public static void ex8() {
        int[][]arr = new int[5][5];
        boolean isZero = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= (isZero)?0:1;
                isZero=!isZero;
                System.out.print(arr[i][j]+" " );
            }
            System.out.println();
        }




    }

    public static void ex9() {
        int[][] arr = new int[10][10];
        int start = 0;
        int end = arr.length;
        for (int i = 1; i <= 5; i++) {
            for (int j = start; j < end; j++) {
                for (int k = start; k <end; k++) {
                    arr[j][k]=start+1;
                }
            }
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }




    }

    public static void ex10() {
        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }














    }
}

