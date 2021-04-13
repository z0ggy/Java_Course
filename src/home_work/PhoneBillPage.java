package home_work;

public class PhoneBillPage {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBillPage() {
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBillPage(int id) {
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBillPage(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    //Getters
    public double getBaseCost() {
        return baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    //Calculate functions
    public double calculateOverage() {
        if (minutesUsed <= allottedMinutes) {
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax() {
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    //Print output
    public void printItemizedBill() {
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Overage Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Overage Total: $" + String.format("%.2f", calculateTotal()));
    }
}
