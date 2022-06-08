package OopLabBankSystemSim;

import java.util.*;

public class BankStatistics {
    public static int countMembers(BankSystem bankSystem) {
        return bankSystem.getClients().size();
    }

    public static double getBankBalance(Set<Client> clients) {
        double sum = 0;
        for (Client client : clients) {
            sum += client.getAccount().getBalance();
        }
        return sum;
    }

    public static Client getRichestClient(List<Person> clients) {
        return (Client) (clients.get(clients.size() - 1));
    }

    public static Client getPoorestClient(List<Person> clients) {
        return (Client) (clients.get(0));
    }
}
