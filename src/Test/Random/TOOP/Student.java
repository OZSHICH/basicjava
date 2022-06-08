package Test.Random.TOOP;

public class Student extends Person {
    private static Grade[] grades = FactUtils.randGrade();

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public static Grade[] getGrades() {
        return grades;
    }

    public static void setGrades(Grade[] grades) {
        Student.grades = grades;
    }

}
