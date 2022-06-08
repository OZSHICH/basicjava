package Test.Random;

import java.time.*;

public class DateUtils {
    public static String beautifyDate(LocalDate localDate) {
        int day = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();

        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public static String beautifyDateAndTime(LocalDateTime localDateTime) {
        int day = localDateTime.getDayOfMonth();
        int month = localDateTime.getMonthValue();
        int year = localDateTime.getYear();

        int hours = localDateTime.getHour();
        int minutes = localDateTime.getMinute();
        int seconds = localDateTime.getSecond();

        return String.format("%02d/%02d/%04d %02d:%02d:%02d", day, month, year, hours, minutes, seconds);
    }
}