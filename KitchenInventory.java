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
        //QuantityList[0] = tomatoQuantity;


        //Potato
        Quantity potatoQuantity = new Quantity(15, "Potatoes");
        Ingredient potato = new Ingredient("Potatoes", potatoQuantity);
        //QuantityList[1] = potatoQuantity;


        //Radish
        Quantity radishQuantity = new Quantity(2, "Radishes");
        Ingredient radish = new Ingredient("Sliced Radish", radishQuantity);
        //QuantityList[2] = radishQuantity;


        //Carrot
        Quantity carrotQuantity = new Quantity(4, "Carrots");
        Ingredient carrot = new Ingredient("Carrot", carrotQuantity);
        //QuantityList[3] = carrotQuantity;


        //Ginger
        Quantity gingerQuantity = new Quantity(5, "Ginger Roots");
        Ingredient ginger = new Ingredient("Ginger root", gingerQuantity);
        //QuantityList[4] = gingerQuantity;


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
        List<Ingredient> sortIngredients = ingredients;

        // Testing lines, these lines declare an ingredient and their quality
        Quantity tomatoQuantity = new Quantity(10, "Tomatoes");
        Ingredient tomato = new Ingredient("Tomatoes", tomatoQuantity);
        sortIngredients.add(tomato);

        //Potato
        Quantity potatoQuantity = new Quantity(15, "Potatoes");
        Ingredient potato = new Ingredient("Potatoes", potatoQuantity);
        sortIngredients.add(potato);      

        //Radish
        Quantity radishQuantity = new Quantity(5, "Radishes");
        Ingredient radish = new Ingredient("Sliced Radish", radishQuantity);
        sortIngredients.add(radish);

        //Carrot
        Quantity carrotQuantity = new Quantity(5, "Carrots");
        Ingredient carrot = new Ingredient("Carrot", carrotQuantity);
        sortIngredients.add(carrot);

        //Ginger
        Quantity gingerQuantity = new Quantity(5, "Ginger Roots");
        Ingredient ginger = new Ingredient("Ginger root", gingerQuantity);
        sortIngredients.add(ginger);


        //sorting by name test
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
                    //sortIngredients.get(i) = sortIngredients.get(j);
                    sortIngredients.set(i, sortIngredients.get(j));
                    //sortIngredients[j] = temp;
                    sortIngredients.set(j, temp);
                }
            }
        }

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
                else if (curIngredient.getQuantity().getAmount() < requiredIngredient.getQuantity().getAmount()) 
                {
                    System.out.println("You need " + (requiredIngredient.getQuantity().getAmount() - curIngredient.getQuantity().getAmount()) + " more " + requiredIngredient.getQuantity().getUnit() + " of " + requiredIngredient.getName());
                }
            }
            
            // if ingredient is not found in the inventory at all
            if (!foundReq) { System.out.println("You need " + requiredIngredient.getQuantity().getAmount() + " " + requiredIngredient.getQuantity().getUnit() + " of " + requiredIngredient.getName()); }
        }
    }
}
