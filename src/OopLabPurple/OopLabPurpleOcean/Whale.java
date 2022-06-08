package OopLabPurple.OopLabPurpleOcean;

public class Whale extends Fish {
    public int lengthInMeters;

    public Whale(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
        this.speed = 90;
    }

    public int getLengthInMeters() {
        return lengthInMeters;
    }

    public void setLengthInMeters(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }

    @Override
    public String toString() {
        return "Whale{" +
                "lengthInMeters=" + lengthInMeters +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("“WHOM WHOM WHOM");
    }

    @Override
    public void draw() {
        System.out.println("" +
                "    .-------------'```'----....,,__                        _,\n" +
                "   |                               `'`'`'`'-.,.__        .'(\n" +
                "   |                                             `'--._.'   )\n" +
                "   |                                                   `'-.<\n" +
                "   \\               .-'`'-.                            -.    `\\\n" +
                "    \\               -.o_.     _                     _,-'`\\    |\n" +
                "     ``````''--.._.-=-._    .'  \\            _,,--'`      `-._(\n" +
                "       (^^^^^^^^`___    '-. |    \\  __,,..--'                 `\n" +
                "        `````````   `'--..___\\    |`\n" +
                "                jgs           `-.,'\n");


    }
}

