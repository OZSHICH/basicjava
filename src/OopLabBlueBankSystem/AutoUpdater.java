package OopLabBlueBankSystem;

import java.util.*;

public class AutoUpdater implements Runnable {

    private List<Client> clients;

    public AutoUpdater(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void run() {
        while (true) {
//            for (int i = 0; i < clients.size(); i++) {
//                clients.autoUpdateAccount();
//            }
            for (Client clients : clients) {
                clients.autoUpdateAccount();
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

