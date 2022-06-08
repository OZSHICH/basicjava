package OopLabOrange.OopLabOrangeEncaspsulationFlight;

import java.time.*;

public class Test {
    public static void main(String[] args) {
        //Flight
        Flight f1 = new Flight("Hl112", "ElAl", "Boston", "TLV");
        Flight f2 = new Flight("Fs119", "IsraAir", "Mikonos", "TLV", LocalDateTime.of(1995, 6, 21, 22, 43, 05));

        System.out.println(f1);
        System.out.println(f2);

        //Airplane
        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane(1234, 350, LocalDate.of(2022, 2, 13));
        Airplane a3 = new Airplane(5678, 750, LocalDate.of(1922, 4, 24), LocalDate.of(2021, 12, 12));

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        //Log
        Log l1 = new Log();
        Log l2 = new Log(1234, "Crash", "Program crashed", 13);
        Log l3 = new Log(5678, "Crash", "Program crashed again", 17, LocalDateTime.of(2021, 12, 16, 1, 45, 33));

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        //Coupon
        Coupon c1 = new Coupon("Bottle", "Holder of liquid", LocalDate.now(), LocalDate.now().plusWeeks(1), 2, 29.90);
        Coupon c2 = new Coupon(123, "Bottle", "Holder of liquid", LocalDate.now(), LocalDate.now().plusWeeks(1), 2, 29.90);

        System.out.println(c1);
        System.out.println(c2);

        //Person
        Person p1 = new Person();
        Person p2 = new Person("David");
        Person p3 = new Person("Yaniv", LocalDate.of(1945, 2, 21));

        System.out.println(p1.display());
        System.out.println(p2.display());
        System.out.println(p3.display());
    }
}
