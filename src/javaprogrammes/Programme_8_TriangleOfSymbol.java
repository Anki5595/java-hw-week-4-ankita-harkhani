package javaprogrammes;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Programme_8_TriangleOfSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner to read data
        System.out.println("Enter number of rows: "); // print statement to enter a symbol
        int rows = scanner.nextInt(); // going to next line
        scanner.close(); //close scanner object // close scanner
        triangle(rows); // calling method to main method with parameter
    }

    public static void triangle(int rows) {
        //Nested for loop
        for (int i = 1; i <= rows; i++) { // for loop
            for (int a = 1; a <= i; a++)  {
                System.out.print("@"); // print statement
            }
            System.out.println(); // print statement use to add new line after each row
        }
    }
}

