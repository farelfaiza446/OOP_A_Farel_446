// Animal.java
public class Animal {
    // Attributes
    private String name;
    private String type;
    private String sound;

    // Constructor
    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    // Method to display animal info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Sound: " + sound);
        System.out.println();
    }
}
