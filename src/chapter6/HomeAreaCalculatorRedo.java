package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //create instance of current class to run getRoom method because kitchen and bathroom aren't static
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        calculator.scanner.close();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
    }

    public Rectangle getRoom() {

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        //Return constructor instead od object
        //Rectangle room = new Rectangle(length, width);
        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() * rectangle2.calculateArea();
    }
}
