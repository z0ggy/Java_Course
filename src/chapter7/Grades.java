package chapter7;

import java.util.Scanner;

/*
Create a program that allows a user to enter any number of grades
and provides them with their average score,
as well as the highest snd lowest scores
 */
public class Grades {

    private static int[] grades;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest grade is: " + getHighest());
        System.out.println("Lowest grades is: " + getLowest());
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade # " + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public static double calculateAverage() {
        return calculateSum() / grades.length;
    }

    public static int getHighest() {
        int max = grades[0];
        for (int number : grades) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int getLowest() {
        int min = grades[0];
        for (int number : grades) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
