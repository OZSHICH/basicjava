package OopLabBirthdaySystemReminder;

import java.time.*;
import java.util.*;

public class Person implements Comparable {
    private static int count = 1;

    private int id = count;
    private String name = "name" + count++;
    //public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private LocalDate birthday = DateFactory.getLocalDate();

    public Person() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
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
    //    public static DateTimeFormatter getFormatter() {
//        return formatter;
//    }
//
//    public static void setFormatter(DateTimeFormatter formatter) {
//        Person.formatter = formatter;
//    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Person p) {
        return this.getBirthday().getMonthValue() - p.getBirthday().getMonthValue();
    }
//    @Override
//    public int compareTo(Person p) {
//        return 0;
//    }


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
                ", birthday=" + DateUtil.BeautifyDate(birthday) +
                '}';
    }


}
