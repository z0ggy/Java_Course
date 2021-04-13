package home_work;

import java.util.Scanner;

/*
Calculate the final total of someone's cell phone bill. Allow the operator to input the plan fee and the number of
overage minutes. Charge user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
Create separate methods to calculate the tax, overage fees, and final total. Print the itemized bill.
 */
public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);
    static double pricePerMinute = 0.25;

    public static void main(String[] args) {

        //initialize what we know
        double plan = getPlan();
        double overage = getOverageMin();
        scanner.close();

        //initialize what we do not know
        double overageFee = calculateOverageFee(overage);
        double tax = taxCalculator(plan, overageFee);

        //Output total price
        total(plan, overageFee, tax);
    }

    public static double taxCalculator(double basePlan, double overageMinutes) {
        double tax = 0.15;
        System.out.println(tax);
        return (basePlan + overageMinutes) * tax;
    }

    public static double calculateOverageFee(double overageMinutes) {
        return overageMinutes * pricePerMinute;
    }

    public static double getPlan() {
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    public static int getOverageMin() {
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    public static void total(double plan, double overage, double tax) {
        double total = plan + overage + tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: " + plan);
        System.out.println("Overage: " + overage);
        System.out.println("Tax: " + tax);
        System.out.print("Total: " + total);
    }
}
