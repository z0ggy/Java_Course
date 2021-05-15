package chapter11_a_Abstraction;

/*
TEMPLATES
Abstract classes and methods are templates for implements by subclasses

ABSTRACT CLASSES
cannot be instantiated only used as superclass
 */
public class ShapeTester {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        double area = rectangle.calculateArea();
        System.out.println("Area is " + area);
    }
}
