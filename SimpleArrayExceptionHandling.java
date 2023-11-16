// The program will use a predefined array of integers. The user will be prompted to 
// enter an index to access an element from the array. The program should handle 
// potential exceptions gracefully, such as when the user enters a non-integer value 
// for the index or when the index is out of bounds for the predefined array.
// Program Requirements:
// 1.	Define a predefined array of integers (e.g., {10, 20, 30, 40, 50}).
// 2.	The user to enter an index to access an element from the array.
// 3.	Use try-catch blocks to handle potential exceptions:
//      •	If the user enters a non-integer value for the index, catch and handle NumberFormatException.
//      •	If the user enters an index that is out of bounds for the predefined array, catch and handle ArrayIndexOutOfBoundsException.
//      •	Handle any other unexpected exceptions and display appropriate error messages.
// 4.	Display the value of the array element at the specified index if no exceptions occur.
// 5.	Ensure proper resource management, such as closing any opened resources.



import java.util.Scanner;

public class SimpleArrayExceptionHandling {

    public static void main(String[] args) {
        // Predefined array
        int[] numbers = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input for the index to access
            System.out.print("Enter the index to access (0 to " + (numbers.length - 1) + "): ");
            int index = Integer.parseInt(scanner.nextLine());

            // Attempt to access an element at the specified index
            int value = numbers[index];

            // Display the value
            System.out.println("Value at index " + index + ": " + value);

        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            System.out.println("NumberFormatException: Please enter a valid integer.");

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException: Index is out of bounds.");

        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
