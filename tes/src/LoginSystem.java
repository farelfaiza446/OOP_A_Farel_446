import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Student student = new Student("Farel", "446");

        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                System.out.println("Login Admin Berhasil!");
            } else {
                System.out.println("Username atau Password salah.");
            }
        } else if (choice == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Student ID: ");
            String studentID = scanner.nextLine();

            if (student.login(nama, studentID)) {
                student.displayInfo();
            } else {
                System.out.println("Nama atau Student ID salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}
