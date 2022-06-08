package OopLabOrange.OopLabOrangeEncaspsulationFlight;

import java.time.*;

public class Person {
    private String name = "Moshe";
    private LocalDate birthday = LocalDate.now();

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String display() {
        Period p1 = Period.between(birthday, LocalDate.now());
        if (p1.getDays() == 0 && p1.getMonths() == 0) {
            return String.format("%s Age: %s Years exactly!", name, p1.getYears());
        } else if (p1.getDays() == 0) {
            return String.format("%s Age: %s Years and %s Months", name, p1.getYears(), p1.getMonths());
        }
        return String.format("%s Age: %s Years, %s Months and %s days", name, p1.getYears(), p1.getMonths(), p1.getDays());
    }
}
