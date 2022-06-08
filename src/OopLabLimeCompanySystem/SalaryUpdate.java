package OopLabLimeCompanySystem;

public class SalaryUpdate implements Runnable {

    @Override
    public void run() {
        Company company = Company.getInstance();
        try {
            double avg = company.getAverageSalaray();
            while (avg < 15000) {
                company.display();
                System.out.println(avg);
                for (Employee employee : company.getEmployees()) {
                    employee.setSalary(employee.getSalary() * 1.02);
                }
                avg = company.getAverageSalaray();
                Thread.sleep(2000);
            }
        } catch (CompanySystemException e) {
            e.printStackTrace();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        company.display();
        try {
            System.out.println(company.getAverageSalaray());
        } catch (CompanySystemException e) {
            e.printStackTrace();
        }
        System.out.println("NOW EVERYBODY HAPPY");
    }
}


