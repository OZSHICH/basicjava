package Simulation.Sim1GuessTheNumber;

import java.util.*;

public class Sim1GuessTheNumber {

    private static final Scanner scanner = new Scanner(System.in);
    private static int numofmis = 0;
    private static char[] binaryNum = new char[5];
    private static char[] hiddenArr = new char[5];


    public static void main(String[] args) {
//        toBinary();
        Start();
        newarr();
        int num = RandomNum();
        binaryNum = Binary(num);
        System.out.println(Arrays.toString(binaryNum));

        while (numofmis < 4) {
            int guess = guess();
            if (num == guess) {
                success();
                break;
            }
            numofmis++;
            printCover(binaryNum, numofmis);

            if (numofmis == 4) {
                failure();
            }

        }

        description(num);
        end();
    }

    public static void Start() {
        System.out.println("hello and welcome to the Guessing Game");
        System.out.println("in front of you is a number in binary code");
        System.out.println("and the code is encrypted with the dash symbol ----- ");
        System.out.println("the mission of the game is to guess the number, you have 4 tries ");
        System.out.println("Good Luck");


    }

    public static int RandomNum() {
        System.out.println("this is your random number, hint: the number is between 1 - 16 ");
        int random = (int) (Math.random() * 16) + 1;
        System.out.println(" : " + random);
        return random;
    }

    // -----,  10010
    public static char[] Binary(int random) {
        int idx = binaryNum.length - 1;
        while (random > 0) {
            binaryNum[idx--] = (char) (random % 2 + '0');
            random /= 2;
        }

        return binaryNum;
    }

    ;

    public static void printCover(char[] arr, int mis) {

        for (int i = 0; i < hiddenArr.length; i++) {
            hiddenArr[hiddenArr.length - numofmis] = binaryNum[binaryNum.length - numofmis];
            System.out.print(hiddenArr[i]);
        }

    }

    public static void newarr() {
        for (int i = 0; i < 5; i++) {
            System.out.print('-');
            hiddenArr[i] = '-';

        }
        System.out.println();


    }

    public static void success() {
        System.out.println("Nice Job!!!");
    }

    public static void failure() {
        System.out.println(" You Lose");
    }

    public static int guess() {
        System.out.println();
        System.out.println("Pls guess the number");
        return scanner.nextInt();
    }

    public static void description(int num) {
        System.out.println("The number " + num + " in base 10 is" + Arrays.toString(Binary(num)) + " in binary");
    }

    public static void end() {
        System.out.println("good");

    }

//    public static void toBinary(){
//        int num = 10;
//        String binary = Integer.toBinaryString(num);
//        System.out.println(binary);
//    }


}