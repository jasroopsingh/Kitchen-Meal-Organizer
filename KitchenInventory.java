import java.util.List;


public class KitchenInventory 
{
    //contain functions to sort by name/quantity
    //compare for req ingredients
    static void bubbleSort(Quantity list[], int n)
    {
        int count = 0;

        for (int i = 0; i < n-1; i++)
            if(list[i].getAmount() > list[i + 1].getAmount())
            {
                Quantity temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
                    count = count + 1;

            }

            if (count == 0)
                return;
            bubbleSort(list, n-1);
    }

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

        //List holding the quantity of the ingredients
        Quantity[] QuantityList;
        QuantityList = new Quantity[5];

        // Testing Lines:
        Quantity tomatoQuantity = new Quantity(10, "Tomatoes");
        Ingredient tomato = new Ingredient("Tomatoes", tomatoQuantity);
        QuantityList[0] = tomatoQuantity;

        //Potato
        Quantity potatoQuantity = new Quantity(15, "Potatoes");
        Ingredient potato = new Ingredient("Potatoes", potatoQuantity);
        QuantityList[1] = potatoQuantity;

        //Radish
        Quantity radishQuantity = new Quantity(5, "Radishes");
        Ingredient radish = new Ingredient("Sliced Radish", radishQuantity);
        QuantityList[2] = radishQuantity;

        //Carrot
        Quantity carrotQuantity = new Quantity(5, "Carrots");
        QuantityList[3] = carrotQuantity;

        //Ginger
        Quantity gingerQuantity = new Quantity(5, "Ginger Roots");
        QuantityList[4] = gingerQuantity;

        //Bubble sort test
        bubbleSort(QuantityList, 5);

        System.out.println("Ingredients Sorted (Low to High):");
        for (int b = 0; b < QuantityList.length; b++)
        {
            System.out.println(QuantityList[b]);
        }
        // End of testing code

    }

    // Displays a list of ingredients
    public void displayIngredients(List<Ingredient> ingredientList) 
    { for (Ingredient ingredient : ingredientList)  { System.out.println(ingredient);} } // Print ingredient details

    // Compares the inventory with the ingredients required for a meal
    public void compareIngredients(Meal meal) 
    {

    }

    

}
