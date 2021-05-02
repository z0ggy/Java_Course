package chapter8_DataTypes_and_Strings;

/*
Write a method that counts the number of words in a String and prints them individually on a new line.
 */
public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
    }

    /**
     * Splits a String into an array by tokenizing it.
     *
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;
        System.out.println(words.getClass().getSimpleName());

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
