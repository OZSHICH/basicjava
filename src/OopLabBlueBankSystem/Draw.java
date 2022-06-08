package OopLabBlueBankSystem;

public class Draw extends Client {
    public Draw(int idClient, String lastName, String firstName, double commissionRate, double interestRate) {
        super(idClient, lastName, firstName, commissionRate, interestRate);
    }

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return "Draw{" +
                "commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                '}';
    }
}
