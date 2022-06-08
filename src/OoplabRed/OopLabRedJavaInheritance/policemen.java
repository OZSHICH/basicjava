package OoplabRed.OopLabRedJavaInheritance;

import java.util.Arrays;

public class policemen extends player {

    private static final int MAXNUMCRIMINALS = 3;
    private criminal[] arrestedCriminals = new criminal[MAXNUMCRIMINALS];
    private int totalArrested;

    public policemen(String name, int strength) {
        super(name, strength);
    }

    public boolean arrestedall() {
        return !(totalArrested < MAXNUMCRIMINALS);
        // או זה או זה
//        if (totalArrested<MAXNUMCRIMINALS){
//            return false;
//
//        }
//            return true;

    }

    public boolean arrest(criminal criminal) {

        if (this.isalive() && criminal.isalive()) {
            if (totalArrested < MAXNUMCRIMINALS) {

                if (this.getStrength() > criminal.getStrength()) {
                    this.setStrength(this.getStrength() - criminal.knockout());
                    arrestedCriminals[totalArrested++] = criminal;
                    //totalArrested++
                    return true;

                } else if (criminal.getStrength() > this.getStrength()) {
                    criminal.setStrength(criminal.getStrength() - this.knockout());

                } else {
                    criminal.knockout();
                    this.knockout();
                }
            }
        }
        return false;
    }

    public void showarrestedcriminals() {
        if (totalArrested > 0) {
            System.out.println("policemen : " + getName() + "arrested : " + totalArrested);
            for (int i = 0; i < arrestedCriminals.length; i++) {
                System.out.println(arrestedCriminals[i].getName() + "was areestet");
            }
        } else {
            System.out.println("policemen : " + getName() + " had no arrests");
        }
    }

    public criminal[] getArrestedCriminals() {
        return arrestedCriminals;
    }

    public void setArrestedCriminals(criminal[] arrestedCriminals) {
        this.arrestedCriminals = arrestedCriminals;
    }

    public int getTotalArrested() {
        return totalArrested;
    }

    public void setTotalArrested(int totalArrested) {
        this.totalArrested = totalArrested;
    }

    @Override
    public String toString() {
        return "policemen{" +
                "arrestedCriminals=" + Arrays.toString(arrestedCriminals) +
                ", totalArrested=" + totalArrested +
                '}';
    }
}
