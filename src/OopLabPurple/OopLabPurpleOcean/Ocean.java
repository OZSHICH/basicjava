package OopLabPurple.OopLabPurpleOcean;

import java.util.Arrays;

import static OopLabPurple.OopLabPurpleOcean.OceanFactory.init;

public class Ocean {
    private Fish[] entities;

    public Ocean() {
        this.entities = init(100);
    }

    public int totalEntities() {
        return this.entities.length;
    }

    public Fish[] getEntities() {
        return entities;
    }

    public void setEntities(Fish[] entities) {
        this.entities = entities;
    }

    public int totalSharks() {
        int Sharkcount = 0;
        for (int i = 0; i < entities.length; i++) {
            if (entities[i] instanceof Shark)
                Sharkcount++;
        }
        return Sharkcount;
    }

    public int totalWhales() {
        int Whalescount = 0;
        for (int i = 0; i < entities.length; i++) {
            if (entities[i] instanceof Whale)
                Whalescount++;
        }
        return Whalescount;
    }

    @Override
    public String toString() {
        return "OceanFactory{" +
                "entities=" + Arrays.toString(entities) +
                '}';
    }

    public void drawAll() {
        for (int i = 0; i < entities.length; i++) {
            entities[i].draw();
        }
    }
}
