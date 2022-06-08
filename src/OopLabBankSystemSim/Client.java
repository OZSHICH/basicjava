package OopLabBankSystemSim;

public abstract class Client extends Person {
    private float interstRate;
    private Account account;

    public Client(float interstRate, Account account) {
        this.interstRate = interstRate;
        this.account = account;
    }

    public float getInterstRate() {
        return interstRate;
    }

    public void setInterstRate(float interstRate) {
        this.interstRate = interstRate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Client{" +
                "interstRate=" + interstRate +
                ", account=" + account +
                "} " + super.toString();
    }
//    public static double getBalance(Client client) {
//        return client.getAccount().getBalance();
//    }

}
