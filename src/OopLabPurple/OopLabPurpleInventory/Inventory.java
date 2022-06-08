package OopLabPurple.OopLabPurpleInventory;

import java.util.*;

public class Inventory {
    private Item[] itams;

    public Inventory() {
        //todo אכסון בתוך קונסטרקטור
        this.itams = new Item[10];
    }

    public Inventory(Item[] itams) {
        this.itams = itams;
    }

    public Item[] getItam() {
        return itams;
    }

    //TODO set given arr
    public void setItam(Item[] itam) {
        this.itams = itam;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "itam=" + Arrays.toString(itams) +
                '}';
    }

    //TODO return size
    public int size() {
        return this.itams.length;
    }

    //TODO return count of only initialized
    public int count() {
        int count = 0;
        for (Item itam : itams) {
            if (itam != null) {
                count++;
            }
        }
        return count;
    }
}
