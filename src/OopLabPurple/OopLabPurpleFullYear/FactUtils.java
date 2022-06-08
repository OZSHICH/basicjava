package OopLabPurple.OopLabPurpleFullYear;

public class FactUtils {

    public static Date[] init(int year) {
        Date[] dates = new Date[366];
        Date start = new Date(1, 1, year);
        for (int i = 0; i < dates.length; i++) {
            dates[i] = start;
            start = start.next();
        }

        return dates;
    }
}
