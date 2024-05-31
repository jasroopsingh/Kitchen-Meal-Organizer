
public class Ingredient 
{
    /*
    * Represents an ingredient with a name and quantity.
    */
    
    private String name; // Name of the ingredient
    private Quantity quantity; // Quantity of the ingredient

    public Ingredient(String name, Quantity quantity) 
    {
        this.name = name; // Initialize name
        this.quantity = quantity; // Initialize quantity
    }

    // Returns the name of the ingredient
    public String getName() { return name; }
    
    // Returns the quantity of the ingredient
    public Quantity getQuantity() { return quantity; }

    // Returns a string representation of the ingredient
    @Override
    public String toString() { return name + ": " + quantity; }

    public void remove(Ingredient ingredient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
