package OopLabLimeCompanySystem;

import java.time.*;

public class Helper {
//    public static double avgSalary(List<Employee> employees) {
//        double sum = 0;
//        for (Employee employee : employees) {
//            sum += employee.getSalary();
//        }
//        return sum / employees.size();
//    }
//
//    public static double avgManagementSalary(List<Employee> employees) {
//        double sum = 0;
//        int count = 0;
//        for (Employee employee : employees
//        ) {
//            if (employee instanceof Manager) {
//                sum += employee.getSalary();
//                count++;
//            }
//        }
//        return sum / count;
//
//    }
//
//    public static void display(List<Employee> employees) {
//        System.out.println("--------------Employee List-------------");
//        for (Employee emp : employees
//        ) {
//            System.out.println(emp);
//
//        }
//        System.out.println("--------------Employee List-------------");
//    }

    public static void report() throws CompanySystemException {
        Company c = Company.getInstance();

        System.out.println("number of employees : " + c.getTotalNumOfEmployees());
        System.out.println("number of managers : " + c.getTotalNumOfManagers());
        System.out.println("total monthly payment : " + c.getMonthlyPayment());
        System.out.println("total yearly payment : " + c.getYearlyPayment());
        System.out.println("average salary : " + c.getAverageSalaray());
        System.out.println("average salary of Managers : " + c.getManagementAverageSalaray());


    }
//יש להדפיס בתוך Class ולעשות Import

    public static String formatDateAndTime(LocalDateTime localDateTime) {
        int day = localDateTime.getDayOfMonth();
        int month = localDateTime.getMonthValue();
        int year = localDateTime.getYear();
        int hours = localDateTime.getHour();
        int minutes = localDateTime.getMinute();
        int seconds = localDateTime.getSecond();

        return String.format("%02d/%02d/%04d %02d:%02d:%02d", day, month, year, hours, minutes, seconds);
    }
}