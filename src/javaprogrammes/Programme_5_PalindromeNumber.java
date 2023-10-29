package javaprogrammes;

import java.util.Scanner;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to 11212.
 * Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, and 1001 etc.
 * Tip: Logic to check a palindrome number
 * Find the reverse of the given number. Store it in some variable, say reverse. Compare the number with the reverse.
 * If both are the same then the number is a palindrome otherwise it is not.
 * Tip: Logic to reverse a number
 * Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
 * Extract the last digit of the given number by performing the modulo division (remainder).
 * Store the last digit to some variable say lastDigit = num % 10.
 * Increase the place value of reverse by one.
 * To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
 * Add lastDigit to reverse.
 * Since the last digit of the number is processed, remove the last digit of num. To remove the last digit
 * divide number by 10.
 * Repeat steps until the number is not equal to (or greater than) zero.
 * A while loop would be good for this coding exercise.
 * Tip: Be careful with negative numbers. They can also be palindrome numbers.
 * Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number
 * with the starting number (parameter).
 * NOTE: The method isPalindrome needs to be defined as public static
 */

public class Programme_5_PalindromeNumber {
    public static boolean isPalindrome(int number) {
        // initialize variable
        int originalNumber = number; // original number for comparison
        int reverse = 0; // initialize a variable to store a reverse number
        while (number != 0) { // condition
            int lastDigit = number % 10; // extract the last digit of the number, logic given in question
            reverse = reverse * 10 + lastDigit; // reverse the number, logic given in question
            number /= 10; // remove the last digit by dividing the number by 10, logic given in question

        }
        if (originalNumber == reverse) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
        return originalNumber == reverse; // return statement
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner creation to read a data
        System.out.println("Enter a number: "); // print statement to enter a data by user
        int number = scanner.nextInt(); // going to the next line
        boolean result = isPalindrome(number); // calling static method directly to the main method
        if (result) {
            System.out.println(true); // printing statement if number is palindrome
        } else {
            System.out.println(false); // printing statement if number is not palindrome
        }
        scanner.close(); // close the scanner object
    }
}
