package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    static int hours;
    static double rate;
    static double grossPay;

    public static void main(String[] args) {

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //2. Get the hourly rate
        System.out.println("Enter the employee pay rate");
        rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        grossPay = hours * rate;

        //4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
