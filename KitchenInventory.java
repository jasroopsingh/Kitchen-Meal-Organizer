public class KitchenInventory 
{
    //contain functions to sort by name/quantity
    //compare for req ingredients

    // Adds an ingredient to the inventory
    public void addIngredient() {}

    // Removes a specified quantity of an ingredient from the inventory
    public void removeIngredient() {}

    // Sorts ingredients by name and displays them
    public void sortByName() 
    {
        Ingredient[] NameList;
        NameList = new Ingredient[5];



    }

    // Sorts ingredients by quantity and displays them
    public void sortByQuantity() 
    {

        Ingredient[] QuantityList;
        QuantityList = new Ingredient[5];

        Quantity tomatoQuantity = new Quantity(10, "Jars");
        Ingredient tomato = new Ingredient("Tomatoes", tomatoQuantity);

        QuantityList[1] = tomato;

        System.out.println(QuantityList[1]);

        

    }

    // Displays a list of ingredients
    public void displayIngredients() {}

    // Compares the inventory with the ingredients required for a meal
    public void compareIngredients(Meal meal) {}

    

}
