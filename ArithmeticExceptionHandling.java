// Illustrate a program to handle Arithmetic exception.
// The user enters two numbers Num1 and Num2.
// The division of Num1 and Num2 is displayed. If Num1 and Num2 are not integers,
// the program would throw a Number Format Exception. If Num2 were zero,
//  the program would throw an Arithmetic Exception. Display the exception.

import java.util.Scanner;

public class ArithmeticExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input for Num1
            System.out.print("Enter Num1: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            // Get user input for Num2
            System.out.print("Enter Num2: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            // Perform division and display the result
            int result = divide(num1, num2);
            System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            System.out.println("NumberFormatException: Please enter valid integers.");

        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("ArithmeticException: Division by zero is not allowed.");

        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    // Method to perform division and handle ArithmeticException
    private static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
