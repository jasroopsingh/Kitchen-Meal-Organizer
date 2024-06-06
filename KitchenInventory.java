import java.util.ArrayList;
import java.util.List;


public class KitchenInventory 
{    
    private List<Ingredient> ingredients;

    public KitchenInventory() { this.ingredients = new ArrayList<>(); }

    // Adds an ingredient to the inventory
    public void addIngredient(Ingredient ingredient) 
    { 
        for (Ingredient existingIngredient : ingredients) 
        {
            if (existingIngredient.getName().equals(ingredient.getName()) && existingIngredient.getQuantity().getUnit().equals(ingredient.getQuantity().getUnit())) 
            {
                existingIngredient.getQuantity().add(ingredient.getQuantity().getAmount()); // Update quantity if ingredient exists with same name/unit type used
                return; 
            }
        }
        ingredients.add(ingredient); // Add new ingredient if doesn't exist before
    }

    // Removes a specified quantity of an ingredient from the inventory
    public void removeIngredient(String name, double amount) 
    { 
        for (Ingredient ingredient : ingredients) 
        {
            if (ingredient.getName().equals(name)) 
            {
                ingredient.getQuantity().subtract(amount);

                if (ingredient.getQuantity().getAmount() <= 0) { ingredient.remove(ingredient); }
                
                return;
            }
        }
    }
    // Returns the ingredient
    public Ingredient getIngredient(String name) 
    {
        for (Ingredient ingredient : ingredients) 
        {
            if (ingredient.getName().equals(name)) 
            {
                return ingredient;
            }
        }
        return null; // Or throw an exception if the ingredient is not found
    }
    

    // Sorts ingredients by quantity and displays them
    public void sortByQuantity() 
    {

        //List holding the quantity of the ingredients
        List<Ingredient> QuantitySortList = ingredients;

        //Bubble Sorts QUANTITY from low to high amount. Then prints the sorted list.
        sort.bubbleSort(QuantitySortList, QuantitySortList.size());
        System.out.println("Ingredients Sorted (Low to High):");
        for (int b = 0; b < QuantitySortList.size(); b++)
        {
            System.out.println(QuantitySortList.get(b));
        }

    }


        // Sorts ingredients by name and displays them
    public void sortByName() 
    {
        List<Ingredient> sortIngredients = ingredients;

        //sorting by name code
        int n = sortIngredients.size();
        Ingredient temp = null;

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                //Gets the item at position i & j in the sortIngredients list, then gets the ingredientname.
                if (sortIngredients.get(i).getName().compareTo(sortIngredients.get(j).getName()) > 0) 
                {
                    temp = sortIngredients.get(i);
                    sortIngredients.set(i, sortIngredients.get(j));
                    sortIngredients.set(j, temp);
                }
            }
        }
        // Prints out sorted list
        System.out.println("Ingredients sorted by name:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(sortIngredients.get(i));
        }
    
    }

    // Displays a list of ingredients
    public void displayIngredients() 
    {
        System.out.println("Current Ingredients in inventory:");

        for (Ingredient ingredient : ingredients) { System.out.println(ingredient.getName() + " - " + ingredient.getQuantity().getAmount() + " " + ingredient.getQuantity().getUnit()); }
    }

    // Compares the inventory with the ingredients required for a meal
    public void compareIngredients(Meal meal) 
    {
        System.out.println("Comparing ingredients for: " + meal.getName());
        for (Ingredient requiredIngredient : meal.getRequiredIngredients()) 
        {
            boolean foundReq = false;
            for (Ingredient curIngredient : ingredients) 
            {
                if (curIngredient.getName().equals(requiredIngredient.getName()) && curIngredient.getQuantity().getUnit().equals(requiredIngredient.getQuantity().getUnit())) 
                {
                    foundReq = true;
                    break;
                }
                
            }
            
            // if ingredient is not found in the inventory at all or there's not enough of ingredient 
            if (!foundReq) { System.out.println("You need " + requiredIngredient.getQuantity().getAmount() + " " + requiredIngredient.getQuantity().getUnit() + " of " + requiredIngredient.getName()); }
        }
    }
}
