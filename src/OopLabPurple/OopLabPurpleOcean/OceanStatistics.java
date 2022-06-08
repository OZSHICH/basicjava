package OopLabPurple.OopLabPurpleOcean;

public class OceanStatistics {
    public static int totolteeth(Ocean ocean) {
        int countteeth = 0;
        for (int i = 0; i < ocean.totalEntities(); i++) {
            if (ocean.getEntities()[i] instanceof Shark) {
                countteeth += ((Shark) ocean.getEntities()[i]).getNumOfTeeth();
            }
        }
        return countteeth;
    }

    public static int totollenght(Ocean ocean) {
        int countlenght = 0;
        for (int i = 0; i < ocean.totalEntities(); i++) {
            if (ocean.getEntities()[i] instanceof Whale) {
                countlenght += ((Whale) ocean.getEntities()[i]).getLengthInMeters();
            }
        }
        return countlenght;
    }

    public static String majorityfish(Ocean ocean) {
        if (ocean.totalSharks() > ocean.totalWhales()) {
            return "Shark";

        } else if (ocean.totalWhales() > ocean.totalSharks()) {
            return "Whale";
        }
        return "Even";
    }

    public static double avgteeth(Ocean ocean) {
        return totolteeth(ocean) / ocean.totalSharks();
    }

    public static double avglength(Ocean ocean) {
        return totollenght(ocean) / ocean.totalWhales();

    }


}
