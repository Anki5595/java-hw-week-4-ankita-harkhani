package javaprogrammes;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * <p>
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be entered number #1:, the next Enter number #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge
 */

public class Programme_1_ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner creation to read the data
        System.out.println("Please enter 10 numbers: ");
        Programme_1_ReadingUserInputChallenge obj = new Programme_1_ReadingUserInputChallenge(); // calling instance method to main method via object
        obj.m1(scanner);
        scanner.close();
    }

    public void m1(Scanner scanner) {
        int x = 1; // number entering starts with 1
        int sum = 0; // assign value for sum of variable

        while (x <= 10) { // while loop
            System.out.println("Enter number " + x + ":"); // body in while loop
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt(); // if body
                sum += number; // logic for sum of the number
                x++;
            } else {
                System.out.println("Invalid Input. Please enter a valid number"); // else body

            }
        }
        System.out.println("sum of the entered number: " + sum); // print a statement for sum

    }
}



