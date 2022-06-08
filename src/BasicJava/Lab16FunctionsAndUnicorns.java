package BasicJava;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Lab16FunctionsAndUnicorns {
    Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {

        name();
        name();

        evens();
        evens();
        evens();

        f1();
        System.out.println("-------");
        f2();
        System.out.println("-------");
        f3();

        System.out.println(nums((short)5,(short)5,(short)3,(short)2,(short)1));
        Scanner scanner = new Scanner(System.in);
        System.out.println("please insert 1st number");
        short a = scanner.nextShort();
        System.out.println("please insert 2nd number");
        short b = scanner.nextShort();
        System.out.println("please insert 3rd number");
        short c = scanner.nextShort();
        System.out.println("please insert 4th number");
        short d = scanner.nextShort();
        System.out.println("please insert 5th number");
        short e = scanner.nextShort();
        System.out.println(nums(a,b,c,d,e));
        scanner.close();

        System.out.println("rnd : "+ rnd(30,40));

        System.out.println("please insert 1st number");
        int num1 = scanner.nextInt();
        System.out.println(num1 + " "+ ((isPrime(num1))?"is Prime":"Not Prime"));
        System.out.println("please insert 2nd number");
        int num2 = scanner.nextInt();
        System.out.println(num2 + " "+ ((isPrime(num2))?"is Prime":"Not Prime"));
        System.out.println("please insert 3rd number");
        int num3 = scanner.nextInt();
        System.out.println(num3 + " "+ ((isPrime(num3))?"is Prime":"Not Prime"));

        int[]arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int)(Math.random()*401)-200;
        }

        System.out.println("sum : "+ ex8_sum(arr));
        System.out.println("avg : "+ ex8_avg(arr));
        System.out.println("max : "+ ex8_max(arr));
        System.out.println("min : "+ ex8_min(arr));
        System.out.println("max index : "+ ex8_maxIdx(arr));
        System.out.println("min index : "+ ex8_minIdx(arr));
        System.out.println("count evens : "+ ex8_countEvens(arr));
        System.out.println("count odds  : "+ ex8_countOdds(arr));
        System.out.println("is 7 exist  : "+ ex8_isExist(arr,7));
        System.out.println("is 7 exist and his index if so  : "+ ex8_isExistReceiveIdx(arr,7));


        drawSquare(5);

        time();

        unicorn();
        unicorn();
        unicorn();

    }

    public static void name() {
        System.out.println("Kobi");
    }

    public static void evens() {
        for (int i = 2; i <= 200; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void f3() {
        System.out.println("f3");
    }

    public static void f2() {
        System.out.println("f2");
        f3();
    }

    public static void f1() {
        System.out.println("f1");
        f2();
    }

    public static short nums(short a, short b, short c, short d, short e) {
        return (short) ((a+b+c+d+e)/5);
    }

    public static int rnd(int min, int max) {
        return (int)(Math.random()*(max-min+1))+min;
    }

    public static boolean isPrime(int num) {
        if(num<2){
            return false;
        }

        for (int i = 2 ; i < Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    public static void ex8_display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int ex8_sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static double ex8_avg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum*1.0/arr.length;
    }

    public static int ex8_max(int[] arr) {
        int max = - 200;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int ex8_min(int[] arr) {
        int min = 200;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int ex8_maxIdx(int[] arr) {
        int maxIdx = 0;
        int max = - 200;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static int ex8_minIdx(int[] arr) {
        int minIdx = 0;
        int min = 200;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int ex8_countEvens(int[] arr) {
        int countEvents = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                countEvents++;
            }
        }
        return countEvents;
    }
    public static int ex8_countOdds(int[] arr) {
        int countOdds = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                countOdds++;
            }
        }
        return countOdds;
    }

    public static boolean ex8_isExist(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }

    public static int ex8_isExistReceiveIdx(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static void drawSquare(int side){
        for (int i = 1; i <= side ; i++) {
            if(i==1 || i==side){
                for (int j = 0; j < side; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            else{
                System.out.print(" * ");
                for (int j = 1; j < side-1; j++) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
                System.out.println();
            }
        }
    }


    public static void time(){
        LocalDateTime time = LocalDateTime.now();
        System.out.printf("%02d:%02d:%02d%n",time.getHour(),time.getMinute(),time.getSecond());
    }

    public static void unicorn(){
        System.out.println("		\\.");
        System.out.println("		 \\\\      .");
        System.out.println("		  \\\\ _,.+;)_");
        System.out.println("		  .\\\\;~%:88%%.");
        System.out.println("		 (( a   `)9,8;%.");
        System.out.println("		 /`   _) ' `9%%%?");
        System.out.println("		(' .-' j    '8%%'");
        System.out.println("		 `\"+   |    .88%)+._____..,,_   ,+%$%.");
        System.out.println("		       :.   d%9`             `-%*'\"'~%$.");
        System.out.println("		    ___(   (%C                 `.   68%%9");
        System.out.println("		  .\"        \7                  ;  C8%%)`");
        System.out.println("		  : .\"-.__,'.____________..,`   L.  \\86' ,");
        System.out.println("		  : L    : :            `  .'\\.   '.  %$9%)");
        System.out.println("		  ;  -.  : |             \\  \\  \"-._ `. `~\"");
        System.out.println("		   `. !  : |              )  >     \". ?");
        System.out.println("		     `'  : |            .' .'       : |");
        System.out.println("		         ; !          .' .'         : |");
        System.out.println("		        ,' ;         ' .'           ; (");
        System.out.println("		       .  (         j  (            `  \\");
        System.out.println("		       \"\"\"'          \"\"'             `\"\"");
        System.out.println("\n\n");


    }
}
