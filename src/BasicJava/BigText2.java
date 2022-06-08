package BasicJava;

import java.util.*;

public class BigText2 {
            public static int[] nums1 = new int[15];
            public static int[] nums2 = new int[15];

            public static void main(String[] args) {

                System.out.println("nums1: ");
                for (int i = 0; i < nums1.length; i++) {
                    nums1[i] = (int) (Math.random() * 10);
                    System.out.print(nums1[i] + ",");
                }
                System.out.println();
                System.out.println("nums2: ");
                for (int i = 0; i < nums2.length; i++) {
                    nums2[i] = (int) (Math.random() * 10);
                    System.out.print(nums2[i] + ",");


                }
                ex3();
                int[] dist = new int[10];
                System.out.println("distinct: ");
                for (int i = 0; i < dist.length; i++) {
                    dist[i] = -1;
                    System.out.print(dist[i] + ",");

                }


            }

            public static void ex3() {
                int maxnum = 0;
                int firstbignum = -1;
                int sectobn = -1;
                int thirdtobn = -1;
                for (int i = 0; i < nums1.length - 2; i++) {
                    if (nums1[i] > firstbignum) {
                        firstbignum = nums1[i];
                        sectobn = nums1[i + 1];
                        thirdtobn = nums1[i + 2];
                        if (nums1[i + 1] > sectobn) {
                            sectobn = nums1[i + 1];
                            thirdtobn = nums1[i + 2];

                        }
                        maxnum = ((firstbignum * 100) + (sectobn * 10) + (thirdtobn * 1));

                    }
                }
                System.out.println();
                System.out.println("the highest number with 3 nearby digits is : " + maxnum);
            }
}