package Test.Random.TOOP;

import java.util.*;

public class FactUtils {
    static Random random = new Random();
    public static int Teachercount = 0;
    public static int Studentcount = 0;
    public static int Classtcount = 0;


    private static String[] professions = {"math", "chemistry",
            "geography", "literature", "physics", "sports"};

    public static String randprofession() {
        String profession = professions[(random.nextInt(6))];
        return profession;
    }

    public static Grade[] randGrade() {
        Grade[] grades = new Grade[6];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = new Grade(professions[i], random.nextInt(60) + 40);
        }
        return grades;
    }

    public static Student Newstudent() {
        return new Student("Student" + Studentcount++, random.nextInt(101) + 20);
    }

    public static Student[] Newstudents(int len) {
        Student[] students = new Student[len];
        for (int i = 0; i < students.length; i++) {
            students[i] = Newstudent();
        }
        return students;
    }

}
