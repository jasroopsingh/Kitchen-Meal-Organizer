public class Quantity 
{
    /*
    * Manages the quantity of the ingredients in the Kitchen.
    */

    private double amount; // Amount of the ingredient
    private String unit; // Unit of measurement for the ingredient


    // Example: Quantity mushroom = new Quantity(10, "Cans");
    public Quantity(double amount, String unit) 
    {
        this.amount = amount; // Initialize amount
        this.unit = unit; // Initialize unit
    }
    

    public double getAmount() { return amount; }

    public String getUnit() { return unit; }

    // Adds a specified amount to the quantity
    public void add(double amount) { this.amount += amount;}
    
    // Subtracts a specified amount from the avaiable quantity of the ingredients
    public void subtract(double amount) { this.amount -= amount; }

    // Returns a string representation of the quantity
    @Override
    public String toString() {
        return amount + " " + unit;
    }
}
