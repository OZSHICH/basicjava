package Test.Random.eladoop;/*
Created by Elad on 24/02/2022

*/

public class Teacher extends Person {
    private String proffesion;

    public Teacher() {
    }

    public Teacher(String proffesion) {
        this.proffesion = proffesion;
    }

    public Teacher(String name, int age, String proffesion) {
        super(name, age);
        this.proffesion = proffesion;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = FactoryUtils.checkForProffesion(proffesion);
    }

    @Override
    public String toString() {
        return "Teacher: " + getName() +
                " proffesion: " + proffesion;
    }
}
