package OopLabPurple.OopLabPurpleDogGarden;

import java.util.*;

public class ConstantFactory {

    private static Random random = new Random();


    public static String randomHumanName() {
        String[] hnames = {"Jonny", "Gal", "Moshe", "Ravid", "Tal"};
        return hnames[random.nextInt(5)];
    }


    public static float randomWeight() {
        return (float) (Math.random() * 5.6f) + 3.2f;

    }

    public static String randomColor() {

        String[] cnames = {"White", "Brown", "Black", "Dotted", "Leopard Stripes"};
        return cnames[random.nextInt(5)];
    }

    public static String randomDogName() {

        String[] dnames = {"Dogush", "Dogidog", "Dogaldo", "Dogile", "Doginiiho", "Doginoin", "Dogxer", "Dogolon", "Dogonihikio", "Dogio"};
        return dnames[random.nextInt(10)];
    }

    public static String randomGardenName() {

        String[] gnames = {"Dog Kingdom", "Dog Heaven", "Funfunfun Place!"};
        return gnames[random.nextInt(3)];
    }


    public static boolean randomisvaccinated() {
        return random.nextInt(11) + 1 > 2;
    }

}

