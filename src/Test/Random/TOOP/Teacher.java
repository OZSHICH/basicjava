package Test.Random.TOOP;

public class Teacher extends Person {
    private String Profession;

    public Teacher(String profession) {
        Profession = profession;
    }

    public Teacher(String name, int age, String profession) {
        super(name, age);
        Profession = profession;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Profession='" + Profession + '\'' +
                '}';
    }
}
