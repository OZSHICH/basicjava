package OopLabLimeCompanySystem;

import java.time.*;

public class Test {
    public static void main(String[] args) throws CompanySystemException {
        //Company company = Company.getInstance();
        Company.getInstance().display();
        try {
            Helper.report();
        } catch (CompanySystemException e) {
            System.out.println(e.getMessage());
            System.out.println(Helper.formatDateAndTime(LocalDateTime.now()));
        }

        //System.out.println(Helper.formatDateAndTime(LocalDateTime.now()));
    }
}
