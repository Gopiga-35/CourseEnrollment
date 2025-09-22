package enrollment;
public class Instructor {
    private String instructorId;
    private String name;

    public Instructor(String instructorId, String name) {
        this.instructorId = instructorId;
        this.name = name;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public String getName() {
        return name;
    }
}

