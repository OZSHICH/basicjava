package OopLabLimeCompanySystem;

import java.util.*;

public class FactoryUtils {
    //TODO random int number between min and max
    public static int randNum(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    //TODO random double number between min and max
    public static double randNumD(double min, double max) {
        return Math.random() * (max - min + 1) + min;
    }

    //TODO random Salary number between min and max
    public static double randSalary2(Class<?> clazz) {
        if (clazz.equals(Secretary.class)) {
            return FactoryUtils.randNumD(7000, 8000);
        }
        if (clazz.equals(Engineer.class)) {
            return FactoryUtils.randNumD(9000, 11000);
        }
        if (clazz.equals(Director.class)) {
            return FactoryUtils.randNumD(18000, 35000);
        }
        if (clazz.equals(Manager.class)) {
            return FactoryUtils.randNumD(12000, 15500);
        }
        return 0;
    }


    public static double randSalary(Employee employee) {
        if (employee instanceof Secretary) {
            return FactoryUtils.randNumD(7000, 8000);
        }
        if (employee instanceof Engineer) {
            return FactoryUtils.randNumD(9000, 11000);
        }
        if (employee instanceof Director) {
            return FactoryUtils.randNumD(18000, 35000);
        }
        if (employee instanceof Manager) {
            return FactoryUtils.randNumD(12000, 15500);
        }
        return 0;
    }

    public static List<Employee> initEmployees() {
        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(Name.getRandName(), randSalary2(Employee.class)));
//        employees.add(new Employee(Name.getRandName(), randSalary2(Employee.class)));
//        employees.add(new Employee(Name.getRandName(), randSalary2(Employee.class)));
        employees.add(new Secretary(Name.getRandName(), randSalary2(Secretary.class), "HR"));
        employees.add(new Secretary(Name.getRandName(), randSalary2(Secretary.class), "HR"));
        employees.add(new Manager(Name.getRandName(), randSalary2(Manager.class), "Management"));
        employees.add(new Manager(Name.getRandName(), randSalary2(Manager.class), "Management"));
        employees.add(new Director(Name.getRandName(), randSalary2(Director.class), "Management", "Company"));
        employees.add(new Engineer(Name.getRandName(), randSalary2(Engineer.class), "Engineering"));
        employees.add(new Engineer(Name.getRandName(), randSalary2(Engineer.class), "Engineering"));
        employees.add(new Engineer(Name.getRandName(), randSalary2(Engineer.class), "Engineering"));
        employees.add(new Engineer(Name.getRandName(), randSalary2(Engineer.class), "Engineering"));
        employees.add(new Engineer(Name.getRandName(), randSalary2(Engineer.class), "Engineering"));

        return employees;
    }
}
