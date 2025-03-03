import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Student details
        String Name = "Farel Faiza";
        String Nim = "202410370110446";

        String ltd = Nim.substring(Nim.length() - 3);
        String User = "Admin" + ltd;
        String Password = "Password" + ltd;

        System.out.println("Select Login Type:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (username.equals(User) && password.equals(Password)) {
                System.out.println("Admin login successful!");
            } else {
                System.out.println("Login failed! Wrong username or password.");
            }
        } else if (choice == 2) {

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Student ID: ");
            String studentID = scanner.nextLine();

            if (name.equals(Name) && studentID.equals(Nim)) {
                System.out.println("Student Login Successful!");
                System.out.println("Name: " + name);
                System.out.println("Student ID: " + studentID);
            } else {
                System.out.println("Login Failed! Wrong name or student ID.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
