package Test.Random.eladoop;/*
Created by Elad on 24/02/2022

*/

import java.util.*;

public class ClassRoom {
    private String name;
    private Teacher teacher;
    private Student[] students = new Student[15];

    public ClassRoom() {
    }

    public ClassRoom(String name, Teacher teacher, Student[] students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom" +
                " name: " + name +
                ", ClassRoom " + teacher +
                ",\n students: " + Arrays.toString(students) + "\n\n";
    }

    public float classRoomAvg() {
        int gradeCounter = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].getGrades().length; j++) {
                gradeCounter += students[i].getGrades()[j].getScore();
            }
        }

        return (float) (gradeCounter / (float) students.length) / 6;
    }

    public float classRoomProffesionAvg(String proffession) {
        float gradeCounter = 0;

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].getGrades().length; j++) {
                if (Objects.equals(students[i].getGrades()[j].getProffesion(), proffession)) {
                    gradeCounter += students[i].getGrades()[j].getScore();
                }
            }
        }
        return gradeCounter / (float) students.length;
    }

    public float avgClassRoomAge() {
        float totalage = 0;

        for (int i = 0; i < students.length; i++) {
            totalage += students[i].getAge();
        }
        return totalage / students.length;
    }

}
