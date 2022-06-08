package OopLabBlueBankSystem;

import java.util.*;

public abstract class Client {
    private static final int MAX_SIZE = 5;
    private int idClient;
    private String lastName;
    private String firstName;
    private final List<Account> accounts = new ArrayList<>();
    protected double commissionRate;
    protected double interestRate;

    public Client(int idClient, String lastName, String firstName, double commissionRate, double interestRate) {
        this.idClient = idClient;
        this.lastName = lastName;
        this.firstName = firstName;
        this.commissionRate = commissionRate;
        this.interestRate = interestRate;
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", accounts=" + accounts +
                ", commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idClient == client.idClient;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient);
    }


    public void addAccount(Account account) {
        //if (account != null && account.getAccountId() == account.getAccountId()) {
        if (accounts.contains(account)) {
            System.out.println("Account id already exist");
            return;
        }
        if (accounts.size() == MAX_SIZE) {
            System.out.println("there is no space for new account");
        } else
            accounts.add(account);
        System.out.println("Account added successfully");
        Log log = new Log(account.getAccountId(), "addAccount", account.getBalance());
        Logger.getInstance().addLog(log);

    }

    public void removeAccount(Account account) {
        //if (account != null && account.getAccountId() == account.getAccountId()) {
        if (accounts.contains(account)) {
            accounts.remove(account);
            System.out.println("Account removed successfully");
            Log log = new Log(account.getAccountId(), "removeAccount", account.getBalance());
            Logger.getInstance().addLog(log);
            return;
        } else System.out.println("Account does not exist");


    }

    public Account findAccountById(int id) {
        for (Account account : accounts) {
            if (account != null && account.getAccountId() == id) {

                return account;
            }
        }
        return null;
    }

    public void deposit(Account account, double amount) {
        if (!accounts.contains(account)) {
            System.out.println("Account does not exist");
            return;
        }
        double currentBalance = account.getBalance();
        double commission = amount * this.commissionRate / 100;
        account.setBalance(currentBalance + amount - commission);
        Bank.updateTotalCommission(commission);
        System.out.println("Deposit successfully");
        Log log = new Log(account.getAccountId(), "Deposit", amount);
        Logger.getInstance().addLog(log);

    }


    public void withdraw(Account account, double amount) throws WithdrawException {
        if (accounts.contains(account)) {
            System.out.println("Account does not exist");
            return;
        }
        double currentBalance = account.getBalance();
        double commission = amount * this.commissionRate / 100;
        if (currentBalance < amount + commissionRate) {
            System.out.println("No Overdraft");
            throw new WithdrawException(account.getAccountId(), account.getBalance(), amount);
        } else
            account.setBalance(currentBalance - amount - commission);
        Bank.updateTotalCommission(commission);
        System.out.println("Withdraw successfully");
        Log log = new Log(account.getAccountId(), "Withdraw", amount);
        Logger.getInstance().addLog(log);

    }
    

    public double getFortune() {
        double sumBalance = 0;
        for (Account account : accounts) {
            if (account != null && account.getBalance() != 0) {
                sumBalance += account.getBalance();
            }
        }
        return sumBalance;
    }

    public void autoUpdateAccount() {
        for (int i = 0; i < accounts.size(); i++) {
            double currentBalance = accounts.get(i).getBalance();
            double interest = currentBalance * (interestRate) / 100;
            accounts.get(i).setBalance(currentBalance + interest);
            Log log = new Log(accounts.get(i).getAccountId(), "UpdateAccount", accounts.get(i).getBalance());
            Logger.getInstance().addLog(log);
        }
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public void fullReport() {
        System.out.println(getIdClient() + "\n" + getFullName() + "\n" + getCommissionRate() + "\n" + getInterestRate() + "\n" + getClass().getName());
    }

    public abstract void draw();


}


