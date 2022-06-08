package OopLabYellow.GenericsArrayListE2;

public class Employee {
    private static final double MAXIMUM_SALARY = 40_000;
    private final String name;
    private final int age;
    private final double salary;

    public Employee(String name, int age, double salary) throws InvalidEmployeeSalaryExceptionSalesPerson {
        this.name = name;
        this.age = age;
//        if (salary>MAXIMUM_SALARY && salary<=0){
//            throw new InvalidEmployeeSalaryExceptionSalesPerson("salary out range");
//        }
//        else {
//            this.salary = salary;
//        }
        if (salary > MAXIMUM_SALARY) {
            throw new InvalidEmployeeSalaryExceptionSalesPerson("salary can't more than 40,000");
        } else if (salary <= 0) {
            throw new InvalidEmployeeSalaryExceptionSalesPerson("salary can't less than 0");
        } else {
            this.salary = salary;
        }
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
