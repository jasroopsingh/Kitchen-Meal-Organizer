import java.util.ArrayList;
import java.util.List;


public class KitchenInventory 
{
    //contain functions to sort by name/quantity
    //compare for req ingredients

    // Adds an ingredient to the inventory
    public void addIngredient(Ingredient ingredient) 
    { 
        //ingredients.add(ingredient);
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


        Quantity[] QuantityList;
        QuantityList = new Quantity[5];

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
