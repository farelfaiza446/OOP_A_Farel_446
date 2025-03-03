import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter gender (M/F): ");
        char genderChar = scanner.next().charAt(0);

        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearOfBirth;

        String gender = (genderChar == 'M' || genderChar == 'm') ? "Male" : "Female";

        System.out.println("\nPersonal Data:");
        System.out.println("Name    : " + name);
        System.out.println("Gender  : " + gender);
        System.out.println("Age     : " + age + " years");

        scanner.close();
    }
}
