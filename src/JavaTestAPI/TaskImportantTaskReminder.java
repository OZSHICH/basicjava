package JavaTestAPI;

public class TaskImportantTaskReminder implements Runnable {
    private Reminder reminder;

    public TaskImportantTaskReminder(Reminder reminder) {
        this.reminder = reminder;
    }

    @Override
    public void run() {

    }
}
