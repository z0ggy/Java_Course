package home_work.farm_abstract;

public class Farm {

    public static void main(String[] args) {
        Animal donald = new Duck();
        donald.makeSound();

        Duck daffy = new Duck();
        daffy.makeSound();

        Pig porky = new Pig();
        porky.makeSound();
    }
}