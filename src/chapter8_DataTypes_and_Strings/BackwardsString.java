package chapter8_DataTypes_and_Strings;

/*
Write a method that prints a given String backwards. For example, if given camel, it prints
lemac.
 */
public class BackwardsString {
    public static void main(String[] args) {
        reverseString("Hello TAU!");
    }

    /**
     * Prints a String in reverse order
     *
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
