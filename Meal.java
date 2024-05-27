import java.util.ArrayList;
import java.util.List;

public class Meal
{
    private String name; // Name of the meal
    private List<Ingredient> requiredIngredients; // List to store required ingredients

    public Meal(String name) 
    {
        this.name = name; // Initialize meal name
        this.requiredIngredients = new ArrayList<>(); // Initialize ingredients list
    }

    // Returns the name of the meal
    public String getName() { return name; }

    // Adds an ingredient to the meal's required ingredients list
    public void addIngredient(Ingredient ingredient) { requiredIngredients.add(ingredient); } // Add ingredient to required ingredients arraylist
    

    // Returns the list of required ingredients
    public List<Ingredient> getRequiredIngredients() { return requiredIngredients; }
}