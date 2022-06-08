package Test.Random.TestOOP;

public class SchoolStatistics {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        Teacher t4 = new Teacher();
        Teacher t5 = new Teacher();
        Teacher t6 = new Teacher();
        Teacher t7 = new Teacher();
        Teacher t8 = new Teacher();
        Teacher t9 = new Teacher();
        Teacher t10 = new Teacher();
        Teacher[] teachers = {t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        //System.out.println(teachers);
        //System.out.println("---------");
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student[] students = {s1, s2, s3, s4, s5};
        //System.out.println(students);
        ClassRoom c1 = new ClassRoom();
        ClassRoom c2 = new ClassRoom();
        ClassRoom c3 = new ClassRoom();
        ClassRoom[] classRooms = {c1, c2, c3};
        //System.out.println(c1);

        School SC1 = new School();
        //System.out.println(SC1);

        //System.out.println(s1);

        ConstantFactory.printTeachers(teachers);
        ConstantFactory.printStudent(students);
        ConstantFactory.printClassRoom(classRooms);
        System.out.println(SC1);


    }
}
