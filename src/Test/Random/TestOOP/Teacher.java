package Test.Random.TestOOP;

import static Test.Random.TestOOP.ConstantFactory.*;

public class Teacher extends Person {
    private String profession = randomProfession();
    ;

    public Teacher() {
    }

    public Teacher(String profession) {
        this.profession = profession;
    }

    public Teacher(Person other, String profession) {
        super(other);
        this.profession = profession;
    }

    public Teacher(String name, int age, String profession) {
        super(name + (count++), age);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "profession=" + profession +
                '}';
    }
}
