package BasicJava;

public class BigText {
    public static void main(String[] args) {


        int[] arr1 = new int[15];
        System.out.println("arr1: Q1 ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
            System.out.print(arr1[i] + ",");
        }
        {
            {
                int max = arr1[0];
                int maxSum = 0;
                for (int i = 1; i < arr1.length; i++) {
                    if (arr1[i] > max)
                        max = arr1[i];
                }
                System.out.println();
                System.out.println("arr: Q3 ");
                System.out.println("max is: " + max);
                int[] arr2 = new int[15];
                System.out.println("arr2: Q1 ");
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (int) (Math.random() * 10);
                    System.out.print(arr2[i] + ",");

                }
                int[] arr3 = new int[15];
                int idx = 0;
                int sum = 0;


                System.out.println();
                System.out.println("arr3: Q5 ");

                for (int i = 0; i < arr1.length; i++) {
                    for (int j = i + 1; j < arr1.length; j++) {
                        if (arr1[i] == arr1[j]) {
                            arr1[j] = -1;
                        }
                    }
                }

                for (int i = 0; i < arr2.length; i++) {
                    for (int j = i + 1; j < arr2.length; j++) {
                        if (arr2[i] == arr2[j]) {
                            arr2[j] = -1;
                        }
                    }
                }


                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr2.length; j++) {
                        if (arr1[i] == arr2[j]) {
                            arr1[i] = -1;
                            arr2[j] = -1;
                        }
                    }
                }

                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i] != -1) {
                        arr3[idx] = arr1[i];
                        idx++;
                    }
                }

                for (int i = 0; i < arr2.length; i++) {
                    if (arr2[i] != -1) {
                        arr3[idx] = arr2[i];
                        idx++;
                    }
                }

                for (int i = 0; i < arr3.length; i++) {
                    System.out.print(arr3[i] + " ");

                }


                System.out.println();
            }

        }
        System.out.println("ALL I Remember :(");

    }
}

//    public static int calcnum(int[]arr3){
//        int sum = 0;
//        for (int i = arr3.length-1; i >=0; i++) {
//            if (arr3[i] != 0) {
//                sum = sum * 10 + arr3[i];
//            }
//        }
//        return sum;
//    }

