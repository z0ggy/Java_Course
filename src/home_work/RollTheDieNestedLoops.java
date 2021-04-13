package home_work;

import java.util.Random;

public class RollTheDieNestedLoops {

    public static void main(String[] args) {

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for (int i = 0; i < maxRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace += die;

            System.out.printf("Roll #%d: You've rolled a %d. %n", i, die);

            if (currentSpace == lastSpace) {
                System.out.println("You are on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.println("Unfortunately, that takes you past " + lastSpace + "spaces. You lose!");
                break;
            } else if (i == maxRolls && currentSpace < lastSpace) {
                System.out.println("You are on space " + currentSpace + ".");
                System.out.println("Unfortunately, you did not make it to all " + lastSpace + " spaces. You lose!");
            } else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You are now on space " + currentSpace + " and have " + spacesToGo);
            }
            System.out.println();
        }
    }
}
