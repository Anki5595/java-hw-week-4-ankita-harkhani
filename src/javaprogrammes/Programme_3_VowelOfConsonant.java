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
        Scanner scanner = new Scanner(System.in); //scanner creation
        System.out.println("Enter letter: "); // enter letter
        char character = scanner.nextLine().charAt(0); // using char data type for entering letter
        Programme_3_VowelOfConsonant obj = new Programme_3_VowelOfConsonant(); // calling instance method to main method via object
        obj.checkLetter(character);
        scanner.close(); //close scanner
    }

    public void checkLetter(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) { // condition
            if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U') {
                System.out.println("Input letter is Vowel"); // printing message for vowel letters
            } else {
                System.out.println("Error: Please enter a single character"); // error message if input is not a single character
            }
        } else {
            System.out.println("Input letter is Consonant"); // printing message for consonant letter
        }
    }
}
