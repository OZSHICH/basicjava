package OoplabRed.OopLabRedJavaPolymorphismRaceCar;

public class Competition {
    public static int go(RaceCompetitor[] competitors) {
        int maxdis = 0;
        int winnumber = 0;
        //TODO print "-" for arr.length
        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < competitors[i].getDistance(); j++) {
                System.out.print("-");
            }
            if (competitors[i].getDistance() > maxdis) {
                maxdis = competitors[i].getDistance();
                winnumber = competitors[i].getCompetitionNumber();
            }
            System.out.println();
        }
        return winnumber;
    }
}
//        for (int i = 0; i <competitors[0].getDistance(); i++) {
//            System.out.print("-");
//
//
//            }
//        System.out.println();
//        for (int j = 0; j <competitors[1].getDistance(); j++) {
//            System.out.print("-");
//        }
//        if (competitors[0].getDistance()>competitors[1].getDistance())
//        return competitors[0].getCompetitionNumber();
//        else return competitors[1].getCompetitionNumber();
//    }




