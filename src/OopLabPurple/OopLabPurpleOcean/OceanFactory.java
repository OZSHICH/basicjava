package OopLabPurple.OopLabPurpleOcean;

import static OopLabPurple.OopLabPurpleOcean.ConstantFactory.rand;

public class OceanFactory {

    public static Shark initShark() {
        return new Shark(rand(1000, 1500));
    }

    public static Whale initWhale() {
        return new Whale(rand(40, 130));
    }

    public static Fish initFish() {
        int chooseFish = rand(0, 1);
        if (chooseFish == 0) {
            return initShark();
        }
        return initWhale();
    }

    public static Fish[] init(int len) {
        Fish[] fish = new Fish[len];
        for (int i = 0; i < fish.length; i++) {
            fish[i] = initFish();
        }
        return fish;
    }
}