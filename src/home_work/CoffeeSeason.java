package home_work;

import java.util.Scanner;

public class CoffeeSeason {

    public static void main(String[] args) {

        // 1 ask udr for season of the year
        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2 Ask user for for a whole number
        System.out.println("Enter a whole number: ");
        int cups = scanner.nextInt();

        // 3 Ask user for adjective
        System.out.println("Enter adjective");
        String adjective = scanner.next();

        // Display output
        System.out.println("On a " + adjective +" "+ season + " day, I drink a minimum of " + cups + " of coffee." );

    }
}
