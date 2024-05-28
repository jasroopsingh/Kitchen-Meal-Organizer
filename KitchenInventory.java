import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class KitchenInventory 
{
    //contain functions to sort by name/quantity
    //compare for req ingredients

    private List<Ingredient> ingredients;

    public KitchenInventory()
    {
        this.ingredients = new ArrayList<>();
    }

    // Adds an ingredient to the inventory
    public void addIngredient(Ingredient ingredient) 
    { 
        ingredients.add(ingredient);
    }

    // Removes a specified quantity of an ingredient from the inventory
    public void removeIngredient() 
    { 
        Ingredient[] IngredientList = new Ingredient[5];
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        System.out.println("Which ingredient would you like to remove? ");
        String input = scanner.nextLine(); // variable for storing input
        IngredientList.remove(input);


        scanner.close();

    }

    // Sorts ingredients by name and displays them
    public void sortByName() 
    {

     }


    // Sorts ingredients by quantity and displays them
    public void sortByQuantity() 
    {


        Ingredient[] QuantityList;
        QuantityList = new Ingredient[5];

        // Testing Lines:
        Quantity tomatoQuantity = new Quantity(10, "Jars");
        Ingredient tomato = new Ingredient("Tomatoes", tomatoQuantity);
        QuantityList[0] = tomatoQuantity;

        //Potato
        Quantity potatoQuantity = new Quantity(15, "Mashes");
        Ingredient potato = new Ingredient("Potatoes", potatoQuantity);
        QuantityList[1] = potatoQuantity;

        //Radish
        Quantity radishQuantity = new Quantity(5, "Bowls");
        Ingredient radish = new Ingredient("Sliced Radish", radishQuantity);
        QuantityList[2] = radishQuantity;

        //Bubble sort test
        
        // End of testing code

        System.out.println("Ingredients Sorted:");
        for (int b = 0; b < QuantityList.length; b++)
        {
            System.out.println(QuantityList[b]);
        }
    }

    // Displays a list of ingredients
    public void displayIngredients(List<Ingredient> ingredientList) 
    { for (Ingredient ingredient : ingredientList)  { System.out.println(ingredient);} } // Print ingredient details

    // Compares the inventory with the ingredients required for a meal
    public void compareIngredients(Meal meal) 
    {

    }

    

}
