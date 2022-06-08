//package Test.Random;
//
//import Test.Random.DateUtils;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//public class ex8 {
//    public static void main(String[] args) {
//        int[] arr = new int[100];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 401) - 200;
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("-----------");
//        Test.ex8_display(arr);
//        //Uni.unicorn();
//
//        LocalDate birthday = LocalDate.of(1928,2,18);
//        System.out.println(DateUtils.beautifyDate(birthday));
//
//        LocalDate rightNow = LocalDate.now();
//        System.out.println(rightNow);
//        LocalDate startDate  =LocalDate.now();
//        System.out.println(startDate);
//        LocalDate endDate = LocalDate.now().plusYears(1).plusMonths(7).plusDays(4);
//        System.out.println(endDate);
//
//        LocalDateTime rightNowTime = LocalDateTime.now();
//        System.out.println(rightNowTime);
//
//        LocalDateTime arrived =  LocalDateTime.of(2023,4,17,15,55);
//        System.out.println(arrived);
//        LocalDateTime arrived2 =  LocalDateTime.of(2023,4,17,15,55,24);
//        System.out.println(arrived2);
//    }
//
//
//}
//
