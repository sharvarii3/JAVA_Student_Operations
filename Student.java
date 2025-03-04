//Student.java

public class Student {

    private int studentId;
    private String fullName;
    private String birthDate;
    private double score;
    private int rank;

    // Constructors
    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String fullName) {
        this(studentId);
        this.fullName = fullName;
    }

    public Student(int studentId, String fullName, double score) {
        this(studentId, fullName);
        this.score = score;
    }

    public Student(int studentId, String fullName, double score, String birthDate) {
        this(studentId, fullName, score);
        this.birthDate = birthDate;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", fullName=" + fullName + ", birthDate=" + birthDate + ", score=" + score + ", rank=" + rank + "]";
    }
}