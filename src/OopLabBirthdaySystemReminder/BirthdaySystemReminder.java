package OopLabBirthdaySystemReminder;

import java.util.*;

public class BirthdaySystemReminder {
    private Set<Person> people = null;
    //private BirthdayTask task;
    private Scanner sc = new Scanner(System.in);
    private static BirthdaySystemReminder instance = null;

    public static void setInstance(BirthdaySystemReminder instance) {
        BirthdaySystemReminder.instance = instance;
    }

    private BirthdaySystemReminder() {
        this.people = new HashSet<>();
        Thread thread = new Thread(new BirthdayTask(people));
        thread.start();
    }

    public Set<Person> getPeople() {
        return people;
    }

    public void setPeople(Set<Person> people) {
        this.people = people;
    }

    public static BirthdaySystemReminder getInstance() {
        if (instance == null) {
            instance = new BirthdaySystemReminder();

        }
        return instance;
    }

//    public BirthdayTask getTask() {
//        return task;
//    }
//
//    public void setTask(BirthdayTask task) {
//        this.task = task;
//    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void showMenu() {
        do {
            System.out.println("Please choose your action");
            System.out.println("To add friend press 1");
            System.out.println("To delete friend press 2");
            System.out.println("To print all friends in the system in sorted way press 3");
            System.out.println("To print how much friends is the system press 4");
            System.out.println("To print happy month press 5");
            System.out.println("To print sadly month press 6");
            System.out.println("To print events  press 7");
            System.out.println("To exit press 8");

            int input = sc.nextInt();
            switch (input) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    System.out.println("Please insert a friend to delete: ");
                    deletePerson(sc.nextInt());
                    break;
                case 3:
                    printAll();
                    break;
                case 4:
                    System.out.println(BirthdayStatistics.countMemebers());

                    break;
                case 5:
                    printHappyMonth();
                    break;
                case 6:
                    printSadMonth();
                    break;
                case 7:
                    printEvents();
                    break;
                case 8:
                    endSystem();
                    break;

                default:
                    System.out.println("This is not a valid Menu Option! Please Select Again");
                    break;
            }
        } while (true);

    }

    public void startSystem() {
        System.out.println("Hello and welcome");
        showMenu();

    }

    public void endSystem() {
        System.out.println("Thank you and goodbye");
        System.exit(0);

    }

    public void addPerson() {
        people.add(DateUtil.initPerson());
        System.out.println("friend added successfully");
    }

    public void deletePerson(int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                people.remove(person);
                System.out.println("Removed friend successfully");
                return;
            }
        }
        System.out.println("friend not found");
    }

    public void printAll() {
        List<Person> peopleList = new ArrayList<>(people);
        Collections.sort(peopleList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getBirthday().isEqual(o2.getBirthday())) {
                    return 1;
                }
                return o1.compareTo(o2);
                //return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        for (Person person : peopleList) {
            System.out.println(person);
        }
    }

    public void printCount() {
        System.out.println(BirthdayStatistics.countMemebers() + " friend in system: ");
    }

    public void printSadMonth() {
        System.out.println("The month with the least birthday is:  " + BirthdayStatistics.getSadlyMonth());

    }

    public void printHappyMonth() {
        System.out.println("The month with the most birthday is: " + BirthdayStatistics.getHappyMonth());
    }

    public void printEvents() {
        for (int i = 1; i <= 12; i++) {
            System.out.printf("month %d: %d\n", i, BirthdayStatistics.getEvents().get(i - 1));

        }
    }

    public void printStatistics() {
        printCount();
        printEvents();
        printHappyMonth();
        printSadMonth();
    }
}
