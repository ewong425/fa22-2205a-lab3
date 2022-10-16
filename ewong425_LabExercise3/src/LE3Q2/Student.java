package LE3Q2;
public class Student implements Comparable<Student> {
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
        s = String.format("%s %s: %.2f", firstName, lastName, score);
        return s;
    }
    @Override
    public int compareTo(Student student) {
        int rv = 0;
        if(this.score > student.score) {
            rv = -1;
        } else if(this.score< student.score) {
            rv = 1;
        } else {
            rv = 0;
        }
        return rv;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
