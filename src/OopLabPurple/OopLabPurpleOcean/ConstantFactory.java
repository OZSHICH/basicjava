package OopLabPurple.OopLabPurpleOcean;

import java.util.*;

import static OopLabPurple.OopLabPurpleOcean.OceanFactory.*;

public class ConstantFactory {
    private static Random random = new Random();


    public static int rand(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    //TODO random by % to choose
    public static String randomColor() {
        int choosecolor = rand(1, 100);

        if (choosecolor <= 50) {
            return "OopLabYellow";
        } else if (choosecolor <= 70) {
            return "Gray";
        } else if (choosecolor <= 85) {
            return "Dark Gray";
        }
        return "Dark Blue";
    }

    public static Fish[] randomfish(int len) {
        Fish[] fish = new Fish[len];
        for (int i = 0; i < fish.length; i++) {
            int chooseFish = rand(0, 1);
            if (chooseFish == 0) {
                fish[i] = initShark();
            } else {
                fish[i] = initWhale();
            }
        }
        return fish;
    }
}
