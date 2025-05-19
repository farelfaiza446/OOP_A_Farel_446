import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Login System =====");
        System.out.println("1. Admin Login");
        System.out.println("2. Student Login");
        System.out.print("Choose login type (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            Admin admin = new Admin("Admin", "2024446", "admin", "admin");

            if (admin.login(username, password)) {
                admin.displayInfo();
            } else {
                System.out.println("Admin login failed");
            }

        } else if (choice == 2) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine();

            Student student = new Student("Farel", "2024446");

            if (student.login(name, studentId)) {
                student.displayInfo();
            } else {
                System.out.println("Student login failed");
            }

        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}