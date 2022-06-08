package Test.Random.eladoop;/*
Created by Elad on 24/02/2022

*/

import java.util.*;

public class SchoolStatistics {
    private final static String[] proffesions = {"math", "chemistry",
            "geography", "literature", "physics", "sports"};

    public static void main(String[] args) {
        School s1 = FactoryUtils.initSchool();

        System.out.println(s1.toString());

        //1.
        totalAvg(s1);

        //2.
        System.out.println();
        classAverage(s1);

        //3.
        proffesionAvg(s1, proffesions);

        //Bonus 3.
        ageAvg(s1);

        //Bonus 4.
        mathPhysicsTeachers(s1);
    }

    public static void totalAvg(School school) {
        ClassRoom[] classRooms = school.getClassRooms();
        float totalScores = 0;

        for (int i = 0; i < classRooms.length; i++) {
            totalScores += classRooms[i].classRoomAvg();
        }

        System.out.printf("Total student average is: %.2f\n", totalScores / classRooms.length);
    }

    public static void classAverage(School school) {
        for (int i = 0; i < school.getClassRooms().length; i++) {
            System.out.printf("%s average score: %.2f\n", school.getClassRooms()[i].getName(), school.getClassRooms()[i].classRoomAvg());
        }
        System.out.println();
    }

    public static void proffesionAvg(School school, String[] proffesions) {
        for (int i = 0; i < proffesions.length; i++) {
            FactoryUtils.singleProffessionAvg(school, proffesions[i]);
        }
        System.out.println();
    }

    public static void ageAvg(School school) {
        float totalAge = 0;

        for (int i = 0; i < school.getClassRooms().length; i++) {
            totalAge += school.getClassRooms()[i].avgClassRoomAge();
        }

        System.out.printf("School average age is: %.2f\n", totalAge / school.getClassRooms().length);
    }

    public static void mathPhysicsTeachers(School school) {
        int countTeachers = 0;
        for (int i = 0; i < school.getClassRooms().length; i++) {
            String proffesion = school.getClassRooms()[i].getTeacher().getProffesion();
            if (Objects.equals(proffesion, "math") || Objects.equals(proffesion, "physics")) {
                countTeachers++;
            }
        }
        System.out.printf("Our school have %d Math and Physics teachers!\n", countTeachers);
    }


}
