package OopLabYellow.GenericsArrayListE2;

public class Test {
    public static void main(String[] args) throws InvalidEmployeeSalaryExceptionSalesPerson {
        SalesPerson s1 = null;
        try {
            s1 = new SalesPerson("Tomer", 25, 23000, "575-THD");
        } catch (InvalidEmployeeCertExceptionSalesPerson e) {
            System.out.println(e.getMessage());
        }
        SalesPerson s2 = new SalesPerson("Tom", 25, 35000, "476-UHL");
        SalesPerson s3 = new SalesPerson("omer", 25, 18000, "365-FHK");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }


}
