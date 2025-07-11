package CoreJava;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Display operation choices
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Get user's choice
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Perform the chosen operation
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("\nResult: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("\nResult: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("\nResult: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("\nResult: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("\nError: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("\nInvalid choice. Please select a valid operation.");
        }

        scanner.close();
    }
}
