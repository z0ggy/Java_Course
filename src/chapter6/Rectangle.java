package chapter6;

/*
Write a class that describes the fields and methods of a rectangle.
Write another class that creates instances of the Rectangle class to find the total area of two rooms in a house.
 */
public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length; //can be set this way
        setWidth(width); //or can be set this way. These are only different here to show alternative options

    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return (length * width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
