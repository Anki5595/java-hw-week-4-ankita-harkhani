package javaprogrammes;

import java.util.Scanner;

/**
 * . Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class Programme_6_TriangleOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner creation to read a data
        System.out.println("Enter number of rows: "); // print statement to enter rows
        int rows = scanner.nextInt(); // going to the next line
        scanner.close(); // scanner closer
        pattern(rows); // calling a method directly to main method
    }

    public static void pattern(int rows) {
        for (int i = 1; i <= rows; i++) { // for loop
            for (int a = 1; a <= i; a++) {
                System.out.print(a); // print statement for output
            }
            System.out.println(); // print statement use to add new line after each row
        }
    }

}
