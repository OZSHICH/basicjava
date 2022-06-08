package OopLabBlueBankSystem;

import java.util.*;

public class Bank {
    private static final int MAX_SIZE = 5;
    private final String name = "John Bryce Bank";
    private List<Client> clients = new ArrayList<>();
    private static Bank instance = new Bank();
    private static double totalCommission;

    private Bank() {
        startAccountUpdater();
    }

    public static Bank getInstance() {
        return instance;
    }

    public static void setInstance(Bank instance) {
        Bank.instance = instance;
    }

    public String getName() {
        return name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public static double getTotalCommission() {
        return totalCommission;
    }

    public static void setTotalCommission(double totalCommission) {
        Bank.totalCommission = totalCommission;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }

    public void addClient(Client client) {
        if (clients.contains(client)) {
            System.out.println("Client already exist");
            return;
        }
        if (clients.size() == MAX_SIZE) {
            addClient(client);
            System.out.println("Client added successfull");
        } else {

            System.out.println("there is no space for new client");
        }
        Log log = new Log(client.getIdClient(), "addClient", client.getFortune());
        Logger.getInstance().addLog(log);
    }

    public void removeClient(Client client) {
        if (clients.contains(client)) {
            System.out.println("Client does not exist");
            return;
        }
        Log log = new Log(client.getIdClient(), "removeClient", client.getFortune());
        Logger.getInstance().addLog(log);
    }

    public Client findClientId(int id) {
        for (Client client : clients) {
            if (client != null && client.getIdClient() == id) {
                return client;
            }
        }
        return null;

    }

    public void viewLogs() {
        Logger.getInstance().display();
    }

    public double getFortune() {
        double sumClients = totalCommission;
        for (Client client : clients) {
            if (client != null) {
                sumClients += client.getFortune();
            }
        }
        return sumClients;
    }

    public void startAccountUpdater() {
        Thread t1 = new Thread(new AutoUpdater(clients));
        t1.start();


    }

    public static double updateTotalCommission(double Commission) {

        return totalCommission += Commission;

    }

}
