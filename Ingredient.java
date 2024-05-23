// Ingredient.java
public class Ingredient {
    private String name;
    private Quantity quantity;

    public Ingredient(String name, Quantity quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + quantity;
    }
}
