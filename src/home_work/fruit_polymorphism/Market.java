package home_work.fruit_polymorphism;

public class Market {

    public static void main(String[] args) {

        Fruit apple = new Apple();
        apple.makeJuice();

        apple = new Apple();
        apple.makeJuice();
        ((Apple) apple).removeSeeds();
    }
}
