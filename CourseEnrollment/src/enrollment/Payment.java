package enrollment;

public class Payment {
    private Student student;
    private Course course;
    private double amount;

    public Payment(Student student, Course course, double amount) {
        this.student = student;
        this.course = course;
        this.amount = amount;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public double getAmount() {
        return amount;
    }
}
