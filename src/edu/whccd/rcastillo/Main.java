package edu.whccd.rcastillo;

import java.util.Scanner;

/* Custom App 6 is to exhibit the use of Debugging and Testing.
    Author: Richard Castillo
 */

public class Main {

    public static void main(String[] args) {

        // 2. fix the runtime error caused by the line below by deleting, commenting, or encapsulating it in a try-catch block
        //getDouble(null, null); Just commented out?


        // 3. fix the logic error so it calls the getDouble() on the 100th iteration
        for (int i = 1; i <= 100; i++) {
            if (i == 100) // was 50, changed to 100
            {
                Scanner sc = new Scanner(System.in);
                getDouble(sc, "Enter a double: ");
            } else {
                System.out.println(i);
            }
        }
    }

    // 1. fix the syntax errors in the method below
    public static double getDouble(Scanner sc, String prompt) {
        double d = 0.0; //missing double
        while (true) {
            System.out.print(prompt); // missing SemiColon

            if (sc.hasNextDouble()) { //missing right bracket
                d = sc.nextDouble();
                sc.nextLine();
                return d;
            } else {
                System.out.println("Error! Invalid number. Try again.");
                sc.nextLine();
            }
        }
    }
}