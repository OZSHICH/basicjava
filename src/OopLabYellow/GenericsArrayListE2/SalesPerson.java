package OopLabYellow.GenericsArrayListE2;

import java.util.regex.*;

public class SalesPerson extends Employee {
    private String certificationNumber;

    public SalesPerson(String name, int age, double salary, String certificationNumber)
            throws InvalidEmployeeSalaryExceptionSalesPerson {
        super(name, age, salary);
        this.certificationNumber = requireValidCertificationNumber(certificationNumber);
    }

    public String getCertificationNumber() {
        return certificationNumber;
    }

    public void setCertificationNumber(String certificationNumber) {
        this.certificationNumber = certificationNumber;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "certificationNumber='" + certificationNumber + '\'' +
                "} " + super.toString();
    }

    private static String requireValidCertificationNumber(String certificationNumber)
            throws InvalidEmployeeCertExceptionSalesPerson {

        if (certificationNumber.charAt(3) != '-') {
            System.out.println("char at index 3 needs to be hyphen");
        }
        if (certificationNumber.length() != 7) {
            System.out.println("certificationNumber needs to be 7 characters");
        }
        if (!certificationNumber.substring(0, 3).matches("\\d+")) {
            System.out.println("first 3 needs to be number ");
        }
        if (!certificationNumber.substring(4, 7).matches("[a-zA-Z]+")) {
            System.out.println("last 3 needs to be character");
        }
        return certificationNumber;
    }

    private static boolean requireValidCertificationNumber1(String certificationNumber) {
        //throws InvalidEmployeeCertExceptionSalesPerson {
        String part1 = certificationNumber.substring(0, 3);
        System.out.println(part1);
        char part2 = certificationNumber.charAt(3);
        System.out.println(part2);
        String part3 = certificationNumber.substring(4, 6);
        System.out.println(part3);

        boolean exp1 = Pattern.matches("[0-9]+", part1);
        System.out.println(exp1);
        boolean exp2 = part2 == '-';
        System.out.println(exp2);
        boolean exp3 = Pattern.matches("[a-zA-Z]+", part3);
        System.out.println(exp3);

        return exp1 && exp2 && exp3;

    }

}


//certificationNumber.matches("\\d{3}-\\s{3}");


