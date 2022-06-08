package Test.Random.TestOOP;

import static Test.Random.TestOOP.ConstantFactory.*;

public class Person {
    protected static int count = 1;
    private String name = randomName();
    private int age;

    public Person() {
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = randomAge();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
