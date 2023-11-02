package javaprogrammes;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Programme_3_VowelOfConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();
        if (input.length() == 1) {
            char character = input.charAt(0);
            checkLetter(character);
        } else {
            System.out.println("Error: Please enter a single character.");
        }
        scanner.close();
    }
    public static void checkLetter(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            char lowercaseChar = Character.toLowerCase(character); // Convert to lowercase for easy comparison

            if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u') {
                System.out.println("Input letter is a Vowel");
            } else {
                System.out.println("Input letter is a Consonant");
            }
        } else {
            System.out.println("Error: Please enter an alphabet letter.");
        }
    }
}