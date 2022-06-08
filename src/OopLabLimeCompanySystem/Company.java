package OopLabLimeCompanySystem;

import java.io.*;
import java.util.*;

public class Company extends SalaryUpdate {
    private static Company instance;

    static {
        try {
            instance = new Company();
        } catch (CompanySystemException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private final List<Employee> employees = new LinkedList<>();
    //SalaryUpdate thread = new SalaryUpdate();

    private Company() throws CompanySystemException, IOException, ClassNotFoundException {
        employees.addAll(FactoryUtils.initEmployees());
        Thread t1 = new Thread(new SalaryUpdate());
        t1.start();
        storeEmployeeData();

        loadEmployeeDate();


    }

    public static Company getInstance() {
        return instance;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) throws CompanySystemException {
        //try {
        if (employees.contains(employee)) {
            throw new CompanySystemException(Error.EMPLOYEE_ALREADY_EXIST.getMessage());
        }
        employees.add(employee);
//        } catch (Exception e) {
//            System.out.println(Error.EMPLOYEE_ALREADY_EXIST);
//        }


    }

    private void loadEmployeeDate() throws IOException, ClassNotFoundException, CompanySystemException {
        try {
            ObjectInputStream out = new ObjectInputStream(new FileInputStream("emp.data"));
            List<Employee> data = (List<Employee>) out.readObject();
            for (Employee employee : data) {
                System.out.println(employee);
            }
        } catch (IOException e) {
            throw new CompanySystemException(Error.FILE_READ_PROBLEM.getMessage());
        }

    }

    private void storeEmployeeData() throws IOException, CompanySystemException {
        try {
            ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("emp.data"));
            in.writeObject(employees);
            in.close();
        } catch (IOException e) {
            throw new CompanySystemException(Error.FILE_WRITE_PROBLEM.getMessage());
        }
    }

    public void removeEmployee(Employee employee) throws CompanySystemException {
        //try {
        if (!employees.contains(employee)) {
            throw new CompanySystemException(Error.EMPLOYEE_NOT_FOUND.getMessage());
        }
        employees.remove(employee);
//        } catch (Exception e) {
//            System.out.println(Error.EMPLOYEE_NOT_FOUND);
//        }
    }

    public void display() {
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double getAverageSalaray() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
//        try {
//            for (Employee employee : employees) {
//                if (employees == null) {
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(Error.NULL_OR_EMPTY);
//        }
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {

            count++;
            sum += employee.getSalary();
        }
        return sum / count;
    }

    public double getManagementAverageSalaray() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
//        try {
//            for (Employee employee : employees) {
//                if (employees == null) {
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(Error.NULL_OR_EMPTY);
//        }
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                count++;
                sum += employee.getSalary();
            }

        }
        return sum / count;
    }

    public double getMonthlyPayment() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
//        try {
//            for (Employee employee : employees) {
//                if (employees == null) {
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(Error.NULL_OR_EMPTY);
//        }
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public double getYearlyPayment() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
//        try {
//            for (Employee employee : employees) {
//                if (employees == null) {
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(Error.NULL_OR_EMPTY);
//        }
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum * 12;
    }

    public double getTotalNumOfEmployees() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
//        try {
//            for (Employee employee : employees) {
//                if (employees == null) {
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(Error.NULL_OR_EMPTY);
//        }

        //return employees.size(); עוד אופציה עדיפה
        int count = 0;
        for (Employee employee : employees) {
            count++;
        }
        return count;
    }

    public double getTotalNumOfManagers() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
//        try {
//            for (Employee employee : employees) {
//                if (employees == null) {
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(Error.NULL_OR_EMPTY);
//        }
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                count++;
            }
        }
        return count;
    }

}
