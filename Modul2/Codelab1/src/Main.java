// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating Animal objects
        Animal animal1 = new Animal("Cat", "Mammal", "Nyann~~");
        Animal animal2 = new Animal("Dog", "Mammal", "Woof-Woof!!");

        // Calling displayInfo() method for both objects
        animal1.displayInfo();
        animal2.displayInfo();
    }
}
