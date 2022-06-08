package Test.Random.TOOP;

public class School {
    private static ClassRoom[] classRooms;

    public School() {
    }

    public static ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public static void setClassRooms(ClassRoom[] classRooms) {
        School.classRooms = classRooms;
    }

}
