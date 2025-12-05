/**
 * 
 */
package Activity2;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read age as String
        System.out.print("Enter your age: ");
        String ageString = input.nextLine();

        try {
            // Convert String to integer
            int ageInt = Integer.parseInt(ageString);

            // Convert integer to double
            double ageDouble = (double) ageInt;

            // Display both
            System.out.println("Your age as int: " + ageInt);
            System.out.println("Your age as double: " + ageDouble);
        	} 
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid whole number for age.");
        }
    }
}



