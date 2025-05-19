import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("----- STOCK MANAGEMENT MENU -----");
            System.out.println("1. ADD NEW ITEM");
            System.out.println("2. DISPLAY ALL ITEMS");
            System.out.println("3. REDUCE ITEM STOCK");
            System.out.println("0. EXIT");
            System.out.print("CHOOSE OPTION: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();

                    int stock = 0;
                    try {
                        System.out.print("Initial stock: ");
                        stock = Integer.parseInt(scanner.nextLine());
                        itemList.add(new Item(name.toUpperCase(), stock));
                        System.out.println("Item '" + name.toUpperCase() + "' successfully added.\n");
                    } catch (NumberFormatException e) {
                        System.out.println("Stock input must be a number!\n");
                    }
                    break;

                case "2":
                    System.out.println("----- ITEM LIST (STOCK) -----");
                    if (itemList.isEmpty()) {
                        System.out.println("Item stock is empty.\n");
                    } else {
                        for (int i = 0; i < itemList.size(); i++) {
                            Item item = itemList.get(i);
                            System.out.println(i + ". Name: " + item.getName() + ", Stock: " + item.getStock());
                        }
                        System.out.println();
                    }
                    break;

                case "3":
                    System.out.println("----- REDUCE ITEM STOCK (SELECT TO REDUCE STOCK) -----");
                    if (itemList.isEmpty()) {
                        System.out.println("No items available to reduce stock.\n");
                        break;
                    }

                    for (int i = 0; i < itemList.size(); i++) {
                        System.out.println(i + ". " + itemList.get(i).getName());
                    }

                    try {
                        System.out.print("Enter item index number: ");
                        int index = Integer.parseInt(scanner.nextLine());

                        Item item = itemList.get(index);

                        System.out.print("Enter the amount of stock to reduce: ");
                        int amount = Integer.parseInt(scanner.nextLine());

                        if (amount > item.getStock()) {
                            throw new InsufficientStockException("Stock for " + item.getName() +
                                    " is only " + item.getStock() + " left.");
                        }

                        item.setStock(item.getStock() - amount);
                        System.out.println(item.getName() + " successfully reduced. Remaining stock: " + item.getStock() + "\n");

                    } catch (NumberFormatException e) {
                        System.out.println("Input must be a number!\n");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid item index!\n");
                    } catch (InsufficientStockException e) {
                        System.out.println(e.getMessage() + "\n");
                    }
                    break;

                case "0":
                    running = false;
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid option!\n");
                    break;
            }
        }

        scanner.close();
    }
}
