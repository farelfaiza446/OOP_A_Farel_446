public class Main {
    public static void main(String[] args) {
        Hero brimstone = new Hero("Brimstone", 150);
        Enemy viper = new Enemy("Viper", 200);

        System.out.println("Initial status:");
        System.out.println(brimstone.getName() + " starts with " + brimstone.getHealth() + " health.");
        System.out.println(viper.getName() + " starts with " + viper.getHealth() + " health.");

        System.out.println("\nBattle Begins!");
        brimstone.attack(viper);
        brimstone.attack(viper);
        viper.attack(brimstone);
    }
}
