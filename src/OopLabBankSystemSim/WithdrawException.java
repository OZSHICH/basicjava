package OopLabBankSystemSim;

import java.util.*;

public class WithdrawException extends Exception {
    private Date timeStamp;

    public WithdrawException(String message, Date timeStamp, int clientId, String clientName, double balance) {
        super(message);
        this.timeStamp = timeStamp;
    }
}
