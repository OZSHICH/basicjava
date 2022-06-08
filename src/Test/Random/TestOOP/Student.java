package Test.Random.TestOOP;

import java.util.*;

import static Test.Random.TestOOP.ConstantFactory.*;

public class Student extends Person {

    private Grade[] grades = ConstantFactory.initGrade();
    private String profession = randomProfession();


    public Student() {
    }


    public Student(Person other, Grade[] grades, String profession) {
        super(other);
        this.grades = grades;
        this.profession = profession;
    }

    public Student(String name, int age, Grade[] grades, String profession) {
        super(name, age);
        this.grades = grades;
        this.profession = randomProfession();
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + Arrays.toString(grades) +
                ", profession=" + profession +
                '}';
    }
}
