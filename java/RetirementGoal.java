import java.util.Scanner;

public class RetirementGoal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user for the number of years until retirement
        int yearsUntilRetirement = 0;
        while (yearsUntilRetirement <= 0) {
            System.out.print("Enter the number of years until retirement: ");
            yearsUntilRetirement = sc.nextInt();
            if (yearsUntilRetirement <= 0) {
                System.out.println("Invalid sc. Please enter a positive integer.");
            }
        }

        // Prompt the user for the amount of money that can be saved annually
        double annualSavings = 0.0;
        while (annualSavings <= 0) {
            System.out.print("Enter the amount of money that can be saved annually: $");
            annualSavings = sc.nextDouble();
            if (annualSavings <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }

        // Calculate the amount of money the user will have at retirement
        double totalSavings = annualSavings * yearsUntilRetirement;

        // Display the amount of money the user will have at retirement
        System.out.printf("If you save $%,.2f every year for %d years, you will have $%,.2f at retirement.%n",
                annualSavings, yearsUntilRetirement, totalSavings);
        while (annualSavings <= 0) {
            System.out.print("Enter the amount of money that can be saved annually: $");
            annualSavings = sc.nextDouble();
            if (annualSavings <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }

        // Calculate the amount of money the user will have at retirement
        double interestRate = 0.04;
        double balance = 0.0;

        for (int i = 1; i <= yearsUntilRetirement; i++) {
            balance += annualSavings;
            balance += balance * interestRate;
        }

        totalSavings = balance;

        // Display the amount of money the user will have at retirement
        System.out.printf("If you save $%,.2f every year for %d years with an annual interest rate of %.2f%%, "
                + "you will have $%,.2f at retirement.%n", annualSavings, yearsUntilRetirement, interestRate * 100,
                totalSavings);
        sc.close();
    }
}
