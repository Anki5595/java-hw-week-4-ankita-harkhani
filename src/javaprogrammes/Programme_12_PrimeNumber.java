package javaprogrammes;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

import java.util.Scanner;

public class Programme_12_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        Programme_12_PrimeNumber obj = new Programme_12_PrimeNumber();
        obj.primeNumber(number);
        sc.close();
    }

    public void primeNumber(int number) {
        if (number <= 1) { // 1 and less than one is not a prime number
            System.out.println(number + " is not a prime number"); // printing a statement for not a prime number
            return; // exit from the method when number is less than 2
        }

        boolean isPrime = true; // Assume the number is prime initially

        for (int i = 2; i < number; i++) { // for loop
            if (number % i == 0) {
                isPrime = false; // If number is divisible by i, it is not a prime number
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}

