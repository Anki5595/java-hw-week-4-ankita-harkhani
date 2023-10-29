package javaprogrammes;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class Programme_15_LeftAngleTriangleShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner creation to read data
        System.out.println("Enter Number of Rows: "); // printing a statement to enter a data
        int rows = scanner.nextInt(); // going into next line
        Programme_15_LeftAngleTriangleShape obj = new Programme_15_LeftAngleTriangleShape();
        obj.triangle(rows);
        scanner.close(); // close scanner object

    }

    public void triangle(int rows) {
        //nested for loop
        for (int i = 1; i <= rows; i++) {
            for (int a = 1; a <= i; a++){
                System.out.print("* "); //Print statement
            }
            System.out.println(); // print statement use to add new line after each row

        }
    }
}
