package OoplabRed.OopLabRedJavaInheritance;

public abstract class player {
    private String name;
    private int strength;

    public player(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }

    protected boolean isalive() {
        return (this.strength > 0);

    }

    protected int knockout() {
        int originpower = this.strength;
        this.strength = 0;
        return originpower;
    }

}
