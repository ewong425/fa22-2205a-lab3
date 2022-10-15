package LE3Q1;

public class MyStudent {
    private String firstName;
    private Double score;
    public MyStudent() {
        firstName = "Ethan";
        score = 90.00;
    }
    public MyStudent(String firstName, Double score) {
        this.firstName = firstName;
        this.score = score;
    }
    @Override
    public String toString() {
        String s = "";
        s = String.format("%s%d : ", firstName, score);
        return s;
    }
}
