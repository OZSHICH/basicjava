package OopLabBlueBankSystem;

public class PlatinumClient extends Client {

    public PlatinumClient(int idClient, String lastName, String firstName) {
        super(idClient, lastName, firstName, 1.0, 0.5);
    }

    @Override
    public void draw() {
        System.out.println("" +
                "██████╗ ██╗      █████╗ ████████╗██╗███╗   ██╗██╗   ██╗███╗   ███╗ ██████╗██╗     ██╗███████╗███╗   ██╗████████╗\n" +
                "██╔══██╗██║     ██╔══██╗╚══██╔══╝██║████╗  ██║██║   ██║████╗ ████║██╔════╝██║     ██║██╔════╝████╗  ██║╚══██╔══╝\n" +
                "██████╔╝██║     ███████║   ██║   ██║██╔██╗ ██║██║   ██║██╔████╔██║██║     ██║     ██║█████╗  ██╔██╗ ██║   ██║   \n" +
                "██╔═══╝ ██║     ██╔══██║   ██║   ██║██║╚██╗██║██║   ██║██║╚██╔╝██║██║     ██║     ██║██╔══╝  ██║╚██╗██║   ██║   \n" +
                "██║     ███████╗██║  ██║   ██║   ██║██║ ╚████║╚██████╔╝██║ ╚═╝ ██║╚██████╗███████╗██║███████╗██║ ╚████║   ██║   \n" +
                "╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝ ╚═════╝╚══════╝╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝   \n" +
                "                                                                                                                ");

    }

    @Override
    public String toString() {
        return "PlatinumClient{" +
                "commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                "} " + super.toString();
    }
}
