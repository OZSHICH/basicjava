package BasicJava;


public class Lab14ArraysInAction {
    public static void main(String[] args) {

        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10();

    }

    public static void ex1(){
        int[] arr1 = {3,2,7,6,4,2,1,7,9,4};
        int[] arr2 = {8,2,9,8,4,2,1,4,9,1};
        int[] arr3 = new int[10];
        int idx=0;

        for (int i = 0; i < arr1.length; i++) {
            boolean isExist = false;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    isExist=true;
                }
            }
            if(!isExist) {
                arr3[idx] = arr1[i];
                idx++;
            }

        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();


    }

    public static void ex2(){
        int[] arr1 = {3,2,7,6,4,2,1,7,9,4};
        int[] arr2 = {8,2,9,8,4,2,1,4,9,1};
        int[] arr3 = new int[10];
        int idx=0;


        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i]==arr1[j]){
                    arr1[j]=-1;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            boolean isExist = false;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    isExist=true;
                }
            }
            if(!isExist && arr2[i]!=-1) {
                arr3[idx] = arr2[i];
                idx++;
            }

        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }

    public static void ex3(){
        int[] arr1 = {3,2,7,6,4,2,1,7,9,4};
        int[] arr2 = {8,2,9,8,4,2,1,4,9,1};
        int[] arr3 = new int[10];
        int idx=0;

        for (int i = 0; i < arr2.length; i++) {
            boolean isExist = false;
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i]==arr1[j]){
                    isExist=true;
                }
            }
            if(!isExist) {
                arr3[idx] = arr2[i];
                idx++;
            }

        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }

    public static void ex4(){
        int[] arr1 = {3,2,7,6,4,2,1,7,9,4};
        int[] arr2 = {8,2,9,8,4,2,1,4,9,1};
        int[] arr3 = new int[10];
        int idx=0;


        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if(arr2[i]==arr2[j]){
                    arr2[j]=-1;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean isExist = false;
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i]==arr1[j]){
                    isExist=true;
                }
            }
            if(!isExist && arr2[i]!=-1) {
                arr3[idx] = arr2[i];
                idx++;
            }

        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }

    public static void ex5(){
        int[] arr1 = {3,2,7,6,4,2,1,7,9,4};
        int[] arr2 = {8,2,9,8,4,2,1,4,9,1};
        int[] arr3 = new int[10];
        int idx=0;


        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i]==arr1[j]){
                    arr1[j]=-1;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if(arr2[i]==arr2[j]){
                    arr2[j]=-1;
                }
            }
        }


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    arr1[i]=-1;
                    arr2[j]=-1;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=-1){
                arr3[idx]=arr1[i];
                idx++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]!=-1){
                arr3[idx]=arr2[i];
                idx++;
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }

    public static void ex6(){
        int[] arr = {1 , 2 , 5 , 1 , 6 , 1 , 5 , 4 , 8};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j] && arr[i]!=-1){
                    arr[j]=-1;
                    count++;
                }
            }
        }

        int[] res = new int[arr.length-count];
        int idx = 0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1){
                res[idx]=arr[i];
                idx++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
        System.out.println();
    }

    public static void ex7(){
        int[] arr = {6 , 8 , 4 , 2 , 7 , 5};
        int[] res = new int[arr.length];
        int idx = 0;

        for (int i = arr.length - 1; i >= 0 ; i--) {
            res[idx]= arr[i];
            idx++;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
        System.out.println();

    }

    public static void ex8(){
        System.out.println("Bubble Sort");
        int[] arr = {1 , 2 , 5 , 1 , 6 , 1 , 5 , 4 , 8};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void ex9(){
        int[] arr = {1 , 2 , 0 , 1 , 9 , 0 , 0 , 0 , 0};
        int num = 0;

        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]==0){
                arr[i]=-1;
            }else{
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1) {
                num = num * 10 + arr[i];
            }
        }
        System.out.println(num);
    }

    public static void ex10(){
        int[] arr = {1 , 2 , 5 , 1 , 6 , 1 , 5 , 4 , 8};
        int max = 0;
        int min = 10;
        int count1=0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            if(num==1){
                count1++;
            }

        }

        int[] res = {max,min,count1};
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
}