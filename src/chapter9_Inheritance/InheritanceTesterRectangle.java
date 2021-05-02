package chapter9_Inheritance;

public class InheritanceTesterRectangle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        SquareOverloading square = new SquareOverloading();
        square.print("square");
    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        SquareOverriding square = new SquareOverriding();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}
