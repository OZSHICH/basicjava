package JavaTestAPI;

import java.util.*;

public class Utils {
    private static Random random = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static int ranNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static Calendar initRandCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.add(Calendar.DATE, ranNumber(1, 28));
        calendar.add(Calendar.MONTH, ranNumber(1, 12));
        calendar.add(Calendar.YEAR, ranNumber(53, 54));
        calendar.add(Calendar.AM_PM, ranNumber(1, 12));
        calendar.add(Calendar.HOUR, ranNumber(1, 12));
        calendar.add(Calendar.MINUTE, ranNumber(1, 59));
        calendar.add(Calendar.SECOND, ranNumber(1, 59));

        System.out.println(calendar.getTime());

        return calendar;
    }

    private static String[] activities = {"Eat", "Exercise", "Sleep", "Shower", "Rest"};

    public static String randString() {
        String activity = activities[(int) (Math.random() * 5)];
        return activity;
    }

    public static boolean randBoolean() {
        return random.nextBoolean();

    }

    public static Reminder initReminder() {
        return new Reminder(initRandCalendar(), randString(), randBoolean(), false);
    }


}