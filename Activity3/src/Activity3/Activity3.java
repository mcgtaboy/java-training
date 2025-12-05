/**
 * 
 */
package Activity3;


import java.util.Scanner;

public class Activity3 {

    // compute sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // compute difference 
    public static int difference(int a, int b) {
        return a - b;
    }

    // compute product
    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstint = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondint = input.nextInt();

        // Compute using methods
        int sum = sum(firstint, secondint);
        int difference = difference(firstint, secondint);
        int product = product(firstint, secondint);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        input.close();
    }
}
