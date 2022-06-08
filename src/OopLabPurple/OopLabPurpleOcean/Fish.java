package OopLabPurple.OopLabPurpleOcean;

import static OopLabPurple.OopLabPurpleOcean.ConstantFactory.randomColor;

public abstract class Fish {
    private static int count = 1;
    private String name = "Nemo" + (count++);
    private String color;
    protected int speed;

    public Fish() {
        this.color = randomColor();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Fish.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    //TODO print make sound
    public void makeSound() {
        System.out.println("Blup Blup Blup");

    }

    //TODO abstract class in class
    public abstract void draw();

}
