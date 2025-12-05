/**
 * 
 */
package Activity1;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your Name? ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}

