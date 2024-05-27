import java.util.ArrayList;
import java.util.List;

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
        Quantity tomatoQuantity = new Quantity(10, "units");
        Ingredient tomato = new Ingredient("Tomatoes", tomatoQuantity);
        QuantityList[0] = tomato;


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
