package OopLabPurple.OopLabPurpleOcean;

import static OopLabPurple.OopLabPurpleOcean.OceanStatistics.*;

public class OceanReport {
    public static void PrintReport(Ocean ocean) {
        System.out.println(ocean.totalEntities());
        System.out.println("------------------");
        System.out.println(ocean.totalSharks());
        System.out.println("------------------");
        System.out.println(ocean.totalWhales());
        System.out.println("------------------");
        System.out.println(totolteeth(ocean));
        System.out.println("------------------");
        System.out.println(totollenght(ocean));
        System.out.println("------------------");
        System.out.println(avglength(ocean));
        System.out.println("------------------");
        System.out.println(avgteeth(ocean));
        System.out.println("------------------");
        System.out.println(majorityfish(ocean));
        System.out.println("------------------");
        System.out.println();

    }
}
