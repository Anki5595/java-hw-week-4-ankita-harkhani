package javaprogrammes;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner creation to read a data
        System.out.println("Enter a number: "); //Printing a statement
        int number = scanner.nextInt(); // going to the next line
        scanner.close(); // scanner close
        Programme_10_ArmstrongNumber obj = new Programme_10_ArmstrongNumber(); // calling instance method via object
        obj.armstrongNumber(number);
    }

    public void armstrongNumber(int number) {
        //Initialize a variable
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length(); // return the length of the String representation of the number
        int sum = 0;

        while (number > 0) { // While loop
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits); //Method used to calculate Armstrong number
            number /= 10;

        }
        // check and printing a statement for armstrong number or not
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }

    }
}
