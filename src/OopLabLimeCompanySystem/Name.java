package OopLabLimeCompanySystem;

public enum Name {
    MOSHE,
    DAVID,
    JACK,
    TAL,
    DANIEL;


    public static String getRandName() { //TODO enum random toString
        return Name.values()[(int) (Math.random() * Name.values().length)].name().toLowerCase();
    }

}
