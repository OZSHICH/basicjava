package OoplabRed.OopLabRedJavaCompositionWithArrays;

public class Guest {

    private String name;
    private String id;

    public Guest(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Guest(Guest other) {
        this.name = other.name;
        this.id = other.id;
    }

    public boolean equals(Guest other) {
        return this.id == other.id;  //  return this.id.equals(other.id);   שווה ערך
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
