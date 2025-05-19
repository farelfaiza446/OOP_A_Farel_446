public class Student extends User {
    public Student(String name, String studentId) {
        super(name, studentId);
    }

    @Override
    public boolean login(String name, String studentId) {
        if (getName().equals(name) && getStudentId().equals(studentId)) {
            return true;
        }
        return false;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Login Successful!");
    }
}