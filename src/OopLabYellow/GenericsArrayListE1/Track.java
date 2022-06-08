package OopLabYellow.GenericsArrayListE1;

public class Track {
    private final String name;
    private final String bandName;
    private final double price;
    private final int lengthSeconds;

    public Track(String name, String bandName, double price, int lengthSeconds) {
        this.name = name;
        this.bandName = bandName;
        this.price = price;
        this.lengthSeconds = lengthSeconds;
    }

    public String getName() {
        return name;
    }

    public String getBandName() {
        return bandName;
    }

    public double getPrice() {
        return price;
    }

    public int getLengthSeconds() {
        return lengthSeconds;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", bandName='" + bandName + '\'' +
                ", price=" + price +
                ", lengthSeconds=" + lengthSeconds +
                '}';
    }
}
