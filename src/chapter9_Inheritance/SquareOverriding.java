package chapter9_Inheritance;

public class SquareOverriding extends Rectangle {
    //Override same name different body
    @Override
    public double calculatePerimeter() {
        return side * length;
    }
}
