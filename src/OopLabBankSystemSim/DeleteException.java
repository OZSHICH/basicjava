package OopLabBankSystemSim;

import java.util.*;

public class DeleteException extends Exception {
    private Date timeStamp;

    public DeleteException(String message, Date timeStamp, int clientId, String clientName, double balance) {
        super(message);
        this.timeStamp = timeStamp;
    }
}
