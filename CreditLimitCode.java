import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for initial input
        System.out.print("Enter account number (-1 to end): ");
        int accountNumber = input.nextInt();

        // Loop until sentinel value (-1) is entered
        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            double beginningBalance = input.nextDouble();

            System.out.print("Enter total charges: ");
            double totalCharges = input.nextDouble();

            System.out.print("Enter total credits: ");
            double totalCredits = input.nextDouble();

            System.out.print("Enter credit limit: ");
            double creditLimit = input.nextDouble();

            // Calculate new balance
            double newBalance = beginningBalance + totalCharges - totalCredits;

            // Display information
            System.out.println("Account: " + accountNumber);
            System.out.println("Credit limit: " + creditLimit);
            System.out.printf("Balance: %.2f%n", newBalance);

            // Check if credit limit is exceeded
            if (newBalance > creditLimit) {
                System.out.println("Credit Limit Exceeded.");
            }

            // Prompt for next account number or sentinel value
            System.out.print("\nEnter account number (-1 to end): ");
            accountNumber = input.nextInt();
        }

        input.close();
    }
}
