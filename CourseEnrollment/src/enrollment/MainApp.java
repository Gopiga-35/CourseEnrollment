package enrollment;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        EnrollmentService service = new EnrollmentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n Course Enrollment System ");
            System.out.println("1. Add Course");
            System.out.println("2. Add Student");
            System.out.println("3. Enroll in Course");
            System.out.println("4. Make Payment");
            System.out.println("5. Display Courses");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Course ID: ");
                String cid = sc.nextLine();
                System.out.print("Course Name: ");
                String cname = sc.nextLine();
                System.out.print("Capacity: ");
                int cap = sc.nextInt();
                System.out.print("Fee: ");
                double fee = sc.nextDouble();
                service.addCourse(cid, cname, cap, fee);

            } else if (ch == 2) {
                System.out.print("Student ID: ");
                String sid = sc.nextLine();
                System.out.print("Student Name: ");
                String sname = sc.nextLine();
                System.out.print("Premium (true/false): ");
                boolean prem = sc.nextBoolean();
                service.addStudent(sid, sname, prem);

            } else if (ch == 3) {
                System.out.print("Student ID: ");
                String sid = sc.nextLine();
                System.out.print("Course ID: ");
                String cid = sc.nextLine();
                service.enrollStudent(sid, cid);

            } else if (ch == 4) {
                System.out.print("Student ID: ");
                String sid = sc.nextLine();
                System.out.print("Course ID: ");
                String cid = sc.nextLine();
                service.makePayment(sid, cid);

            } else if (ch == 5) {
                service.displayCourses();

            } else if (ch == 6) {
                System.out.println("Exiting... Thankyou!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
            
        }
        sc.close();
    }
    
}

