package javaprogrammes;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */


public class Programme_11_EvenDigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        getEvenDigitSum(number);
        sc.close();
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            System.out.println("Invalid input");
            return -1; // return -1 for entering a negative numbers
        }
        int evenDigitSum = 0; // initialize the sum of even digits
        //While loop
        while (number > 0) {
            int value = number % 10; // get the last digit number
            if (value % 2 == 0) {
                evenDigitSum += value; // add even digits to the sum
            }
            number /= 10; // remove last digit
        }
        System.out.println("Sum of even digits: " + evenDigitSum); // print statement
        return evenDigitSum; // return the sum of even digit
    }
}


