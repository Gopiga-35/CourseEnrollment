package enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {
    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();

    public void addCourse(String id, String name, int capacity, double fee) {
        courses.add(new Course(id, name, capacity, fee));
        System.out.println("Course added!");
    }

    public void addStudent(String id, String name, boolean premium) {
        if (premium) {
            students.add(new PremiumStudent(id, name));
        } else {
            students.add(new Student(id, name));
        }
        System.out.println("Student added!");
    }

    public void enrollStudent(String sid, String cid) {
        Student student = findStudent(sid);
        Course course = findCourse(cid);

        if (student == null || course == null) {
            System.out.println("Invalid student or course!");
            return;
        }

        if (course.getCapacity() > 0) {
            enrollments.add(new Enrollment(student, course));
            course.reduceCapacity();
            System.out.println("Enrolled successfully!");
        } else {
            System.out.println("Course full!");
        }
    }

    public void makePayment(String sid, String cid) {
        Student student = findStudent(sid);
        Course course = findCourse(cid);

        if (student == null || course == null) {
            System.out.println("Invalid student or course!");
            return;
        }

        double fee = course.getFee();
        if (student instanceof PremiumStudent) {
            fee = ((PremiumStudent) student).applyDiscount(fee);
            System.out.println("Discount applied for premium student!");
        }

        Payment payment = new Payment(student, course, fee);
        payments.add(payment);

        Receipt receipt = new Receipt(student, course, fee);
        receipt.printReceipt();
    }

    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course c : courses) {
                System.out.println(c);
            }
        }
    }

    private Student findStudent(String id) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) return s;
        }
        return null;
    }

    private Course findCourse(String id) {
        for (Course c : courses) {
            if (c.getCourseId().equals(id)) return c;
        }
        return null;
    }
}
