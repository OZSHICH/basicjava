package OopLabPurple.OopLabPurpleOcean;

public class Shark extends Fish {
    private int numOfTeeth;

    public Shark(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
        //TODO set number to constractor
        this.speed = 120;

    }

    public int getNumOfTeeth() {
        return numOfTeeth;
    }

    public void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "numOfTeeth=" + numOfTeeth +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Yummy Yummy Yummy");
    }

    //TODO print draw
    @Override
    public void draw() {
        System.out.println("               ,\n" +
                "             .';\n" +
                "         .-'` .'\n" +
                "       ,`.-'-.`\\\n" +
                "      ; /     '-'\n" +
                "      | \\       ,-,\n" +
                "      \\  '-.__   )_`'._\n" +
                "       '.     ```      ``'--._\n" +
                "      .-' ,                   `'-.\n" +
                "       '-'`-._           ((   o   )\n" +
                "              `'--....(`- ,__..--'\n" +
                "                       '-'`");


    }
}

