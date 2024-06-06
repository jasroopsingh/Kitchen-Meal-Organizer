// Main File to Run Code

import java.util.List;
import java.util.Scanner; // get user input

public class KitchenOrganizer 
{
    static KitchenInventory inventory = new KitchenInventory(); // Inventory instance to manage ingredients (+/-)
    private static Meal meal; // Meal instance to store meal

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // intiScanner for user input
        String userInput; // variable for storing userInput

        // loop to display menu and handle userInput
        while (true) 
        {
            printMenu(); // call function to display menu options
            userInput = scanner.nextLine();

            switch (userInput) 
            {
                case "1" -> addIngredient(scanner); // Add an ingredient to the inventory
                case "2" -> removeIngredient(scanner); // Remove an ingredient from the inventory
                case "3" -> inventory.sortByName(); // Sort ingredients by name
                case "4" -> inventory.sortByQuantity(); // Sort ingredients by quantity
                case "5" -> addMeal(scanner); // Add a meal with ingredients
                case "6" -> compareWithMeal(scanner); // Compare inventory with meal ingredients
                case "7" -> { System.out.println("Exiting..."); return; } // Exit the application

                default -> System.out.println("Invalid option, please try again. Enter # corresponding to a Menu option."); // Handle invalid option
            }
        }
    }



    // function that prints the menu options
    private static void printMenu() 
    {
        System.out.println("\n===========================================");
        System.out.println("  Choose from one of the following options  ");
        System.out.println("===========================================");
        System.out.println("1. Add ingredient");
        System.out.println("2. Remove ingredient");
        System.out.println("3. Sort ingredients by name");
        System.out.println("4. Sort ingredients by quantity");
        System.out.println("5. Add meal");
        System.out.println("6. Compare ingredients with meal");
        System.out.println("7. Exit");
        System.out.println("===========================================\n");
    }

    
    // Handles adding an ingredient to the inventory
    private static void addIngredient(Scanner scanner) 
    {
        System.out.println("Enter Name of Ingredient: ");
        String name = scanner.nextLine();

        //Handles input to make sure that the user enters a number for quanitty (so sorting methos can work properly)
        double quantity = 0;
        boolean validInput = false;
        while (!validInput) 
        {
            System.out.println("Enter Quantity: ");
            try 
            {
                quantity = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid number for quantity.");
            }
        }
        System.out.println("Enter Unit: ");
        String unit = scanner.nextLine();

        inventory.addIngredient(new Ingredient(name, new Quantity(quantity, unit)));

        inventory.displayIngredients();
    }



    // Handles removing an ingredient from the inventory
    private static void removeIngredient(Scanner scanner) 
    { 
        System.out.println("Enter Name of Ingredient to remove: ");
        String remName = scanner.nextLine();
        Ingredient ingreToRemove = inventory.getIngredient(remName);
        
        //Checks if ingredient exists in the ingredients list
        if (ingreToRemove == null)
        {
            System.out.println("This ingredient does not exist");
            return;
        }

    
        System.out.println("Enter Quantity: ");
        Double remAmount = Double.parseDouble(scanner.nextLine());
        
        //Checks if ingredient amount is not zero and that there exists enough of the ingredient to remove that amt
        try 
        {
            if (remAmount <= 0)
            {
                System.out.println("Quantity much be greater than zero");
                return;
            }
            
            double currentQuantity = ingreToRemove.getQuantity().getAmount();
            if (remAmount > currentQuantity) 
            {
                System.out.println("Not enough quantity in inventory to remove. Available quantity: " + currentQuantity);
                return;
            }

            inventory.removeIngredient(remName, remAmount);
            inventory.displayIngredients();


        }

        finally {}
    }



    // Handles adding a meal with multiple ingredients
    private static void addMeal(Scanner scanner) 
    { 
        //Use true loop with break statement?
        
        System.out.print("Enter meal name: ");
        String mealName = scanner.nextLine(); // Read meal name
        meal = new Meal(mealName); // Create a new meal

        // Loop to add ingredients to the meal
        while (true) {
            System.out.print("Enter ingredient name (or 'done' to finish): ");
            String ingredientName = scanner.nextLine(); 

            if (ingredientName.equals("done")) break; // Exit loop if done

            System.out.print("Enter quantity: ");
            double quantity = Double.parseDouble(scanner.nextLine()); 
            System.out.print("Enter unit: ");
            String unit = scanner.nextLine(); 

            meal.addIngredient(new Ingredient(ingredientName, new Quantity(quantity, unit))); // Add ingredient to meal
        }

        System.out.println("Meal added.");
    } 


    // calls fucntion in inverntory that will compare ingredients in inventory with ones required for meal
    private static void compareWithMeal(Scanner scanner) 
    {
        if (meal == null) // Check if any meal has been added yet
        {
            System.out.println("No meal added yet.");
            return;
        }

        System.out.print("Enter meal name to check ingredient availability: ");
        String mealName = scanner.nextLine();

        Meal userMeal = new Meal(mealName); // Create a user-defined meal for comparison

        inventory.compareIngredients(userMeal); // Compare inventory with meal ingredients
    }

}