package JavaTestAPI;

import java.util.*;

public class TaskReminder extends Reminder implements Runnable {
    private Set<Reminder> reminders = new TreeSet<>();

    public TaskReminder(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    @Override
    public void run() {
        System.out.println("Thread is running");
        while (true) {
            try {
                Thread.sleep(1000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
