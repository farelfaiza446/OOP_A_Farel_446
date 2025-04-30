public class Student {
    private String nama;
    private String studentID;

    public Student(String nama, String studentID) {
        this.nama = nama;
        this.studentID = studentID;
    }

    public boolean login(String inputNama, String inputID) {
        return nama.equals(inputNama) && studentID.equals(inputID);
    }

    public void displayInfo() {
        System.out.println("Login Berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("Student ID: " + studentID);
    }
}
