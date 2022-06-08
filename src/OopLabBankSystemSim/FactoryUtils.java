package OopLabBankSystemSim;

public class FactoryUtils {
    public static double ranNumber(double min, double max) {
        return (double) (Math.random() * (max - min + 1)) + min;
    }

    public static int ranNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static Client initRegClient() {
        return new RegularClient(5, initAccount());
    }

    public static Client initVipClient() {
        return new VipClient(10, initAccount());
    }

    public static Account initAccount() {
        Account a1 = new Account();
        a1.setBalance((int) (Math.random() * 5000));
        return a1;
    }
}


