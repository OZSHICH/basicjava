package OopLabPurple.OopLabPurpleFullYear;

import java.util.Arrays;

public class FullYear {
    private Date[] dates;

    public FullYear(int year) {
        this.dates = FactUtils.init(year);

    }

    public Date[] getDates() {
        return dates;
    }

    public void setDates(Date[] dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "FullYear{" +
                "dates=" + Arrays.toString(dates) +
                '}';
    }


}
