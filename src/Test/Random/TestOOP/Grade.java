package Test.Random.TestOOP;

import java.util.*;

import static Test.Random.TestOOP.ConstantFactory.*;

public class Grade {
    private static Random random = new Random();

    private String profession = randomProfession();
    private int score;

    public Grade() {
    }

    public Grade(String profession, int score) {
        this.profession = profession;
        this.score = randomScore();
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        Grade.random = random;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "profession=" + profession +
                ", score=" + score +
                '}';
    }
}

