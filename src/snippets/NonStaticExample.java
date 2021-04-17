package snippets;

public class NonStaticExample {

    int firstNumber;
    int secondNumber;

    public NonStaticExample(int num1, int num2) {
        firstNumber = num1;
        secondNumber = num2;
    }

    // non-static method
    public int returnSum() {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        // Create an object
        NonStaticExample myNumbers = new NonStaticExample(2, 5);
        // Call a non-static method on object
        int sum = myNumbers.returnSum();
        System.out.println(sum); // Prints: 7
    }
}