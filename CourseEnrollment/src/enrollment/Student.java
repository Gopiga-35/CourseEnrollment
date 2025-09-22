package enrollment;

public class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student [studentId = "+ studentId+" , Name = " + name+"]";
    }
}
