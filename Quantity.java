// Quantity.java
public class Quantity {
    private double amount;
    private String unit;

    public Quantity(double amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public void add(double amount) {
        this.amount += amount;
    }

    public void subtract(double amount) {
        this.amount -= amount;
    }

    @Override
    public String toString() {
        return amount + " " + unit;
    }
}
