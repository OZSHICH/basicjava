package OopLabPurple.OopLabPurpleDogGarden;

import static OopLabPurple.OopLabPurpleDogGarden.DogFactory.*;

public class test {
    public static void main(String[] args) {
        DogGarden d1 = initDogGarden();
        DogGarden d2 = new DogGarden(d1);
        System.out.println(d2);

    }
}
