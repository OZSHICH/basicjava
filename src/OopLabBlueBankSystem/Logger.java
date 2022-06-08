package OopLabBlueBankSystem;

import java.util.*;

public class Logger {
    private static final List<Log> logs = new ArrayList<>();
    private static Logger instance = new Logger();


    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public static void setInstance(Logger instance) {
        Logger.instance = instance;
    }

//public Logger() {  //Default empty constructor לא צריך כונסטרקטור
    //}

    public static List<Log> getLogs() {
        return logs;
    }

    @Override
    public String toString() {
        return "Logger{" +
                "logs=" + logs +
                '}';
    }

    public void addLog(Log log) {
        logs.add(log);
    }

    public void display() {
        System.out.println("-------------------------Looger-----------------------");
//        for (Log log : logs) {
//            System.out.println(log);
        for (int i = 0; i < logs.size(); i++) {
            System.out.println(logs.get(i));
        }
        System.out.println("-------------------------Looger-----------------------");
    }


}
