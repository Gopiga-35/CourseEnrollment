package enrollment;

public class Receipt {
    private Student student;
    private Course course;
    private double amountPaid;

    public Receipt(Student student, Course course, double amountPaid) {
        this.student = student;
        this.course = course;
        this.amountPaid = amountPaid;
    }

    public void printReceipt() {
        System.out.println(" Receipt ");
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("-----------------");
    }
}

