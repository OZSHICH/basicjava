package OopLabBirthdaySystemReminder;

import java.time.*;
import java.time.format.*;

public class DateUtil {
    public static String BeautifyDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(date);
    }

    public static Person initPerson() {
        return new Person();
    }


}
