package OopLabOrange.OopLabOrangeEncaspsulationFlight;

import java.time.*;

public class Airplane {
    private long id;
    private int numOfSeats = 400;
    private LocalDate dateOfCreation = LocalDate.now();
    private LocalDate lastRepair;

    public Airplane() {
    }

    public Airplane(long id, int numOfSeats, LocalDate dateOfCreation) {
        this.id = id;
        this.numOfSeats = numOfSeats;
        this.dateOfCreation = dateOfCreation;
    }

    public Airplane(long id, int numOfSeats, LocalDate dateOfCreation, LocalDate lastRepair) {
        this.id = id;
        this.numOfSeats = numOfSeats;
        this.dateOfCreation = dateOfCreation;
        this.lastRepair = lastRepair;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public LocalDate getLastRepair() {
        return lastRepair;
    }

    public void setLastRepair(LocalDate lastRepair) {
        this.lastRepair = lastRepair;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", numOfSeats=" + numOfSeats +
                ", dateOfCreation=" + dateOfCreation +
                ", lastRepair=" + lastRepair +
                '}';
    }
}
