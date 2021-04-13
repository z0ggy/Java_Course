package chapter3;

import java.util.Scanner;

/*
LOGICAL OPERATORS:
TO qualify for a loan, a person must make at least $30000
and have been working at their current job for at least 2 years
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer:");
        int workingYears = scanner.nextInt();
        scanner.close();

        //Make decision
        if (salary >= requiredSalary && workingYears >= requiredYearsEmployed) {
            System.out.println("Congrats! You qualify for the loan");
        } else {
            System.out.println("Sorry you must earn at least $" + requiredSalary + " to qualify for the loan");
        }
    }
}
