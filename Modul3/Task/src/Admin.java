public class Admin extends User {
    private String username;
    private String password;

    public Admin(String name, String studentId, String username, String password) {
        super(name, studentId);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admin Login Successful!");
        System.out.println("Admin Username: " + username);
    }
}