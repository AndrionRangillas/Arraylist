package arraylist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ItemManager manager = new ItemManager();


        boolean exit = false;


        while (!exit) {

            System.out.println("\nMenu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");


            int choice = scanner.nextInt();
            scanner.nextLine(); 


            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String itemToAdd = scanner.nextLine();
                    manager.addItem(itemToAdd);
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    String itemToRemove = scanner.nextLine();
                    manager.removeItem(itemToRemove);
                    break;  
                case 3:
                    manager.displayItems(); 
                    break; 
                case 4:
                    exit = true;
                    System.out.println("Exiting the program...");
                    break; 
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }


        scanner.close();
    }
}