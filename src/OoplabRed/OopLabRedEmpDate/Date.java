package OoplabRed.OopLabRedEmpDate;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = checkDay(day);
        this.month = checkMonth(month);
        this.year = year;


    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    //TODO checkMonth
    public int checkMonth(int month) {

        if (month > 0 && month < 13) {
            return month;
        }
        System.out.println("Invalid Month");
        return 1;
    }

    //TODO checkDay from leap year
    public int checkDay(int day) {
        int max = DateUtils.getMaxDays(month, year);
        if (day > 0 && day <= max) {
            return day;
        }
        System.out.println("Invalid day");
        return day;
    }
}


