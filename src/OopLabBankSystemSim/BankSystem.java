package OopLabBankSystemSim;

import OopLabBlueBankSystem.WithdrawException;

import java.time.*;
import java.util.*;

import static OopLabBankSystemSim.FactoryUtils.*;

public class BankSystem {

    private Set<Client> clients = new TreeSet<>(new Comparator<Client>() {
        @Override
        public int compare(Client c1, Client c2) {
            if (c1.getAccount().getBalance() > c2.getAccount().getBalance()) {
                return 1;
            } else if (c1.getAccount().getBalance() < c2.getAccount().getBalance()) {
                return -1;
            } else if (c1.getId() > c2.getId()) {
                return 1;
            } else if (c1.getId() < c2.getId()) {
                return -1;
            }
            return 0;
        }
    });
    private InterestTask task = new InterestTask(clients);
    private static Scanner sc = new Scanner(System.in);
    private boolean continueProgram = true;

    public BankSystem() {
        //todo Create new thread that run task.
        Thread thread = new Thread(new InterestTask(clients));
        thread.start();
    }

    public InterestTask getTask() {
        return task;
    }

    public void setTask(InterestTask task) {
        this.task = task;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        BankSystem.sc = sc;
    }

    public boolean isContinueProgram() {
        return continueProgram;
    }

    public void setContinueProgram(boolean continueProgram) {
        this.continueProgram = continueProgram;
    }

    public void showMenu() {
        System.out.println("to add account press 1");
        System.out.println("to delete account press 2");
        System.out.println("to withdraw money press 3");
        System.out.println("to deposit money press 4");
        System.out.println("to print all clients press 5");
        System.out.println("to print richest client press 6");
        System.out.println("to print poorest client press 7");
        System.out.println("to print the amount of money in the bank press 8");
        System.out.println("to exit press 9");
        System.out.println("Please choose your action");
    }

    public void startSystem() throws DeleteException, WithdrawException {
        int choice = 0;
        do {
            List<Person> clintsList = new ArrayList<>(clients);
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please choose type of client ‘R’ for Regular client and ‘V’ for Vip  client");
                    char clientType = sc.next().charAt(0);
                    if (clientType == 'R') {
                        addClient(initRegClient());
                    } else if (clientType == 'V') {
                        addClient(initVipClient());
                    } else {
                        System.out.println("Illegal input");
                    }
                    break;

                case 2:
                    System.out.println("Please enter client id to delete: ");
                    deleteClient(sc.nextInt());
                    break;

                case 3:
                    System.out.println("Please enter amount to withdraw: ");
                    withdraw(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Please enter amount to deposit: ");
                    deposit(sc.nextInt());
                    break;

                case 5:
                    printAll();
                    break;

                case 6:
                    System.out.println(BankStatistics.getRichestClient(clintsList));
                    break;

                case 7:
                    System.out.println(BankStatistics.getPoorestClient(clintsList));
                    break;

                case 8:
                    System.out.println(BankStatistics.getBankBalance(clients));

                    break;

                case 9:
                    continueProgram = false;
                    endSystem();

                    break;

                default:
                    System.out.println("This is not a valid Menu Option! Please Select Again");
                    break;
            }
        } while (choice != 9);

    }

    public void endSystem() {
        System.out.println("Thank you and goodbye");
    }


    public void addClient(Client client) {
        //addClient(client);
        clients.add(client);
    }

    public void deleteClient(int id) throws DeleteException {
        for (Client client : clients) {
            if (client.getId() == id) {
                if (client.getAccount().getBalance() > 0) {
                    clients.remove(client);
                    return;
                }
                throw new DeleteException("Unable to delete client, before paying his debt ", Date.from(Instant.now()), id, client.getName(), client.getAccount().getBalance());
            }
        }
        System.out.println("Client does not exist");
    }

    public void withdraw(double amount) throws WithdrawException {
        System.out.println("Please insert your client id");
        int id = sc.nextInt();
        for (Client client : clients) {
            if (client.getId() == id) {
                if (client.getAccount().getBalance() > amount) {
                    client.getAccount().setBalance(client.getAccount().getBalance() - amount);
                    return;
                }
                throw new WithdrawException("Cannot withdraw more than balance", Date.from(Instant.now()), id, client.getName(), client.getAccount().getBalance());
            }
        }
        System.out.println("Client does not exist");
    }

    public void deposit(double amount) {
        System.out.println("Please insert your client id");
        int id = sc.nextInt();
        for (Client client : clients) {
            if (client.getId() == id) {
                client.getAccount().setBalance(client.getAccount().getBalance() + amount);
                return;
            }
        }
        System.out.println("Client does not exist");
    }


    public void printAll() {
        for (Client client : clients) {
            System.out.println(client);

        }
    }
}


