package LE3Q2;

public class Student {
    private Double score;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName, Double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
    public Student() {
        firstName = "Ethan";
        lastName = "Wong";
        score = 100.00;
    }
    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    @Override
    public String toString() {
        String s = "";
        s = String.format("%s: %.2f", firstName, score);
        return s;
    }
    @Override
    public int compareTo(Student student) {

    }
}
