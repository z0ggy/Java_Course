package snippets;

public class UsefulTricks {

    public static void main(String[] args) {

        // For example, if we wanted a random double value between 0 and 9, we would multiply Math.random() by 10
        // Random double value between 0 and 9
        double a = Math.random() * 10;


        // If we wanted a random int value between 0 and 9, we would need to implement the (int) casting operator
        // in our expression like so:
        // Random int value between 0 and 9
        int b = (int) (Math.random() * 10);


        //If we wanted our range to start at 1 and end at 10, we would have to add 1
        // to the end of our previous expression:
        // Random int value between 1 and 10
        // If we placed the + 1 inside the parentheses, we would get a random int between 0 and 10
        int c = (int) (Math.random() * 10) + 1;


        /*
        Using addition also gives us the ability to start the range at any number. What if we wanted an int value
        in the range of 10 up to and including 20? We would have to implement the algorithm
        (Math.random() * (maxValue - minValue + 1)) + minValue.
         */
        // Random int value between 10 and 20
        int d = (int) (Math.random() * 11) + 10;

    }
}
