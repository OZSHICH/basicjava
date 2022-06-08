package Test.Random.eladoop;/*
Created by Elad on 24/02/2022

*/

import java.util.*;

public class FactoryUtils {
    private final static String[] proffesions = {"math", "chemistry",
            "geography", "literature", "physics", "sports"};
    private final static Random random = new Random();
    private static int studentCount = 1;
    private static int teacherCount = 1;
    private static int classRoomCounter = 1;

    public static int getStudentCount() {
        return studentCount;
    }


    public static String checkForProffesion(String proffesion) {
        for (int i = 0; i < proffesions.length; i++) {
            if (proffesions[i].equals(proffesion)) {
                return proffesion;
            }
        }
        return "math";
    }

    public static Grade[] initGrades() {
        Grade[] grades = new Grade[6];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = new Grade(random.nextInt(61) + 40, proffesions[i]);
        }
        return grades;
    }

    public static Student initStudent() {
        return new Student("Student" + studentCount++, random.nextInt(101) + 20, initGrades());
    }

    public static Student[] initStudents(int len) {
        Student[] students = new Student[len];

        for (int i = 0; i < students.length; i++) {
            students[i] = initStudent();
        }
        return students;
    }

    public static Teacher initTeacher() {
        return new Teacher("Teacher" + teacherCount++, random.nextInt(101) + 20, proffesions[random.nextInt(6)]);
    }

    public static ClassRoom initClassRoom() {
        return new ClassRoom("ClassRoom" + classRoomCounter++, initTeacher(), initStudents(15));
    }

    public static ClassRoom[] initClassRooms(int len) {
        ClassRoom[] classRooms = new ClassRoom[len];

        for (int i = 0; i < classRooms.length; i++) {
            classRooms[i] = initClassRoom();
        }

        return classRooms;
    }

    public static School initSchool() {
        return new School(initClassRooms(5));
    }

    public static void singleProffessionAvg(School school, String proffesion) {
        float classRoomGradeCounter = 0;

        for (int i = 0; i < school.getClassRooms().length; i++) {
            classRoomGradeCounter += school.getClassRooms()[i].classRoomProffesionAvg(proffesion);
        }

        System.out.printf("%s average school score: %.2f\n", proffesion, classRoomGradeCounter / school.getClassRooms().length);
    }


}
