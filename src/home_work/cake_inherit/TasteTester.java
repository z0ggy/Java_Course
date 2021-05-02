package home_work.cake_inherit;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake cake1 = new BirthdayCake();
        cake1.setFlavor("Vanilla");
        cake1.setPrice(60);
        cake1.setCandles(18);
        System.out.println("The birthday cake is: ");
        System.out.println(cake1.getFlavor());
        System.out.println(cake1.getCandles());
        System.out.println(cake1.getPrice());
    }
}
