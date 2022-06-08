package OopLabPurple.OopLabPurpleGroup;

import java.util.*;

public class Group {

    private static int count = 1;
    private int id = count;
    private Person[] people;
    private String name = "Group " + (count++);


    public Group() {
        this.people = new Person[10];
    }

    public Group(Person[] people) {
        this.people = people;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Group.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", people=" + Arrays.toString(people) +
                ", name='" + name + '\'' +
                '}';
    }

    //TODO check boolean
    public int healthScore() {
        int countSmokers = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].isSmoking()) {
                countSmokers++;
            }
        }
        return countSmokers;
    }
}
