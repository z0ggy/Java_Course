package home_work;

public class EnhancedPhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBillPage bills = new PhoneBillPage(123456);
        bills.setMinutesUsed(1000);
        bills.printItemizedBill();

    }
}
