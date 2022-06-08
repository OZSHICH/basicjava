package Test.Random.eladoop;/*
Created by Elad on 24/02/2022

*/

public class Grade {
    private int score = 40;
    private String proffesion = "math";

    public Grade() {
    }

    public Grade(int score, String proffesion) {
        setScore(score);
        setProffesion(proffesion);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 40 && score <= 100) {
            this.score = score;
        } else {
            score = 40;
        }
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = FactoryUtils.checkForProffesion(proffesion);
    }

    @Override
    public String toString() {
        return "Grade: " +
                "score=" + score +
                ", proffesion='" + proffesion;
    }
}
