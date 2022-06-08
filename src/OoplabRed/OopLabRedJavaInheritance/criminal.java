package OoplabRed.OopLabRedJavaInheritance;

public class criminal extends player {

    public criminal(String name, int strength) {
        super(name, strength);
    }

    public criminal(criminal other) {
        super(other.getName(), other.getStrength());
    }

}
