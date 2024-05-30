// Meal.java
import java.util.ArrayList;
import java.util.List;


public class Meal 
{
    /*
    * Represents meals and their required ingredients.
    */

    private String name; // Name of the meal
    private List<Ingredient> requiredIngredients; // List to store required ingredients

    public Meal(String name) 
    {
        this.name = name; // Initialize meal name
        this.requiredIngredients = new ArrayList<>(); // Initialize ingredients list
    }

    // Returns the name of the meal
    public String getName() { return name; }

    // Adds an ingredient to the meal's required ingredients
    public void addIngredient(Ingredient ingredient) { requiredIngredients.add(ingredient); // Add ingredient to list }

    // Returns the list of required ingredients
    public getRequiredIngredients(List<Ingredient>) //erroring
    { return requiredIngredients; } //erroring

    // Returns a string representation of the meal and its required ingredients
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" requires:\n");
        for (Ingredient ingredient : requiredIngredients) {
            sb.append(ingredient).append("\n");
        }
        return sb.toString();
    }
}
