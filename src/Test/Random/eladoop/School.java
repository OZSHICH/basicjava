package Test.Random.eladoop;/*
Created by Elad on 24/02/2022

*/

import java.util.*;

public class School {
    ClassRoom[] classRooms = FactoryUtils.initClassRooms(5);

    public School() {
    }

    public School(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    @Override
    public String toString() {
        return "School:\n" +
                "classRooms=" + Arrays.toString(classRooms);
    }
}
