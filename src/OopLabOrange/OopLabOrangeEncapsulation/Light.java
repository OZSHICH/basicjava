package OopLabOrange.OopLabOrangeEncapsulation;

public class Light {
    private int totalhours;
    private String color = "white";
    private double cost = 19.99;

    public Light() {
    }

    public Light(int totalhours, double cost) {
        this.totalhours = totalhours;
        this.cost = cost;
    }

    public Light(int totalhours, String color) {
        this.totalhours = totalhours;
        this.color = color;
    }

    public Light(int totalhours, String color, double cost) {
        this.totalhours = totalhours;
        this.color = color;
        this.cost = cost;
    }

    public int getTotalhours() {
        return totalhours;
    }

    public void setTotalhours(int totalhours) {
        this.totalhours = totalhours;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Light{" +
                "totalhours=" + totalhours +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
