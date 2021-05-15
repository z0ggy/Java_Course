package home_work.fruit_polymorphism;

public class Apple extends Fruit {

    public Apple() {
        setCalories(100);
    }

    public void removeSeeds() {
        System.out.println("Apple has no seeds");
    }

    @Override
    public void makeJuice() {
        System.out.println("This is the apple juice");
    }
}
