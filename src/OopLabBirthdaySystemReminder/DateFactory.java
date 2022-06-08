package OopLabBirthdaySystemReminder;

import java.time.*;

import static OopLabBankSystemSim.FactoryUtils.*;

public class DateFactory {
    public static LocalDate getLocalDate() {

        return LocalDate.of(ranNumber(1960, 2010), ranNumber(1, 12), ranNumber(1, 28));
    }
}
