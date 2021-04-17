package home_work;

import java.util.Scanner;

public class DayOfWeek {
    private static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the day:");
        int numberOfDay = scanner.nextInt();
        System.out.println("Today is: " + calculateDay(numberOfDay));
    }

    public static String calculateDay(int dayNumber) {
        String dayName = "";
        for (String day : days) {
            dayName = days[dayNumber - 1];
        }
        return dayName;
    }
}
