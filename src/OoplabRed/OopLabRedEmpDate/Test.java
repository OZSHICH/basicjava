package OoplabRed.OopLabRedEmpDate;

public class Test {
    public static void main(String[] args) {
        Date birth = new Date(18, 3, 1994);
        Date hire = new Date(28, 12, 2021);
        Emp e1 = new Emp("Oz", "Shich", birth, hire);

        System.out.println(e1);


    }
}
