package Test.Random.TOOP;

public class Grade {
    private String Profession = FactUtils.randprofession();
    private int Score;

    public Grade() {
    }

    public Grade(String profession, int score) {
        Profession = profession;
        Score = score;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "Profession='" + Profession + '\'' +
                ", Score=" + Score +
                '}';
    }
}
