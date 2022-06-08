package OopLabPurple.OopLabPurpleDogGarden;

import java.util.Arrays;

public class DogWalker {
    private String name;
    //TODO Attributes to arr
    private Dog[] dogs = new Dog[5];

    public DogWalker() {
    }

    public DogWalker(DogWalker other) {
        this.name = other.name;
        this.dogs = other.dogs;
    }

    public DogWalker(String name, Dog[] dogs) {
        this.name = name;
        this.dogs = dogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "\nDogWalker{" +      //           \n מוריד שורה
                "name='" + name + '\'' +
                ", \ndogs=" + Arrays.toString(dogs) +
                '}';
    }
}


