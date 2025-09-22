package enrollment;

public class Course {
    private String courseId;
    private String courseName;
    private int capacity;
    private double fee;

    public Course(String courseId, String courseName, int capacity, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.capacity = capacity;
        this.fee = fee;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFee() {
        return fee;
    }

    public void reduceCapacity() {
        if (capacity > 0) {
            capacity--;
        }
    }
  public String toString() {
        return "[courseId = "+courseId+ " ,  courseName = "+ courseName + " , Fee = " + fee + " , Seats left: " + capacity+"]";
    }
}

