package JavaTestAPI;

import java.util.*;

public class SystemReminder {

    private Set<Reminder> reminders = new TreeSet<>(new Comparator<Reminder>() {
        @Override
        public int compare(Reminder r1, Reminder r2) {
            if (r1.getExpiration().get(Calendar.YEAR) > r2.getExpiration().get(Calendar.YEAR)) {
                return 1;
            } else if (r1.getExpiration().get(Calendar.YEAR) < r2.getExpiration().get(Calendar.YEAR)) {
                return -1;
            } else if (r1.getExpiration().get(Calendar.MINUTE) > r2.getExpiration().get(Calendar.MINUTE)) {
                return 1;
            } else if (r1.getExpiration().get(Calendar.MINUTE) < r2.getExpiration().get(Calendar.MINUTE)) {
                return -1;
            }
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    });

    private TaskReminder task = new TaskReminder(reminders);
    private static Scanner sc = new Scanner(System.in);
    private boolean continueProgram = true;

    public SystemReminder() {
        Thread thread = new Thread(new TaskReminder(reminders));
        thread.start();
    }

    public void showMenu() {
        System.out.println();
        System.out.println("Please choose your action");
        System.out.println("Press 1 - To add reminder  ");
        System.out.println("Press 2 - To view reminder  ");
        System.out.println("Press 1 - To exit  ");
    }


    public void startSystem() {
        System.out.println("Hello Kobi and Welcome");
        System.out.println();
        int choice = 0;
        do {
            List<Reminder> remindersList = new ArrayList<>(reminders);
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addReminder(Utils.initReminder());
                    break;

                case 2:
                    printAllReminders();
                    break;

                case 3:
                    continueProgram = false;
                    endSystem();
                    break;


                default:
                    System.out.println("This is not a valid Menu Option! Please Select Again");
                    break;
            }
        } while (choice != 3);

    }

    public void endSystem() {
        System.out.println("Thank you and goodbye");
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }


    public void printAllReminders() {
        for (Reminder reminder : reminders) {
            System.out.println(reminder);

        }
    }

    public Set<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    public TaskReminder getTask() {
        return task;
    }

    public void setTask(TaskReminder task) {
        this.task = task;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        SystemReminder.sc = sc;
    }

    public boolean isContinueProgram() {
        return continueProgram;
    }

    public void setContinueProgram(boolean continueProgram) {
        this.continueProgram = continueProgram;
    }


    @Override
    public String toString() {
        return "SystemReminder{" +
                "reminders=" + reminders +
                ", task=" + task +
                ", continueProgram=" + continueProgram +
                '}';
    }
}

