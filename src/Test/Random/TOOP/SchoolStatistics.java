package Test.Random.TOOP;

public class SchoolStatistics {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(FactUtils.randprofession());
        Student s1 = new Student();
        Student s2 = new Student();
        ClassRoom c1 = new ClassRoom();

        System.out.println(t1 + " \n" + s1 + " \n " + s2 + " \n " + c1);
    }
}
