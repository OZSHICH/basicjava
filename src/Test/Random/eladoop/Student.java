package Test.Random.eladoop;/*
Created by Elad on 24/02/2022

*/

import java.util.*;

public class Student extends Person {
    private Grade[] grades = FactoryUtils.initGrades();

    public Student() {
    }

    public Student(Grade[] grades) {
        this.grades = grades;
    }

    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        this.grades = grades;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student " + getName() + " age: " + getAge() +
                ", grades: " + Arrays.toString(grades) + "\n\n";
    }
}
