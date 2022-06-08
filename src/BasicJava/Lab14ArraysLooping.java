package BasicJava;

public class Lab14ArraysLooping {
    public static void main(String[] args) {
        ex1();
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

    public static void ex1(){
        int[]arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*101);
            System.out.println(arr[i]);
        }
    }

    public static void ex2(){
        int[]arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*101);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void ex3(){
        int[]arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*101);
            if(arr[i]%2==0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void ex4(){
        int[]arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*101);
            if(arr[i]%2==1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void ex5(){
        int[]arr = new int[10];
        int sumEven = 0;
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*101);
            if(arr[i]%2==0) {
                System.out.print(arr[i] + " ");
                sumEven+=arr[i];
                countEven++;
            }
        }
        System.out.println();
        System.out.println("sum Even : "+sumEven);
        System.out.println("avg Even : "+sumEven*1.0/countEven);

    }

    public static void ex6(){
        int[]arr = new int[10];
        int sumOdd = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*101);
            if(arr[i]%2==1) {
                System.out.print(arr[i] + " ");
                sumOdd+=arr[i];
                countOdd++;
            }
        }
        System.out.println();
        System.out.println("sum Even : "+sumOdd);
        System.out.println("avg Even : "+sumOdd*1.0/countOdd);
    }

    public static void ex7(){
        int[]arr = new int[50];
        int max = 0;
        int maxIdx = 0;
        int min = 101;
        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            int num =(int)(Math.random()*101);
            System.out.print(num);
            if(num>max){
                max = num;
                maxIdx = i;
            }
            if(num<min){
                min = num;
                minIdx = i;
            }
        }
        System.out.println();
        System.out.println("max : "+ max +", at loaction : "+maxIdx);
        System.out.println("min : "+ min +", at loaction : "+minIdx);
    }

    public static void ex8(){
        int[]arr = new int[15];
        int a1 = 1;
        int a2 = 1;

        arr[0]=a1;
        arr[1]=a2;

        for (int i = 2; i < arr.length ; i++) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            arr[i]=a2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void ex9(){
        int[]arr = new int[15];
        int sumEven = 0;
        int sumOdd = 0;
        int a1 = 1;
        int a2 = 1;
        sumOdd+=a1+a2;

        arr[0]=a1;
        arr[1]=a2;

        for (int i = 2; i < arr.length ; i++) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            arr[i]=a2;
            if(a2%2==0){
                sumEven+=a2;
            }else {
                sumOdd+=a2;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Sum Even : "+ sumEven);
        System.out.println("Sum Odd : "+ sumOdd);
        if(sumEven>sumOdd){
            System.out.println("sum even is greater");
        }else{
            System.out.println("sum odd is greater");

        }
    }

    public static void ex10(){
        int[]arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            int rnd = (int) (Math.random()*101);
            if(rnd%2==1){
                rnd+=1;
            }
            arr[i]=rnd;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


