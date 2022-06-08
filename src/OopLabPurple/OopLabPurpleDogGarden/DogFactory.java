package OopLabPurple.OopLabPurpleDogGarden;

import static OopLabPurple.OopLabPurpleDogGarden.ConstantFactory.*;

public class DogFactory {

    public static Dog initdog() {
        Dog d1 = new Dog();
        d1.setName(randomDogName());
        d1.setWeight(randomWeight());
        d1.setColor(randomColor());
        d1.setVaccinated(randomisvaccinated());

        return d1;
    }


    public static Dog[] initdogs(int len) {
        Dog[] dogs = new Dog[len];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = initdog();

        }
        return dogs;
    }

    public static DogWalker initDogWalker(String name) {
        DogWalker d1 = new DogWalker();
        d1.setName(name);
        d1.setDogs(initdogs(5));

        return d1;
    }

    public static DogWalker[] initDogWalkers(int len) {
        DogWalker[] dogWalkers = new DogWalker[len];
        for (int i = 0; i < dogWalkers.length; i++) {
            dogWalkers[i] = initDogWalker(randomHumanName());
        }
        return dogWalkers;

    }

    public static DogGarden initDogGarden() {
        DogGarden d1 = new DogGarden();
        d1.setName(randomGardenName());
        d1.setDogWalker(initDogWalkers(25));

        return d1;
    }

}

