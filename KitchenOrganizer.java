// Main File to Run Code

import java.util.Scanner; // get user input

public class KitchenOrganizer 
{
    private static KitchenInventory inventory = new KitchenInventory(); // Inventory instance to manage ingredients (+/-)
    private static Meal meal; // Meal instance to store meal

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // intiScanner for user input
        String userInput; // variable for storing userInput

        // loop to display menu and handle userInput
        while (true) {
            printMenu(); // call function to display menu options
            userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    addIngredient(scanner); // Add an ingredient to the inventory
                    break;
                case "2":
                    removeIngredient(scanner); // Remove an ingredient from the inventory
                    break;
                case "3":
                    inventory.sortByName(); // Sort ingredients by name
                    break;
                case "4":
                    inventory.sortByQuantity(); // Sort ingredients by quantity
                    break;
                case "5":
                    addMeal(scanner); // Add a meal with ingredients
                    break;
                case "6":
                    compareWithMeal(scanner); // Compare inventory with meal ingredients
                    break;
                case "7":
                    System.out.println("Exiting..."); // Exit the application
                    return;
                default:
                    System.out.println("Invalid option, please try again. Enter Number corresponding for the Memu option."); // Handle invalid option
            }
        }
    }

    // function that prints the menu options
    private static void printMenu() 
    {
        System.out.println("\n===========================================");
        System.out.println("  🌟 Choose from one of the following options 🌟");
        System.out.println("===========================================");
        System.out.println("1. ➕  Add ingredient");
        System.out.println("2. ➖  Remove ingredient");
        System.out.println("3. 🔤  Sort ingredients by name");
        System.out.println("4. 🔢  Sort ingredients by quantity");
        System.out.println("5. 🍽️  Add meal");
        System.out.println("6. 🔍  Compare ingredients with meal");
        System.out.println("7. 🚪  Exit");
        System.out.println("===========================================\n");
    }
    
    // Handles adding an ingredient to the inventory
    private static void addIngredient(Scanner scanner) {}

    // Handles removing an ingredient from the inventory
    private static void removeIngredient(Scanner scanner) {}

    // Handles adding a meal with multiple ingredients
    private static void addMeal(Scanner scanner) {} //done to exit adding meal. Use true loop with break statement?

    // calls fucntion in inverntory that will compare ingredients in inventory with ones required for meal
    private static void compareWithMeal(Scanner scanner) {
        if (meal == null) { // Check if any meal has been added yet
            System.out.println("No meal added yet.");
            return;
        }
        inventory.compareIngredients(meal); // Compare inventory with meal ingredients
    }

}