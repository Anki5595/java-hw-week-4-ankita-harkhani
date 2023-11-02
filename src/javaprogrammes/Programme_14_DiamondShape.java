package javaprogrammes;

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
        int n = 7; // Adjust n to control the size of the diamond
        // Upper part of the diamond
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }

        // Lower part of the diamond
        i = n - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i--;
        }
    }
}
//        Scanner sc = new Scanner(System.in); // scanner creation
//        System.out.println("Enter number of rows: "); // print a statement to enter a data
//        int number = sc.nextInt(); // going to next line
//        diamond(number); // calling a method
//        sc.close(); // close scanner
//    }
//
//    public static void diamond(int rows) {
//        //Nested for loop
//        //Top half of the diamond
//        for (int i = 1; i <= rows; i++) { // for loop
//            for (int a = 1; a <= rows - i; a++) {
//                System.out.print(" "); // print lending space
//            }
//            for (int b = 1; b <= 2 * i - 1; b++) {
//                System.out.print("*"); // print *
//            }
//            System.out.println(); // print statement use to add new line after each row
//        }
//
//        //Bottom half of diamond
//        for (int i = rows-1; i >= 1; i--) {
//            for (int a = 1; a <= rows - i; a++) {
//                System.out.print(" "); //print lending space
//            }
//            for (int b = 1; b <= 2 * i - 1; b++) {
//                System.out.print("*"); // print *
//            }
//            System.out.println(); // print statement use to add new line after each row
//        }
//    }

