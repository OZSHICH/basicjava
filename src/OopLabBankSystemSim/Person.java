package OopLabBankSystemSim;

import java.util.*;

public class Person {
    private static int count = 1;
    //todo id autoincrement
    private int id = count;
    //todo name autoincrement
    private String name = "Clint " + count++;
    //todo age random number,min/max ולהשתמש בפונקציה מוכנה מראש
    private double age = FactoryUtils.ranNumber(16, 120);

    public static int getIdcount() {
        return count;
    }

    public static void setIdcount(int idcount) {
        Person.count = idcount;
    }

    public static int getNamecount() {
        return count;
    }

    public static void setNamecount(int namecount) {
        Person.count = namecount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

