package OopLabBankSystemSim;

import java.util.*;

public class InterestTask implements Runnable {
    private Set<Client> clients = new TreeSet<>();

    //todo
    public InterestTask(Set<Client> clients) {
        this.clients = clients;
    }

    @Override
    //todo
    public void run() {
        // todo Print a message when the thread started running.
        System.out.println("Thread is running");
        while (true) {

            try {
                //todo Print the client id, name and client balance after the
                //update.
                //• Sleep for 24 hours
                Thread.sleep(1000 * 60 * 60 * 24);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//todo Print the client id, name and client balance after the
//update.
            for (Client client : clients) {
                client.getAccount().setBalance(client.getAccount().getBalance() * (1 + client.getInterstRate() / 100));
                System.out.println(client);
            }
            System.out.println("The account has been updated");

        }
    }
}

