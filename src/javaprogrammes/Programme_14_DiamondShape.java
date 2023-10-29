package javaprogrammes;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

public class Programme_14_DiamondShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner creation
        System.out.println("Enter number of rows: "); // print a statement to enter a data
        int number = sc.nextInt(); // going to next line
        diamond(number); // calling a method
        sc.close(); // close scanner
    }

    public static void diamond(int rows) {
        //Nested for loop
        //Top half of the diamond
        for (int i = 1; i <= rows; i++) { // for loop
            for (int a = 1; a <= rows - i; a++) {
                System.out.print(" "); // print lending space
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("*"); // print *
            }
            System.out.println(); // print statement use to add new line after each row
        }

        //Bottom half of diamond
        for (int i = rows-1; i >= 1; i--) {
            for (int a = 1; a <= rows - i; a++) {
                System.out.print(" "); //print lending space
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("*"); // print *
            }
            System.out.println(); // print statement use to add new line after each row
        }
    }
}
