package OopLabBlueBankSystem;

public class GoldClient extends Client {

    public GoldClient(int idClient, String lastName, String firstName) {
        super(idClient, lastName, firstName, 2.0, 0.3);
    }


    @Override
    public void draw() {
        System.out.println("" +
                " ██████╗  ██████╗ ██╗     ██████╗  ██████╗██╗     ██╗███████╗███╗   ██╗████████╗\n" +
                "██╔════╝ ██╔═══██╗██║     ██╔══██╗██╔════╝██║     ██║██╔════╝████╗  ██║╚══██╔══╝\n" +
                "██║  ███╗██║   ██║██║     ██║  ██║██║     ██║     ██║█████╗  ██╔██╗ ██║   ██║   \n" +
                "██║   ██║██║   ██║██║     ██║  ██║██║     ██║     ██║██╔══╝  ██║╚██╗██║   ██║   \n" +
                "╚██████╔╝╚██████╔╝███████╗██████╔╝╚██████╗███████╗██║███████╗██║ ╚████║   ██║   \n" +
                " ╚═════╝  ╚═════╝ ╚══════╝╚═════╝  ╚═════╝╚══════╝╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝   \n" +
                "                                                                                ");

    }

    @Override
    public String toString() {
        return "GoldClient{" +
                "commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                "} " + super.toString();
    }
}
