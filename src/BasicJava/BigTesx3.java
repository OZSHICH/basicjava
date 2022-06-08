package BasicJava;
public class BigTesx3 {
    public static void main(String[] args) {

        System.out.print("Q1 - init 2 arrays nums1 + nums2");
        //System.out.println();
        int[] nums1 = init();
        int[] nums2 = init();
        //int[] nums3 = init();     //הדפסה של מתודה שוב יוצרת שכפול
        System.out.println();
        System.out.println("Q2 - print those arrays");

        print(nums1);
        print(nums2);
        //print(nums3);   //הדפסה של מתודה שוב יוצרת שכפול

        System.out.println("Q3 - nums1 max 3 digit number");
        System.out.println(max3DigNumber(nums1));

        System.out.println("Q4 - init distinct array");


        System.out.println("Q5 - print this array");
        // print(dist);

        System.out.println("Q6 - calculate and print the number");
        int[] dist = {8,2,3,7,0,9,-1,-1,-1,-1}; // 907328
        System.out.println(calcNumber(dist));


    }

    public static int[] init() {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            //System.out.print(arr[i]+ " "); //הדפסה אחרי מוסיפה הדפסה מידית

        }
        //System.out.println();
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int max3DigNumber(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 2; i++) {  //-2 אומר כמה מספרים לחפש אחרי הגבוה
            int val = 100*arr[i]+10*arr[i+1]+1*arr[i+2];   //בשביל למצוא מספר 3 ספרות, מיקום הספרה במיקום ה[i] במערך הראשון כפול 100', השני כפול 10, והשלילי כפול 1 או ללא מכפלה.
            if(val>max){   //למציאת
                max = val;   //מספר גדול
            }
        }

        return max;
    }

    public static int calcNumber(int[]arr){

        int sum = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]!=-1) {
                sum = sum * 10 + arr[i];
            }
        }

        return sum;
    }

}


//    int sum = 0;
//                for (int i = arr3.length-1; i >=0; i++) {
//                        if (arr3[i] != 0) {
//                        sum = sum * 10 + arr3[i];
//                        }
//                        }
//                        System.out.println(sum);