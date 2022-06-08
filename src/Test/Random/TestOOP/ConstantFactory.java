package Test.Random.TestOOP;

public class ConstantFactory {
    public static int randomAge() {
        int age = (int) (Math.random() * 100) + 20;
        return age;
    }

    public static int randomScore() {
        int score = (int) (Math.random() * 100) + 20;
        ;
        return score;
    }

    public static Grade[] initGrade() {
        Grade[] grades = new Grade[6];
        int grade = (int) (Math.random() * 100) + 40;
        return grades;
    }

    private static String[] names = {"Dor", "Tomer", "Or", "Tal", "Ido", "Bar"};

    public static String randomName() {
        String name = names[(int) (Math.random() * 6)];
        return name;
    }

    private static String[] professions = {"Math", "Chemistry", "Geography", "Literature", "Physics", "Sports"};

    public static String randomProfession() {
        String profession = professions[(int) (Math.random() * 6)];
        return profession;
    }

    public static void printStudent(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("------------------------------------");
    }

    public static void printTeachers(Teacher[] teachers) {
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i]);
        }
        System.out.println("------------------------------------");
    }

    public static void printClassRoom(ClassRoom[] classRooms) {
        for (int i = 0; i < classRooms.length; i++) {
            System.out.println(classRooms[i]);
        }
        System.out.println("------------------------------------");
    }

}


