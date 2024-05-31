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

    // Sorts ingredients by quantity and displays them
    public void sortByQuantity() 
    {

        //List holding the quantity of the ingredients
        Quantity[] QuantityList;
        QuantityList = new Quantity[5];


        // Testing Lines:
        // These lines declare an ingredient and their quantity.
        Quantity tomatoQuantity = new Quantity(10, "Tomatoes");
        Ingredient tomato = new Ingredient("Tomatoes", tomatoQuantity);
        QuantityList[0] = tomatoQuantity;


        //Potato
        Quantity potatoQuantity = new Quantity(15, "Potatoes");
        Ingredient potato = new Ingredient("Potatoes", potatoQuantity);
        QuantityList[1] = potatoQuantity;


        //Radish
        Quantity radishQuantity = new Quantity(2, "Radishes");
        Ingredient radish = new Ingredient("Sliced Radish", radishQuantity);
        QuantityList[2] = radishQuantity;


        //Carrot
        Quantity carrotQuantity = new Quantity(4, "Carrots");
        Ingredient carrot = new Ingredient("Carrot", carrotQuantity);
        QuantityList[3] = carrotQuantity;


        //Ginger
        Quantity gingerQuantity = new Quantity(5, "Ginger Roots");
        Ingredient ginger = new Ingredient("Ginger root", gingerQuantity);
        QuantityList[4] = gingerQuantity;


        //Bubble Sorts QUANTITY from low to high amount. Then prints the sorted list.
        sort.bubbleSort(QuantityList, 5);
        System.out.println("Ingredients Sorted (Low to High):");
        for (int b = 0; b < QuantityList.length; b++)
        {
            System.out.println(QuantityList[b]);
        }
        // End of testing code
    }


        // Sorts ingredients by name and displays them
    public void sortByName() 
    {
        Ingredient[] sortIngredients = new Ingredient[5];

        // Testing lines, these lines declare an ingredient and their quality
        Quantity tomatoQuantity = new Quantity(10, "Tomatoes");
        Ingredient tomato = new Ingredient("Tomatoes", tomatoQuantity);
        sortIngredients[0] = tomato;

        //Potato
        Quantity potatoQuantity = new Quantity(15, "Potatoes");
        Ingredient potato = new Ingredient("Potatoes", potatoQuantity);
        sortIngredients[1] = potato;      

        //Radish
        Quantity radishQuantity = new Quantity(5, "Radishes");
        Ingredient radish = new Ingredient("Sliced Radish", radishQuantity);
        sortIngredients[2] = radish;

        //Carrot
        Quantity carrotQuantity = new Quantity(5, "Carrots");
        Ingredient carrot = new Ingredient("Carrot", carrotQuantity);
        sortIngredients[3] = carrot;

        //Ginger
        Quantity gingerQuantity = new Quantity(5, "Ginger Roots");
        Ingredient ginger = new Ingredient("Ginger root", gingerQuantity);
        sortIngredients[4] = ginger;


        //sorting by name test
        int n = sortIngredients.length;
        Ingredient temp = null;

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if (sortIngredients[i].getName().compareTo(sortIngredients[j].getName()) > 0) //Compare to cannot compare ingredients
                {
                    temp = sortIngredients[i];
                    sortIngredients[i] = sortIngredients[j];
                    sortIngredients[j] = temp;
                }
            }
        }

        System.out.println("Ingredients sorted by name:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(sortIngredients[i]);
        }
    
    }

    // Displays a list of ingredients
    public void displayIngredients() 
    {
        System.out.println("Current Ingredients in inventory:");
        for (Ingredient ingredient : ingredients) 
        {
            System.out.println(ingredient.getName() + " - " + ingredient.getQuantity().getAmount() + " " + ingredient.getQuantity().getUnit());
        }
    }

    // Compares the inventory with the ingredients required for a meal
    public void compareIngredients(Meal meal) 
    {

    }
}
