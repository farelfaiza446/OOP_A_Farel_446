public class User {
    private String name;
    private String studentId;

    public User(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public boolean login(String name, String studentId) {
        return false;
    }

    public void displayInfo() {
        System.out.println("User Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}