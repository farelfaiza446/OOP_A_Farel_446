import java.util.Scanner;

public class Admin {
    private final String username = "admin";
    private final String password = "admin123";

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}