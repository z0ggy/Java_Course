package chapter10_Polymorphism;
/*
Type vs Instance
An object can have a superclass type, and a subclass instance.

ACCESS
Polymorphic object can only access the method of their type (not their instance).
Casting is required in order to access the method of their instance

OVERRIDDEN METHODS
If a method is overridden by the subclass, the polymorphic object will execute
the overridden method at runtime.

instanceOF OPERATOR
The instanceOF operator is used to determine if an object is an instance of
a certain class
 */

public class Zoo {
    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        //can feed() rocky because of polymorphism technically rocky is a dog class
        feed(rocky);

        //Polymorphism
        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);


        sasha = new Cat();
        //sasha can use makeSound() cause is Animal type
        sasha.makeSound();
        //cast sasha to cat and it can use .scratch() from cat class
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("here's your cat food");
        }
    }
}
