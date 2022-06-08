package OoplabRed.OopLabRedJavaPolymorphismRaceCar;

public class Test {
    public static void main(String[] args) {
        RaceCompetitor[] competitors = new RaceCompetitor[3];
        competitors[0] = new PrivateCar("KIA", "1354135646");
        competitors[1] = new SportsCar("Mazda", "6854635248");
        competitors[2] = new MuscleCar("Ford", "6165184596");

        int winner = Competition.go(competitors);
        System.out.println();
        System.out.println("and the winner is: " + winner);

    }

    //TODO Anonymous class
    private static class MuscleCar extends Vehicle implements RaceCompetitor {
        public MuscleCar(String manufacturerName, String frameNumber) {
            super(manufacturerName, frameNumber);
        }

        @Override
        public int getDistance() {
            return 12;
        }

        @Override
        public int getCompetitionNumber() {
            return 757;
        }
    }
}
