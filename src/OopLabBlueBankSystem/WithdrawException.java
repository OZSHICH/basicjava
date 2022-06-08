package OopLabBlueBankSystem;

import java.time.*;
import java.util.*;

public class WithdrawException extends Exception {
    public WithdrawException(int clientId, double balance, double amount) {
        super("Not enough money,\n" +
                "Withdraw is not allowed for, \n" +
                "client id : " + clientId + '\n' +
                "balance :  " + balance + '\n' +
                "amount : " + amount + '\n' +
                "on : " + LocalDateTime.now());
    }

    public WithdrawException(String cannot_withdraw_more_than_balance, Date date, int id, String clientName, double balance) {
    }
}




