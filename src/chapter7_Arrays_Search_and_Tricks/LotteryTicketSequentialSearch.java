package chapter7_Arrays_Search_and_Tricks;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicketSequentialSearch {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];

        //use random class for generate random numbers
        Random random = new Random();

        //create a loop for generate 6 numbers
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            /*
            Generate random number then search to make sure it does not already exist in the array.
            If it does, regenerate and search again.
             */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));

            //Number is unique if we get here. Add it to the array.
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     *
     * @param array             Array to search through
     * @param numberToSearchFor value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {
        //This is called an enhanced loop.
        // it iterates through array and each time assigns the current element
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        //If we have reached this point, then the entire array was searched and the value was not found
        return false;
    }

    //This is binary search
    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        //Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0) {
            return true;
        } else return false;
    }

    public static void printTicket(int[] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");

        }
    }
}
